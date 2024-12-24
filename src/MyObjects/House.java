package MyObjects;

import java.util.ArrayList;
import java.util.Objects;

public class House {

    private ArrayList<Windows> windows = new ArrayList<>();
    private ArrayList<Walls> walls = new ArrayList<>();
    private ArrayList<Door> doors = new ArrayList<>();
    private ArrayList<Floor> floors = new ArrayList<>();
    private Roof roof;

    public House() {
        this.windows = new ArrayList<>();
        this.walls = new ArrayList<>();
        this.doors = new ArrayList<>();
        this.floors = new ArrayList<>();
    }


    public void assemblingHome(Materials windowMaterial, int windowQuantity, Materials wallsMaterial, int wallQuantity,
                           Materials roofMaterial, Materials doorMaterial, int doorQuantity,
                           Materials floorMaterial, int floorQuantity) {
        try{
            for (int i = 0; i < windowQuantity; i++) {
                windows.add(new Windows(windowMaterial));
            }

            for (int i = 0; i < wallQuantity; i++) {
                walls.add(new Walls(wallsMaterial));
            }

            for (int i = 0; i < doorQuantity; i++) {
                doors.add(new Door(doorMaterial));
            }

            for (int i = 0; i < floorQuantity; i++) {
                floors.add(new Floor(floorMaterial));
            }
            roof = new Roof(roofMaterial);
            checkHouseStructureViolation();
        } catch (ViolationOfConstruction e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.printf("Error %s\n", e.getMessage());
        } finally {
            System.out.println("House assembled successfully");
        }
    }

    public void checkHouseStructureViolation() throws ViolationOfConstruction {
         if (walls.isEmpty() || doors.isEmpty() || floors.isEmpty() || windows.isEmpty()) {
             throw new ViolationOfConstruction("Lack of components");
         }
    }

    public ArrayList<Windows> getWindows() {
        return windows;
    }

    public ArrayList<Walls> getWalls() {
        return walls;
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public Roof getRoof() {
        return roof;
    }

    public abstract static class CoveredObject implements CoveredObjects {

        private final Materials mainMaterial;
        private Materials coveringMaterial;

        CoveredObject(Materials mainMaterial, Materials coveringMaterial) {
            this.coveringMaterial = coveringMaterial;
            this.mainMaterial = mainMaterial;
        }

        public Materials getWindowMaterial() {
            return this.mainMaterial;
        }

        @Override
        public Materials getCoveringMaterial() {
            return this.coveringMaterial;
        }

        @Override
        public void setCoveringMaterial(Materials coveringMaterial) {
            this.coveringMaterial = coveringMaterial;
            System.out.printf("%s covered with %s\n", this.getClass().toString().split("\\.")[1].split("\\$")[1], coveringMaterial);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CoveredObject windows = (CoveredObject) o;
            return  mainMaterial.equals(windows.mainMaterial) &&
                    coveringMaterial.equals(windows.coveringMaterial);
        }

        @Override
        public int hashCode() {
            return Objects.hash(mainMaterial, coveringMaterial);
        }

        @Override
        public String toString() {
            return this.getClass().toString().split("\\.")[1] + "{" +
                    "main material='" + mainMaterial + '\'' +
                    ", covering material='" + coveringMaterial + '\'' +
                    '}';
        }

    }

    public static class Windows extends CoveredObject{

        Windows(Materials mainMaterial) {
            super(mainMaterial, Materials.NOTHING);
        }

    }

    public static class Floor extends CoveredObject {

        Floor(Materials mainMaterial) {
            super(mainMaterial, Materials.NOTHING);
        }

    }

    public record Roof(Materials mainMaterial) { }

    public record Door(Materials mainMaterial) { }

    public record Walls(Materials mainMaterial) { }

}
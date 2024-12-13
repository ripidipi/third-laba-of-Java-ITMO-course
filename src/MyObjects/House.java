package MyObjects;

import java.util.ArrayList;
import java.util.Objects;

public class House {

    ArrayList<Windows> windows;
    ArrayList<Walls> walls;
    ArrayList<Door> doors;
    ArrayList<Floor> floors;
    Roof roof;


    public void assemblingHome(Materials windowMaterial, int windowQuantity, Materials wallsMaterial, int wallQuantity,
                           Materials roofMaterial,  Materials doorMaterial, int doorQuantity,
                           Materials floorMaterial, int floorQuantity) {

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

    public static class Walls extends CoveredObject {

        Walls(Materials mainMaterial) {
            super(mainMaterial, Materials.NOTHING);
        }

    }

    public record Roof(Materials mainMaterial) { }

    public record Door(Materials mainMaterial) { }

    public record Floor(Materials mainMaterial) { }

}
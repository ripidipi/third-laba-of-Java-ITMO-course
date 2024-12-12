package MyObjects;

import java.util.ArrayList;

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

    public record Windows(Materials mainMaterial) { }

    public record Walls(Materials mainMaterial) { }

    public record Roof(Materials mainMaterial) { }

    public record Door(Materials mainMaterial) { }

    public record Floor(Materials mainMaterial) { }

}
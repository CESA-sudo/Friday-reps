import java.util.ArrayList;
public class MainB {
    public static void main(String[] args) {
        Room room1 = new Room(3,3);
        Room room2 = new Room(2,3);
        Room room3 = new Room(1,2);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        Building building = new Building(rooms,1);

        System.out.println("Total lamps in building: " + countLampsInBuilding(building));
        System.out.println("Total windows in building: " + countWindowsInBuilding(building));
        System.out.println("Total rooms in building: " + countRoomsInBuilding(building));
    }
    public static int countWindowsInBuilding(Building building) {
        int totalNumofWindows = 0;
        for(Room room : building.getRooms()){
            totalNumofWindows += room.getNumberOfLamps();
        }
        return totalNumofWindows;
    }
    public static int countLampsInBuilding(Building building) {
        int totalNumofLamps = 0;
        for(Room room : building.getRooms()){
            totalNumofLamps += room.getNumberOfLamps();
        }
        return totalNumofLamps;
    }
    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }
}

package lesson15.homeTask.secondTask;

/**
 * Created by Valik on 18.03.2018.
 */
public class GoogleAPI implements API {
    private Room[] rooms;


    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        int index = 0;
        for (Room room : rooms) {
            if (room.equals(rooms[index])) {
                count++;
            }
            index++;
        }
        Room[] newRooms = new Room[count];
        for(Room room : rooms){
            if(room.equals(rooms[index])){
                newRooms[index] = room;
            }
            index++;
        }
        return newRooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}

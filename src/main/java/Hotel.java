import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;
    private ArrayList<Conference> conferences;

    public Hotel(){
        this.rooms = new ArrayList<Room>();
        this.conferences = new ArrayList<Conference>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addConference(Conference conference) {
        conferences.add(conference);
    }

    public int roomCount() {
        return rooms.size();
    }

    public int conferenceCount() {
        return conferences.size();
    }

    public Booking bookRoom(Room room, Integer nights) {
        return new Booking(room, nights);
    }
    public ArrayList findVacantRooms() {
        ArrayList<Room> result = new ArrayList<Room>();
        for (Room room:rooms) {
            if (room.guestCount() == 0) {
                result.add(room);
            }
        }
        return result;
    }


}

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
}

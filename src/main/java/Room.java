import java.util.ArrayList;

public class Room {

    private Integer number;
    private Integer capacity;
    private ArrayList<Guest> guests;
    private String type;

    public Room(Integer capacity, Integer number, String type){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.number = number;
        this.type = type;


    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuests(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuests(Guest guests) {
        this.guests.clear();
    }
}

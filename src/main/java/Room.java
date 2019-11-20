import java.util.ArrayList;

public class Room {

    private Integer number;
    private Integer capacity;
    private ArrayList<Guest> guests;
    private String type;
    public Integer rate;

    public Room(Integer capacity, Integer number, String type, Integer rate){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.number = number;
        this.type = type;
        this.rate = rate;


    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuests(Guest guest) {
        if (this.guests.size() < this.capacity && this.guests.size() == 0) {
            this.guests.add(guest);
        }
    }

    public void removeGuests(Guest guests) {
        this.guests.clear();
    }


}

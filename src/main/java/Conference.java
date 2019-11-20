import java.util.ArrayList;

public class Conference {

    private Integer capacity;
    private ArrayList<Guest> guests;
    private String name;


    public Conference(Integer capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guests = new ArrayList<Guest>();

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

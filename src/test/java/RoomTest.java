import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Guest guests;
    private Room room;

    @Before

    public void before(){
        guests = new Guest("Bob");
        room = new Room(2, 3, "Single");
    }

    @Test
    public void addGuest(){
        room.addGuests(guests);
        room.addGuests(guests);
        room.addGuests(guests);
        assertEquals(2, room.guestCount());
    }

    @Test
    public void removeGuest(){
        room.addGuests(guests);
        room.removeGuests(guests);
        assertEquals(0, room.guestCount());
    }
}

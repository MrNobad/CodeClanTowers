import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {

    private Guest guest;
    private Hotel hotel;
    private Room room;
    private Room room1;
    private Room room2;
    private Room room3;
    private Conference conference;
    private Conference conference1;
    private Conference conference2;

    @Before
    public void before(){
        hotel = new Hotel();
        room = new Room(1, 3, "single");
        room1 = new Room(2, 4, "double");
        room2 = new Room(1, 5, "single");
        room3 = new Room(2, 6, "double");

        conference = new Conference(4, "Argyle Suite");
        conference1 = new Conference(5, "McTavish Suite");
        conference2 = new Conference(10, "Applecross Suite");

        hotel.addRoom(room1);
        hotel.addRoom(room);
        hotel.addRoom(room2);
        hotel.addRoom(room3);

        hotel.addConference(conference);
        hotel.addConference(conference1);
        hotel.addConference(conference2);
    }

    @Test
    public void hasRooms() {
        assertEquals(4, hotel.roomCount());
    }
    @Test
    public void hasConferences() {
        assertEquals(3, hotel.conferenceCount());
    }

}

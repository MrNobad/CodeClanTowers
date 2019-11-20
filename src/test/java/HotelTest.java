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
    private Booking booking;

    @Before
    public void before(){
        hotel = new Hotel();
        room = new Room(1, 3, "single", 70);
        room1 = new Room(2, 4, "double", 120);
        room2 = new Room(1, 5, "single", 80);
        room3 = new Room(2, 6, "double", 55);

        conference = new Conference(4, "Argyle Suite");
        conference1 = new Conference(5, "McTavish Suite");
        conference2 = new Conference(10, "Applecross Suite");

        guest = new Guest("John");

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

    @Test
    public void canCheckInGuest(){
        room.addGuests(guest);
        assertEquals(1, room.guestCount());
    }
    @Test
    public void canSeeIfFull() {
        room.addGuests(guest);
        room.addGuests(guest);
        room.addGuests(guest);
        assertEquals(1, room.guestCount());
    }

    @Test
    public void canCheckOutGuest(){
        room.addGuests(guest);
        room.removeGuests(guest);
        assertEquals(0, room.guestCount());
    }

    @Test
    public void canBookRoom(){
        Booking booking = hotel.bookRoom(room1, 2);
        assertEquals(2, booking.nightsBooked());
    }
    @Test
    public void showTotalBill() {
        Booking booking = hotel.bookRoom(room1, 2);
        assertEquals(240, booking.totalBill());
    }
    @Test
    public void doesReturnEmptyRooms() {
        room.addGuests(guest);
        assertEquals(3, hotel.findVacantRooms().size());
    }

}

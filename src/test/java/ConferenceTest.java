import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    private Guest guest;
    private Conference conference;

    @Before

    public void before(){
        guest = new Guest("Bob");
        conference = new Conference(3, "Argyle Suite");

    }

    @Test
    public void addGuest(){
        conference.addGuests(guest);
        assertEquals(1, conference.guestCount());
    }

    @Test
    public void removeGuest(){
        conference.addGuests(guest);
        conference.removeGuests(guest);
        assertEquals(0, conference.guestCount());
    }
}

import java.util.HashMap;

public class Booking {

    private Room bedroom;
    private Integer nights;

    public Booking(Room bedroom, Integer nights){
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public int nightsBooked() {
        return this.nights;
    }

    public int totalBill() {
        return nights * bedroom.rate;
    }

}

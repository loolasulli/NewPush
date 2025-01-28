package mentor18.FlightTicketOrder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserProfile {
    String email1;
    FlightClass flight;
    Destination destination;
    SeatPreference seat;
    int quantity;
    double totalPrice;

    public UserProfile(String email1, FlightClass flight, Destination destination,
                       SeatPreference seat, int quantity, double totalPrice) {
        this.email1 = email1;
        this.flight = flight;
        this.destination = destination;
        this.seat = seat;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    static Pattern email = Pattern.compile("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");

    public static boolean validateEmail(String email1) {
        if (email1 == null) {
            return false;
        }

        Matcher matcher = email.matcher(email1);
        return matcher.matches();
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "email1='" + email1 + '\'' +
                ", flight=" + flight +
                ", destination=" + destination +
                ", seat=" + seat +
                ", quantity=" + quantity +
                ", totalPrice= $" + totalPrice +
                '}';
    }
}

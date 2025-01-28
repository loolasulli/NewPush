package mentor18.FlightTicketOrder;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TicketOrder {
    public static void main(String[] args) {
        Pattern flight = Pattern.compile("ECONOMY|PREMIUM_ECONOMY|BUSINESS|FIRST_CLASS");
        Pattern destination = Pattern.compile("NEW_YORK|LONDON|TOKYO|PARIS|SYDNEY");
        Pattern seat = Pattern.compile("WINDOW|AISLE|MIDDLE");
        Pattern quantity = Pattern.compile("^[1-5]$");
        Pattern email = Pattern.compile("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");


            Scanner scanner = new Scanner(System.in);

            FlightClass flight1 = null;
            while (flight1 == null) {
                System.out.println("Select a flight class: ECONOMY, PREMIUM_ECONOMY, BUSINESS, FIRST_CLASS.");
                String flightUser = scanner.nextLine().toUpperCase();
                if (flight.matcher(flightUser).matches()) {
                    flight1 = FlightClass.valueOf(flightUser);
                } else {
                    System.out.println("404.. Not Found..");
                }
            }

            Destination destination1 = null;
            while (destination1 == null) {
                System.out.println("Select a destination: NEW_YORK, LONDON, TOKYO, PARIS, SYDNEY.");
                String destUser = scanner.nextLine().toUpperCase();
                if (destination.matcher(destUser).matches()) {
                    destination1 = Destination.valueOf(destUser);
                } else {
                    System.out.println("404.. Not Found..");
                }
            }

            SeatPreference seat1 = null;
            while (seat1 == null) {
                System.out.println("Choose a seat preference: WINDOW, AISLE, MIDDLE.");
                String seatUser = scanner.nextLine().toUpperCase();
                if (seat.matcher(seatUser).matches()) {
                    seat1 = SeatPreference.valueOf(seatUser);
                } else {
                    System.out.println("404.. Not Found..");
                }
            }

            Integer quantity1 = null;
            while (quantity1 == null) {
                System.out.println("Enter the number of tickets (valid range: 1–5):");
                String numUser = scanner.nextLine();
                if (quantity.matcher(numUser).matches()) {
                    quantity1 = Integer.parseInt(numUser);
                } else {
                    System.out.println("404.. Not Found..");
                }
            }

            String email1 = null;
            while (email1 == null) {
                System.out.println("Add email address (for booking confirmation).");
                String emailUser = scanner.nextLine();
                if (email.matcher(emailUser).matches()) {
                    email1 = emailUser;
                } else {
                    System.out.println("404.. Not Found..");
                }
            }
            double totalPrice = (destination1.getPrice() * flight1.getMultipliers() + seat1.getAddCharges()) * quantity1;

            UserProfile user = new UserProfile(email1, flight1, destination1, seat1, quantity1, totalPrice);
            System.out.println(user);
        }
    }
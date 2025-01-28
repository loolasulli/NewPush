package mentor18.FlightTicketOrder;

public enum SeatPreference {
    WINDOW(50), AISLE(25), MIDDLE(0);

    private final double addCharges;

    SeatPreference(double addCharges) {
        this.addCharges = addCharges;
    }

    public double getAddCharges() {
        return addCharges;
    }
}

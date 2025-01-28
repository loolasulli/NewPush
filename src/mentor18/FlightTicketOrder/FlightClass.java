package mentor18.FlightTicketOrder;

public enum FlightClass {
    ECONOMY(1.0), PREMIUM_ECONOMY(1.5), BUSINESS(2.0), FIRST_CLASS(3.0);

    private final double multipliers;

    FlightClass(double multipliers) {
        this.multipliers = multipliers;
    }

    public double getMultipliers() {
        return multipliers;
    }
}

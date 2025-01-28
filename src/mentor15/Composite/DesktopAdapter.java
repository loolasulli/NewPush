package mentor15.Composite;

public class DesktopAdapter extends Desktop implements UniversalPowerSupply {

    public DesktopAdapter(Desktop desktop) {
        super();
    }

    public void power() {
        powerWithDesktopPowerSupply();
    }
}

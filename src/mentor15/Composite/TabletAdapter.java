package mentor15.Composite;

public class TabletAdapter extends Tablet implements UniversalPowerSupply {

    public TabletAdapter(Tablet tablet) {
        super();
    }

    public void power() {
        powerWithTabletPowerSupply();
    }
}

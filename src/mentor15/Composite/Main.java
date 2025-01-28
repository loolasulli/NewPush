package mentor15.Composite;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        Tablet tablet = new Tablet();
        UniversalPowerSupply desktopAdapter = new DesktopAdapter(desktop);
        UniversalPowerSupply tabletAdapter = new TabletAdapter(tablet);
        CompositePowerSupplyAdapter cpsa = new CompositePowerSupplyAdapter(Arrays.asList(desktopAdapter, tabletAdapter));
        cpsa.power();
    }
}

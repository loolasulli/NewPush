package mentor15.Composite;

import java.util.List;

public class CompositePowerSupplyAdapter implements UniversalPowerSupply {
    private List<UniversalPowerSupply> powerSupplies;

    public CompositePowerSupplyAdapter(List<UniversalPowerSupply> powerSupplies) {
        this.powerSupplies = powerSupplies;
    }

    @Override
    public void power() {
        for (UniversalPowerSupply powerSupply: powerSupplies) {
            powerSupply.power();
        }
    }
}

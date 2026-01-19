package week1;


public class Maize extends Crop implements Transportable {

    Maize(double landArea) {
        super("Maize", "Summer", landArea);
    }

    @Override
    double calculateYield() {
        return landArea * 2.5;
    }

    @Override
    double calculateWaterRequirement() {
        return landArea * 400;
    }

    @Override
    public double calculateTransportCost() {
        return landArea * 800;
    }

    @Override
    public String getTransportMethod() {
        return "Porter / Small vehicle (hill areas)";
    }
}

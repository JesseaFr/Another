package week1;


public class Wheat extends Crop implements Transportable {

    Wheat(double landArea) {
        super("Wheat", "Winter", landArea);
    }

    @Override
    double calculateYield() {
        return landArea * 3.0;
    }

    @Override
    double calculateWaterRequirement() {
        return landArea * 700;
    }

    @Override
    public double calculateTransportCost() {
        return landArea * 1000;
    }

    @Override
    public String getTransportMethod() {
        return "Mini truck";
    }
}

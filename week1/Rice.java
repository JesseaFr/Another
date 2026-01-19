package week1;


/**
 * Write a description of class w here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rice extends Crop implements Transportable {

    Rice(double landArea) {
        super("Rice", "Monsoon", landArea);
    }

    @Override
    double calculateYield() {
        return landArea * 4.0; 
    }

    @Override
    double calculateWaterRequirement() {
        return landArea * 1200; 
    }

    @Override
    public double calculateTransportCost() {
        return landArea * 1500;
    }

    @Override
    public String getTransportMethod() {
        return "Tractor via rural roads";
    }
}

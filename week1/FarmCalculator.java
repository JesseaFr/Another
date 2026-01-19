package week1;


public class FarmCalculator {
    public static void main(String[] args) {

        Crop[] crops = {
            new Rice(1.5),
            new Wheat(2.0),
            new Maize(1.0)
        };

        for (Crop c : crops) {
            c.displayCropInfo();
            System.out.println("Expected Yield: " + c.calculateYield() + " tons");
            System.out.println("Water Needed: " + c.calculateWaterRequirement() + " liters");

            Transportable t = (Transportable) c;
            System.out.println("Transport Method: " + t.getTransportMethod());
            System.out.println("Transport Cost: NPR " + t.calculateTransportCost());
            System.out.println("-----------------------------------");
        }
    }
}

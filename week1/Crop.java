package week1;

 public abstract class Crop {
    String cropName;
    String season;
    double landArea; 

    Crop(String cropName, String season, double landArea) {
        this.cropName = cropName;
        this.season = season;
        this.landArea = landArea;
    }

    abstract double calculateYield();
    abstract double calculateWaterRequirement();
    void displayCropInfo() {
        System.out.println("Crop: " + cropName);
        System.out.println("Season: " + season);
        System.out.println("Land Area: " + landArea + " hectares");
    }
}

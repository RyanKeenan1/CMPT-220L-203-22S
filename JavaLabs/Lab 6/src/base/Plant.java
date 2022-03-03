package base;

public class Plant {
    String plantFamily;
    boolean needsWatering;
    String name;
    String instructions;
    String sunlightInstructions;

    public Plant (String suppliedPlantFamily, boolean suppliedNeedsWatering, String suppliedName) {
        plantFamily = suppliedPlantFamily;
        needsWatering = suppliedNeedsWatering;
        name = suppliedName;
    }

    public void wateringInstructions (String suppliedInstructions) {
        instructions = suppliedInstructions;
    }

    public void sunlightRequirements (String suppliedInstructions) {
        sunlightInstructions = suppliedInstructions;
    }
}

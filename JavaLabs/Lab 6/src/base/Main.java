package base;

public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    public static void main(String[] args) {
        // Create an Array, Populate it, and Print it out
        // Create an ArrayList, Populate it, and Print it out
        // Create an LinkedList, Populate it, and Print it out
        // Create an Queue, Populate it, and Print it out
        // Create an Stack, Populate it, and Print it out
        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        Plant doug = new Plant("Trees",true,"Doug");
        Plant alex = new Plant("Beeboop plant",true,"Alex");

        doug.wateringInstructions("Make sure there is enough rain in climate");
        doug.sunlightRequirements("Make sure tree can absorb all sunlight");

        alex.wateringInstructions("Made up plant. Doesn't need any water");
        alex.sunlightRequirements("Made up plant. It makes its own light!");
    }
}

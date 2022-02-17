package base;

import java.lang.Math;

public class Main {
    /**
     * # Lab Four
     * ---
     *
     * For this lab we're going to be making and using a bunch of functions.
     *
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
    public static void main(String[] args) {
        // Examples of switch case
       System.out.println(switchExample("bulldog"));
       System.out.println(switchExample("golden retriever"));
       System.out.println(switchExample("tiger"));

        forLoopExample();
        whileLoopExample();

        System.out.println(raiseToPower(2, 5));

        int[] testArray = {2, 3, 3, 3, 4, 4, 2, 1, 5};
        System.out.println(numAppearInArray(testArray, 3));

        int[] testArray2 = {2, 3, 3, 3, 4, 4, 2, 1, 5};
        System.out.println("Sum of all vals in testArray2 is " + summation(testArray2));

        System.out.println("The answer of 3^2 + 4^2 is: " + pythTheroem(3, 4));
    }
    // For the following todos you'll probably want to define them below and then call them from the main function above.

    /**
     * Returns whether the input is a kanine or not
     * @param input string that is most likely an animal
     * @return boolean if input is a type of dog
     */
    public static boolean switchExample(String input) {
        switch(input) {
            case "bulldog":
                return true;
            case "golden retriever":
                return true;
            case "rotweiler":
                return true;
        }

        return false;
    }

    /**
     * Example of a for loop which runs 5 times
     */
    public static void forLoopExample() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I've run the for loop " + (i + 1) + " times!");
        }
    }

    /**
     * An example of a while loop which runs 5 times
     */
    public static void whileLoopExample() {
        int whileLoopcounter = 0;

        while(whileLoopcounter != 5) {
            System.out.println("I've run the while loop " + (whileLoopcounter + 1) + " times!");
            whileLoopcounter++;
        }
    }


    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */

    public static double raiseToPower(int baseNum, int powerNum) {
        return Math.pow(baseNum, powerNum);
    }

    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */

    public static int numAppearInArray(int[] numBoi, int numToFind) {
        int foundInArray = 0;

        for (int i = 0; i < numBoi.length; i++) {
            if (numBoi[i] == numToFind) {
                foundInArray++;
            }
        }

        return foundInArray;
    }

    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */

    public static int summation(int[] givenArray) {
        int sumOfVals = 0;

        for (int i = 0; i < givenArray.length; i++) {
            sumOfVals += givenArray[i];
        }

        return sumOfVals;
    }

    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     */

    int addition(int a, int b) {
        int answer = a + b;
        return answer;
    }

    int division(int a, int b) {
        int answer = a / b;
        return answer;
    }

    public static int pythTheroem(int a, int b) {
        return (int)raiseToPower(a, 2) + (int)raiseToPower(b, 2);
    }
}

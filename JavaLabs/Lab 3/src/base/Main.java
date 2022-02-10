package base;

import java.time.Year;

public class Main {
    /**
     * # Lab Three
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {

        // Make an if statement that triggers a print or println statement
        // if statement
        // Make an if, else statement where the else statement triggers a print or println statement
        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        if (1==1) {
            System.out.println("1==1");
          }
          
          if (1==2) {
            System.out.println("1==2");
          } else {
            System.out.println("1!=2");
          }
          
          if (2==1) {
            System.out.println("2==1");
          } else if (2==2) {
            System.out.println("2==2");
          } else {
            System.out.println("2==?");
          }
 

        // Make 2 variables and use them in an if else conditional print from one of the sections
        int one = 1;
        int two = 2;
        if (one==one) {
            System.out.println("1=1");
        } else {
            System.out.println("1!=1");
        }
        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        if (one==one && two==two) {
            System.out.println("1=1 and 2=2");
        } else {
            System.out.println("1!=1 and 2!=2");
        }

        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        if (one==two || two==two) {
            System.out.println("1=2 or 2=2");
        } else {
            System.out.println("1!=2 or 2!=2");
        }
    }
}

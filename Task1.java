import java.util.Random; // Import random class, used to generate random numbers
import java.util.Scanner; // Import scanner class

class RandomNumber {
    public static void main (String args[]) {
    // Instantiation of random class
    Random rand = new Random();
    // Setting the upper bound to generate the random numbers in the specific range
    int upperbound = 100;
    // Generate random values from 1 - 100 using nextInt()]

    // Collect user input
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Please enter random a number: ")

    String guessedNumber = myObj.nextInt(); // Read user input
    System.out.println()



    }
}


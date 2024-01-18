import java.util.Random; // Import random class, used to generate random numbers
import java.util.Scanner; // Import scanner class

class RandomNumber {
    public static void main (String args[]) {
    // Instantiation of random class
    Random rand = new Random();

    // Setting the upper bound to generate the random numbers in the specific range
    int upperbound = 100;

    // Generate random values from 1 - 100 using nextInt()]
    int randomNumber = rand.nextInt(upperbound) + 1;

    // Collect user input
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    int guessedNumber; // Variable declaration to store the user's guessed number

    // Using a loop to compare the user's guess with the generated number
    // and provide feedback on the users input
    do {
        System.out.print("Please enter your guessed number: ");

        // Read user input
        guessedNumber = myObj.nextInt();

        // Provide feedback on the user's guessed number
        if (guessedNumber == randomNumber) {
            System.out.println("Congratulations! You guessed the correct number!");
        }  else if (guessedNumber < randomNumber) {
            System.out.println("The number you guessed is too low, please try again.");
        }   else {
            System.out.println("The number you guessed is too high, please try again.");
        }
    }   while (guessedNumber != randomNumber);

    // Close the scanner to prevent resource leaks
        myObj.close();
    System.out.println("Please enter random a number: ");
    }

{

    }
}


import java.util.Random; // Import random class, used to generate random numbers
import java.util.Scanner; // Import scanner class

class RandomNumber {
    public static void main (String args[]) {
        Scanner myObj = new Scanner(System.in);

        // Set the upper bound to generate random numbers in the specified range
        int upperbound = 100;
        int maxAttempts = 5;  // Set the maximum number of attempts
        int maxRounds = 5;  // Set the maximum number of rounds

        int round = 1;  // Initialize the round counter
        int score = 0;  // Initialize the score counter

        do {
            // Generate a new random number for each round
            Random rand = new Random();
            int randomNumber = rand.nextInt(upperbound) + 1;

            int attempts = 0;  // Initialize attempts counter for each round

            // Loop for attempts
            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Round " + round + ", Attempt " + attempt + ": Please enter your guessed number: ");
                int guessedNumber = myObj.nextInt();

                if (guessedNumber == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number!");
                    score += maxAttempts - attempts;  // Update the score
                    break;  // Exit the loop if the guess is correct
                } else if (guessedNumber < randomNumber) {
                    System.out.println("The number you guessed is too low, please try again.");
                } else {
                    System.out.println("The number you guessed is too high, please try again.");
                }

                attempts++;  // Increment the attempts counter
            }

            // Ask the user if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = myObj.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                // If the user does not want to play again, exit the outer loop
                break;
            }

            // Increment the round counter
            round++;

        } while (round <= maxRounds);

        // Display the final score
        System.out.println("Your final score: " + score);

        // Close the scanner to prevent resource leaks
        myObj.close();
    }
}
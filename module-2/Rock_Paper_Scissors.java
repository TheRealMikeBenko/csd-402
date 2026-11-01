package rock_paper_scissors;
/*
 * Michael Benko
 * 2026-10-31
 * CSD402-302E Java for Programmers (2273-DD)
 * Module 2.2 Programming Assignment – Rock-Paper-Scissors
 *
 * Description:
 * This program simulates the Rock-Paper-Scissors game.
 * The computer randomly selects Rock, Paper, or Scissors
 * represented by the values 1, 2, and 3.
 *
 * The user is prompted to enter a value of 1, 2, or 3
 * to choose Rock, Paper, or Scissors.
 *
 * The program displays both selections and determines
 * the winner according to the standard rules of the game:
 *
 * Rock defeats Scissors
 * Paper defeats Rock
 * Scissors defeats Paper
 *
 * The program then displays the result of the game.
 */
import java.util.Scanner;

public class Rock_Paper_Scissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerChoice = (int)(Math.random() * 3 ) + 1;
        int userChoice;
        // Prompt user for rock, paper, or scissors (1, 2, or 3)
        String menu = """
            Rock-Paper-Scissors

            Enter:
            1 for Rock
            2 for Paper
            3 for Scissors
            """;
        System.out.println(menu);
        String userInput = input.nextLine();   
        while (!userInput.equals("1") && !userInput.equals("2") && !userInput.equals("3")) { // While loop used for validation
            System.out.println("Invalid selection. Please enter 1, 2, or 3.");
            userInput = input.nextLine(); // User input as a string because exceptions have not been covered in this module
        }
        userChoice = Integer.parseInt(userInput);  // User input converted to an integer
        String computerChoiceText = choiceToText(computerChoice);
        String userChoiceText = choiceToText(userChoice);
        System.out.println("Computer chose: " + computerChoiceText);
        System.out.println("You chose: " + userChoiceText);
        
        // If statements used to decide who won
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        }
        else if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)) {
            if (userChoice == 1) {
                System.out.println("Rock beats Scissors. You Win!");
            }
            else if (userChoice == 2) {
                System.out.println("Paper beats Rock. You Win!");
            }
            else {
                System.out.println("Scissors beats Paper. You Win!");
            }
        }
        else {
            if (computerChoice == 1) {
                System.out.println("Rock beats Scissors. Computer Wins!");
            }
            else if (computerChoice == 2) {
                System.out.println("Paper beats Rock. Computer Wins!");
            }
            else {
                System.out.println("Scissors beats Paper. Computer Wins!");
            }
        }
        input.close();
    }
    public static String choiceToText(int choice) { // Method used to avoid duplicate code
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
        }

        return "Invalid";
    }
    
}

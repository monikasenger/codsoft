/**
 * 
 */
package NumberGame;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        Random ran = new Random();
	        int roundsWon = 0; //round you won
	        int totalRounds = 0; //total round you play
	        char ans;//wantt to play more
	        int maxattempts = 10; // Limit number of attempts per round
	        
	        System.out.println("\n***************NUMBER GAME***************");
	        System.out.println("\n=> You have to guess a number between 1 and 100 !!!!");
	        System.out.println("=> You have '" + maxattempts + "' attempts to guess the number in each round !!!!\n");
	        
	        do {
	            totalRounds++;
	            int guessnumber = ran.nextInt(100) + 1; // Generates a random number between 1 and 100
	            int attempts = 0;
	            boolean guesscorrect = false;
	            
	            System.out.println("\t-----Round " + totalRounds + "-----");
	            
	            //guess the number
	            while (attempts < maxattempts && !guesscorrect) {
	                attempts++;
	                System.out.print("Attempt " + attempts + ":-  Enter your guess: \t");
	                int userGuess = sc.nextInt();
                   //guess correctly
	                if (userGuess == guessnumber) {
	                    System.out.println("Congratulations! You guessed the correct number :)\n");
	                    guesscorrect = true;
	                    roundsWon++;
	                } else if (userGuess < guessnumber) {
	                    System.out.println("Too low! Try again.\n");
	                } else {
	                    System.out.println("Too high! Try again.\n");
	                }
	            }
	            //guess incorrectly
	            if (!guesscorrect) {
	            	 System.out.println("\tSorry:(");
	                System.out.println("You've used all your attempts. The correct number was: '" + guessnumber+"'");
	            }
	            
	            System.out.println("Do you want to Play Again :  Y/N");
				 ans = sc.next().charAt(0); 
			}
			while(ans == 'y'|| ans =='Y');
			
			System.out.println("Thank You For Coming :) :) ");
	        
	        System.out.println("\nGame Over!");
	        System.out.println("Total Rounds Played: " + totalRounds);
	        System.out.println("Rounds Won: " + roundsWon);
	        
	        sc.close();
	    

	}

}

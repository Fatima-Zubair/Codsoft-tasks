package project_1;
//TASK 1
//
//1. Generate a random number within a specified range, such as 1 to 100.
//
//2. Prompt the user to enter their guess for the generated number.
//
//3. Compare the user's guess with the generated number and provide feedback on whether the guess
//is correct, too high, or too low.
//
//4. Repeat steps 2 and 3 until the user guesses the correct number.
//
//You can incorporate additional details as follows:
//
//5. Limit the number of attempts the user has to guess the number.   
//6. Add the option for multiple rounds, allowing the user to play again.
//7. Display the user's score, which can be based on the number of attempts taken or rounds won.
import java.util.Random;
import java.util.Scanner;
public class NumberGuessing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random =new Random();
		int guess;
		int number;
		int attempts;
		int MaxAttempts=5;
		int rounds=0;
		int scores;
		int total_scores=0;
		String choice;
		System.out.println("!!....WELCOME TO THE NUMBER GUESSING GAME....!!");
		System.out.println("YOU HAVE 5 ATTEMPTS FOR ONE ROUND \n ALL THE BEST...!!!");
		 do{number=random.nextInt(1,100);
		 scores=0;
		 attempts=0;
		do{  
			System.out.println("Enter your guess between 1 to 100 : ");
		 guess=sc.nextInt();
		 attempts++;
		 if(guess<1 ||guess>100) {
			 System.out.println("OOPS...!\nYOUR GUESS IS OUT OF RANGE");
		 }
		 else if(guess==number) {
			 System.out.println("CORRECT!");
			 scores=100;
		 }
		 else if(guess<number-10) {
			 System.out.println("TOO LOW!");
		 }
		 else if(guess<number) {
			 System.out.println("YOU ARE NEAR BUT YOUR GUESS IS STILL LOW");
		 }
		 else if(guess>number+10) {
			 System.out.println("TOO HIGH!");
		 }
		 else if(guess>number) {
			 System.out.println("YOU ARE NEAR BUT YOUR GUESS IS STILL HIGH");
		 }
		
		}while(guess!=number && attempts<MaxAttempts);
		if(attempts==2) {
			scores=90;
		}
		else if(attempts==3) {
			scores=80;
		}
		else if(attempts==4) {
			scores=70;
		}
		else if(attempts==5 && guess==number) {
			scores=60;
		}
		else if(attempts==5 && guess!=number) {
			System.out.println("YOU LOST!");
		}
		System.out.println("YOUR SCORE FOR THIS ROUND: "+scores);
		total_scores+=scores;
		System.out.println("DO YOU WANT TO PLAY ANOTHER ROUND ?(y/n)");
		choice=sc.next();
		rounds++;
		 }while(choice.equalsIgnoreCase("y"));
		 sc.close();
		 System.out.println("YOUR TOTAL SCORE IN "+rounds+" ROUND/S: "+total_scores);
	}

}

import java.util.Scanner;
import java.util.Random;

public class Main {
		
	public static void main(String[] args) {
	// Sets up scanner and random number
		Random gen = new Random();
		int number = gen.nextInt(9)+1;
		Scanner scan = new Scanner(System.in);
		//First attempt
		System.out.print("Guess a Number \n");
		int guess = scan.nextInt();
		//If correct on first guess
		if (guess==number)
			System.out.println("Correct!");
		//Subsequent attempts
		else
			while (guess != number){
			System.out.println("Incorrect, try again!");
			guess=scan.nextInt();
			}
		//Final victory
		System.out.println("You win!");
	}

}

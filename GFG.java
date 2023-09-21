import java.util.Scanner;

public class GFG{
	public static void score(int w, int a){
		System.out.println("The number of attempts: " + a);
		System.out.println("The number of rounds won: " + w);
	}
	public static void guessingNumberGame(int a){
		Scanner sc = new Scanner(System.in);
		int number = 1 + (int)(100 * Math.random());
		int K = 5, w = 0;
		int i, guess, j;
		System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");

		for (i = 0; i < K; i++) {
			System.out.println("Guess the number: ");
			guess = sc.nextInt();

			if (number == guess) {
				System.out.println("Congratulations!" + " You guessed the number.");
				++w;
				System.out.println("Want to play again press 1: ");
				j = sc.nextInt();
				if(j == 1)
				guessingNumberGame(++a);
				score(w, a);
			}
			else if (number > guess && i != K - 1) {
				System.out.println("The number is " + "greater than " + guess);
			}
			else if (number < guess && i != K - 1) {
				System.out.println("The number is" + " less than " + guess);
			}
		}
		if (i == K) {
			System.out.println("You have exhausted" + " trials.");
			System.out.println("The number was " + number);
			System.out.println("Want to play again press 1: ");
			j = sc.nextInt();
			if(j == 1)
			guessingNumberGame(++a);
			score(w, a);
		}
	}

	public static void main(String arg[])
	{
		int a = 0;
		guessingNumberGame(++a);
	}
}

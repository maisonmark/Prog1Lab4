import java.util.*;

public class RandomNumber {
	
		public static void main(String[] args){
		Scanner keyinput = new Scanner(System.in);
		
		boolean again = false;
		boolean found = false;
		int tries = 0; // this indicates the amount of times the player had tried to guess the number

		do {
			int number = (new Random()).nextInt(101); //the random number generator is limited to 100
			System.out.println("random = " + number);//This first 'do' is just to see if I guess properly, the if statement would be true.
			do {
				System.out.println("Please enter your guess: ");
				tries++;
				if (keyinput.nextInt()==number){ // if the inputed number is equal to the random generated number, the following if statement would be true.
					found = true;
					System.out.println("Would you like to try to guess again? Y or N");
					if (keyinput.next().equals("Y")) again = true; // Y to try again, N to exit the program.
				} else {
					System.out.println("You guess wrong! Guess number #" +tries); // this would activate if the player had guessed wrong
					if (tries==10){ // if the player reaches 10 guess, the program would automatically exit the program.
						System.out.println("You have no more tries!");
					} 
				}
			} while (found==false && tries<10); // if both condition would be true, the player wins.
		} while (again==true); // if again would be true, the loop would restart once again.

	}

}
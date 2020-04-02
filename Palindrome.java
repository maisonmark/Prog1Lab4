import java.util.*;

public class Palindrome	{
	
	public static void main(String[] args){
	
		//This part of the code sorts out the variables used in the for loop (reverse and original)
		String reverse = "";
		System.out.println("Please enter a word in");
		Scanner keyinput = new Scanner(System.in);
		String original = keyinput.nextLine();

		// This for loop reverses the words of the original input, hence reverse=reverse+origingal.charAt(i);
		for(int i= original.length()-1;i>=0;i--){
			reverse=reverse+original.charAt(i);
		}

		/*The if statement dictates if the given input is a palindrome or not
		if the original input is equal to it's reverse, the system would outprint that it is indeed
		a palindrome,if not,it will say otherwise */

		if(original.equals(reverse)){
			System.out.println("Your word is a palindrome!");
		} else {
			System.out.println("Your word is not a palindrome!");
		}
		
		}


	}




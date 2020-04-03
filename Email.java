import java.util.*;

public class Email	{
	public static void main(String[] args){
	Scanner keyinput = new Scanner(System.in);
	System.out.println("Please enter an email you would like to validate");
	String email = keyinput.next();

	boolean foundAt = false;
	boolean foundDot = false;

	for (int i=0; i< email.length(); i++){ // finds and checks a character one by one (i++)
		if (!foundAt) {
			if (email.charAt(i)=='@') { // once the @ is found, the loop should continue to look for the dot '.'
				foundAt = true;
			}
		} else if (!foundDot) { // when the @ has been found, the program would search for the dot
			if (email.charAt(i)=='.') { 
				foundDot = true;
			}
		}
	}
		// if statement if both '@' and '.' have been found: it would outprint if it was valid or not
		if (foundAt && foundDot) { 
			System.out.println("The email that you entered is valid.");
		} else {
			System.out.println("The email that you entered is invalid.");
		}
	}

}

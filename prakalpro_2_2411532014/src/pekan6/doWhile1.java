package pekan6;
import java.util.*;

public class doWhile1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String phrase;
		do {
			System.out.print("Eits, input the password first : ");
			phrase = console.next();
		} while (!phrase.equals("abcd"));
	}

}

package pekan6;

import java.util.Random;
import java.util.Scanner;

public class TugasWhile {

	public static void main(String[] args) {
		 Random rand = new Random();
		 Scanner hi = new Scanner(System.in);
		 int tries = 0;
		 int sum = 0;
		 int dadu1, dadu2;
		 boolean ulang = true;
		
		while(ulang) {
			 //roll the dice once
			 dadu1 = rand.nextInt(6) + 1;
			 dadu2 = rand.nextInt(6) + 1;
			 sum = dadu1 + dadu2;
			 tries++;
			 System.out.println(dadu1 +" + "+ dadu2 + " = " + sum);
			 
			 if(sum == 7) {
				 System.out.println("Congrats! You got 7 after "+tries+" tries!");
				 ulang = false;
			 } else {
				 System.out.println("Do YOU want to try again? (incase you didnt get 7) [y/n]");
				 String ans = hi.next();
				 if(ans.equalsIgnoreCase("n")) {
					 System.out.println("You've already tried "+tries+" tries!");
					 ulang = false;
				 }
			 }
		}
		hi.close();
	}

}

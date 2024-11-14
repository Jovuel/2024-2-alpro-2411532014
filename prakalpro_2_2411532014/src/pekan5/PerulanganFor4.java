package pekan5;
import java.util.Scanner;

public class PerulanganFor4 {

	public static void main(String[] args) {
		int angka; 
		Scanner console = new Scanner(System.in);
		System.out.print("Input angka berapa? : ");
		angka = console.nextInt();
		console.close();
		
		int jumlah = 0;
		for(int i=1; i<=angka; i++) {
			System.out.print(i);
			jumlah = jumlah + i;
			if(i<angka) {
				System.out.print(" + ");
			}
		}
		System.out.println();
		System.out.println("Jumlah = "+jumlah);

	}

}

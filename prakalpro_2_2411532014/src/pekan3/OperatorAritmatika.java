package pekan3;

import java.util.Scanner;

public class OperatorAritmatika {

	public static void main(String[] args) {
		int A1;
		int A2;
		int hasil;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input angka-1: ");
		A1 = keyboard.nextInt();
		System.out.print("Input angka-2: ");
		A2 = keyboard.nextInt();
		keyboard.close();
		
		System.out.println();
		System.out.println("Operator Penjumlahan");
		hasil = A1 + A2; //Penjumlahan
	    System.out.println("Hasil = " + hasil);
	    
	    System.out.println("Operator Pengurangan");
		hasil = A1 - A2; //Pengurangan
		System.out.println("Hasil = " + hasil);
		
		System.out.println("Operator Perkalian");
		hasil = A1 * A2; //Perkalian
		System.out.println("Hasil = " + hasil);
		
		System.out.println("Operator Pembagian");
		hasil = A1 / A2; //Pembagian
		System.out.println("Hasil = " + hasil);
		
		System.out.println("Operator Sisa Bagi");
		hasil = A1 % A2;
		System.out.println("Hasil = " + hasil);

	}

}

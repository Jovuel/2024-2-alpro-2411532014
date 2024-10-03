package pekan3;

import java.util.Scanner;

public class OperatorAssignment {

	public static void main(String[] args) {
		int A1;
		int A2;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input angka-1: ");
		A1 = keyboard.nextInt();
		System.out.print("Input angka-2: ");
		A2 = keyboard.nextInt();
		keyboard.close();
		System.out.println();
	
		System.out.println("Assignment Penjumlahan");
		A1 += A2; //Penjumlahan, sekarang tersimpan di A1
		System.out.println("Hasil Penjumlahan    : " + A1);
		
		System.out.println("Assignment Pengurangan");
		A1 -= A2; //Pengurangan, sekarang tersimpan di A1
		System.out.println("Hasil Pengurangan    : " + A1);
		
		System.out.println("Assignment Perkalian");
		A1 *= A2; //Perkalian, sekarang tersimpan di A1
		System.out.println("Hasil Perkalian      : " + A1);
		
		System.out.println("Assignment Pembagian");
		A1 /= A2; //Pembagian, sekarang tersimpan di A1
		System.out.println("Hasil Pembagian      : " + A1);
		
		System.out.println("Assignment Sisa Pembagian");
		A1 %= A2; //Sisa Pembagian, sekarang tersimpan di A1
		System.out.println("Hasil Sisa Pembagian : " + A1);
		

	}

}

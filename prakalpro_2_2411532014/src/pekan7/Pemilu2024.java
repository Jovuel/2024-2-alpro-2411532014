package pekan7;

import java.util.Scanner;

public class Pemilu2024 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nama : ");
		String nama = in.nextLine();
		System.out.print("Umur : ");
		int umur = in.nextInt();
		System.out.print("Inputkan pilihan anda (1-3) : ");
		int n = in.nextInt();
		System.out.println();
		System.out.println("Nama: " + nama);
		System.out.println("Umur: " + umur);
		System.out.println("Pilihan: " + n);
		
		switch(n) {
		case 1:
			System.out.println("Anda memilih Anies");
			break;
		case 2:
			System.out.println("Anda memilih Prabowo");
			break;
		case 3:
			System.out.println("Anda memilih Ganjar");
			break;
		default:
			System.out.println("Pilihan anda bukan nomor 1 ataupun 2 ataupun 3.");
		}
		System.out.println("Terima kasih sudah memilih.");
	}

}

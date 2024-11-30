package pekan7;

import java.util.Scanner;

public class PanggilMahasiswa2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("NIM: ");
		String x = input.nextLine();
		System.out.print("Nama: ");
		String y = input.nextLine();
		Mahasiswa ganteng = new Mahasiswa();
		ganteng.setNim2(x);
		ganteng.setName(y);
		System.out.println(ganteng.getNim2());
		System.out.println(ganteng.getName());
		ganteng.Cetak2();
		input.close();
	}

}

package pekan7;

public class PanggilMahasiswa {

	public static void main(String[] args) {
		Mahasiswa hy = new Mahasiswa();
		hy.setNim(242014);
		hy.setName("Jovantri Immanuel Gulo");
		System.out.println(hy.getNim());
		System.out.println(hy.getName());
		hy.Cetak();

	}

}

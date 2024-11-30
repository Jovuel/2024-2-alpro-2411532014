package pekan7;

public class Mahasiswa {
		//Variabel global
		private int nim;
		private String name, nim2;
		
		//membuat mutator (setter)
		public void setNim (int nim) {
			this.nim = nim;
		}
		
		public void setNim2 (String nim2) {
			this.nim2 = nim2;
		}
		
		public void setName (String name) {
			this.name = name;
		}
		
		//membuat accessor (getter)
		public int getNim() {
			return nim;
		}
		
		public String getNim2() {
			return nim2;
		}
		
		public String getName() {
			return name;
		}
		
		//another way or method
		public void Cetak() {
			System.out.println("Nim :" + nim);
			System.out.println("Nama : " + name);
		}
		
		public void Cetak2() {
			System.out.println("Nim :" + nim2);
			System.out.println("Nama : " + name);
		}
		
}

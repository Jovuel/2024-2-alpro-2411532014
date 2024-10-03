package pekan3;

public class OperatorLogika {

	public static void main(String[] args) {
		
		boolean A1 = true;
		boolean A2 = false;
		boolean c;
		
		System.out.println("A1 = " + A1);
		System.out.println("A2 = " + A2);
		System.out.println();
		
		System.out.println("Konjungsi");
		c = A1 && A2;
		System.out.println("True and false = " + c);
		System.out.println();
		
		System.out.println("Disjungsi");
		c = A1 || A2;
		System.out.println("True or false = " + c);
		System.out.println();
		
		System.out.println("Negasi");
		c = !A1;
		System.out.println("Not true = " + c);
		
	}

}

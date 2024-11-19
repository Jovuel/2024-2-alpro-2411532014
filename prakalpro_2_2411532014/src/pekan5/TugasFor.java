package pekan5;

public class tugasfor1 {
	public static void main(String[] args) {
		int a= 10;
		int b;
		int c;
		c=a;
	
		for(int i =1; i<=10;i++) {
			b=c+1;
			for(int j = 1; j<= 18;j++) {
				if(i==1 || i==10) {
					if(j==1 || j==18 ) {
						System.out.print("#");
					}else {
						System.out.print("=");
					}
				}
				if(i>1 && i<10) {
					if(j==1 || j ==18) {
						System.out.print("|");
					}else {
						if(j == c ) {
							System.out.print("<");
						}else if(j== b) {
							System.out.print(">");
						}
						else if(j==(18-c)) {
							System.out.print("<");
						}else if(j==(19-c)) {
							System.out.print(">");
						}else if(j>b && j<(18-c)){
						System.out.print(".");
						}else{
							System.out.print(" ");
						}
					}
				}
				
			}
			System.out.println();
			a-=2;
			if(a<=0) {
				c=(-1*a)+2;
			}else {
				c=a;
			}
		}
	}

}
package pattern;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		 for ( i = 0; i <=5; i++) {
			 for ( k = 5; k>i; k--) {
			        System.out.print(" ");
			      }
	            for ( j = 1; j <= i; j++) {
	                if ((i + j) % 2 == 0) {
	                    System.out.print("1");
	                } else {
	                    System.out.print("0");
	                }
	            }
	            System.out.println();
	}
}
	}

package in.ineuron.main;

public class PatternProg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		4. WAP to print
		*           *
		**         **
		***       ***
		****     ****
		*****   *****
		****** ******
		*************
	*/	
//		CODE
		int n=14;
		for(int i=0 ;i<n; i++) {
			for(int j=0; j<n ;j++) {
				if(j==0 && i>(n-1)/2 || i==n-1 || 
				  j==n-1 && i>(n-1)/2 || i-j>=(n-1)/2 || 
				  i+j>=n-1+(n-1)/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println( );
		}

	}
	
}


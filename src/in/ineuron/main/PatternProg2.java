package in.ineuron.main;

public class PatternProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. printing I	
		int n=10;
				
				for(int i=0;i<n; i++)
				{
					for(int j=0 ; j<n; j++)
					{
						if(i==0 && j<(n-1) || j==(n-1)/2 || i==n-1 && j<(n-1))
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
							
						}
						
					}
		//2. Printing N
					for(int j=0 ; j<n; j++)
					{
						if(j==0 || i==j || j==n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
							
						}
						
					}
		//3. Printng E
					for(int j=0 ; j<n; j++)
					{
						if(i==0 && j<(n-1)|| i==(n-1)/2 && j<(n-1)|| i==n-1 && j<(n-1) || j==0)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
							
						}
						
					}
		//4. Printing U
					
					for(int j=0 ; j<n; j++)
					{
						if(j==0 && i<n-1 || i==n-1 || j==n-1 && i<n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
							
						}
						
					}
		//5. Printing R
					
					for(int j=0 ; j<n; j++)
					{
						if(i==0 && j<n-1  || j==0 || i-j==(n-1)/2 || j==n-1 && i<(n-1)/2 && i>0 || i==(n-1)/2 && j<n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
							
						}
						
					}
		//6. Printing O
					
					for(int j=0 ; j<n; j++)
					{
						if(i==0 && j>0 && j<n-1 || i==n-1 && j>0 && j<n-1 || j==0 && i>0 &&i<n-1 || j==n-1 && i>0 && i<n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
							
						}
						
					}
					
		//7. Printing N
					for(int j=0 ; j<n; j++)
					{
						if(j==0 || i==j || j==n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
				
						}
			
					}
					System.out.println();
				}
			
	}

}

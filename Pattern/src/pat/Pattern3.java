package pat;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		int i, j, k;
		for ( i=1;i<=n;i++)
		{
			for(j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			
			for( k=1; k<=(2*i-1); k++)
			{
				
				if(k==1 || i==n || k==(2*i-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" \n");
		}
		
	}

}


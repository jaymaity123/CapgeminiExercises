package pat;
import java.util.Scanner;
public class Pattern4 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			for(int j = i; j<=n; j++) 
			{
	            System.out.print(" ");
	         }
			for(int k = 1; k <= 2*i-1; k++) 
			{
	            System.out.print("*");
	         }
			System.out.print("\n");
		}
		for (int i=n-1;i>=1;i--)
		{
			for(int j=n; j >= i; j--) 
			{
	            System.out.print(" ");
	         }
			for(int k=1; k <= 2*i-1; k++) 
			{
	            System.out.print("*");
	         }
			System.out.print("\n");
		}
	}

}

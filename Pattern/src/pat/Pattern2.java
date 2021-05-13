package pat;
import java.util.*;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			for(int j=n-i; j>=1; j--)
			{
				System.out.print(" ");
			}
			System.out.print("* ");
			for(int k=2; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
	}

}

package p2;
import java.util.Scanner;
public class MaxMin {
	public static void main(String[] args) { 
		int[] a= new int[10];
		int[] b=new int[2];
		MaxMin ad= new MaxMin();
		a=ad.GetValue(a);
		b=ad.GetMaxMin(a, b);
		ad.printArray(b);
	}
	public int[] GetValue(int[] a)
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println(" Enter the elements in A =");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		return a;
	}
	public int[] GetMaxMin(int[]a,int[]b)
	{
		int len= a.length;
		for (int i = 0; i < len; i++)   
		{  
			for (int j = i + 1; j < len; j++)
			{
				int tmp = 0;  
				if (a[i] > a[j])   
				{  
				tmp = a[i];  
				a[i] = a[j];  
				a[j] = tmp;  
				}
			}
		}
		b[0]=a[len-1];
		b[1]=a[0];
		return b;
	}
	public void printArray(int[] b)
	{  System.out.println("Max=\n"+b[0]);
		System.out.println("Min=\n"+b[1]);
	}
}	
	


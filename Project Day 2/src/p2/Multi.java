package p2;
import java.util.Scanner;
public class Multi {
	public static int index=0;
	public static void main(String[] args) { 
		int[] a= new int[10];
		int[] b=new int[10];
		Multi ad= new Multi();
		a=ad.GetValue(a);
		Scanner ab=new Scanner(System.in);
		System.out.println(" Enter an element =");
		int r = ab.nextInt();
		b=ad.getMultiplesOf(a, b, r);
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
	public int[] getMultiplesOf(int[]a,int[]b,int r)
	{
		for(int i =0; i<a.length;i++)
		{
			if(a[i]%r==0) {
				b[index]=a[i];
				index++;
			}
		}
		return b;
	}
	public void printArray(int[] b)
	{  System.out.println(" Multiples=");
	for(int i=0;i<index;i++)
	System.out.println(b[i] + " ");
	}
}	
	


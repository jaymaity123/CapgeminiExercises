package p2;
import java.util.Scanner;
public class ArrayDupli {
	public static int index=0;
	public static void main(String[] args) {
		int[] a= new int[10];
		int[] b=new int[10];
		ArrayDupli ad= new ArrayDupli();
		a=ad.GetValue(a);
		b=ad.Dup(a, b);
		ad.Display(b);
	}
	
	public int[] GetValue(int[] a)
	{ Scanner sc=new Scanner(System.in); 
		System.out.println(" Enter the elements in A =");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		return a;
	}
	
	public int[] Dup(int[]a, int[]b)
	{
		int len = a.length; 
        for (int i = 0; i < len; i++)   
        {   
        int key = 0;  
        for (int j = 0; j < i; j++){  
        if (a[i] == a[j]){   
        key = 1;  
        break;   
            }  
            }  
          if (key == 0){   
          b[index] = a[i];  
          index++;   
            }  
        }
        return b;
	}
	public void Display(int[] b)
	{  System.out.println(" Elements after removal of duplication from A to B=");
		for(int i=0;i<index;i++)
		System.out.println(b[i] + " ");
	}
}

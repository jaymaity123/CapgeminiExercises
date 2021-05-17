package p2;
import java.awt.print.Printable;
import java.util.Scanner;
public class SearchElement {
	public static void main(String[] args) {
		int[] arr= new int[10];
		 Scanner sc=new Scanner(System.in);  
		SearchElement ad= new SearchElement();
		arr=ad.GetValue(arr);
		System.out.println(" Enter the element to be searched =");
		int b = sc.nextInt();
		int c= ad.Search(arr,b);
		System.out.println("The index of searched element = \n"+c);
	}
	public int[] GetValue(int[] arr)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println(" Enter the elements in A =");
		for(int i=0;i<arr.length;i++)
			arr[i]=ab.nextInt();
		return arr;
	}
	public int Search(int[]arr, int n)
	{ if(arr.length == 0)
		return -2;
	else {
		for(int i=0;i<arr.length;i++){    
            if(arr[i] == n){    
                return i+1;    
            }    
        } }   
        return -1;  
	}
	
}

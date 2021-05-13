package split;
import java.lang.String;
public class SplitString {
	
	public static void main(String[] args) {
	new SplitString().task1();
	new SplitString().task2();
	new SplitString().task3();
	new SplitString().task4();
}
	
	public void task1()
	{
		String s1 = "abc.xyz@gmail.com";
		String [] arr = s1.split("\\.");
		for (String str : arr) {
			System.out.println(str);
		}
	}
	public void task2()
	{
		String s1 = "Spring,Hibernate,Spring-Rest,Angular,React";
		String [] arr = s1.split(",");
		for (String str : arr) {
			System.out.println(str);
		}
	}
	public void task3()
	{
		String s1 = "3+5=7";
		String [] arr = s1.split("\\+");
		for (String str : arr) {
			System.out.println(str);
		}
	}
	public void task4()
	{
		String s1 = "mike@gmail.com";
		String s2= "@|\\|";
		String [] arr = s1.split(s2);
		for (String str : arr) {
			System.out.println(str);
		}
	}
	
	
}

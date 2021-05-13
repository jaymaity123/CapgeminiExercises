package split;

public class MainRunner {
	
	public static void main(String[] args) {
		 String[] arr1= {"dog","idiot","bastard","stupid","swine"};
		Filter ob1 = new Filter();
		
		String s1="You are an swine and dog";
		System.out.println(ob1.StringSensor(s1, arr1));
		
	}

}

package Collec;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
public class CollectionFlight  {
	public static void main(String[] args) {
		
		CollectionFlight cf = new CollectionFlight();
		cf.Listing();
	}
	
	public void Listing()
	{
		String str = "2021-03-29 11:30";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime arr = LocalDateTime.parse(str, formatter);
		List<Flight> f1 = new ArrayList<>();
		f1.add(new Flight("ASR113R", "m", "Chennai", arr, "Bangalore", arr, true, 5000, 8000));
		f1.add(new Flight("ASR113S", "r", "Kolkata", arr, "Delhi", arr, true,4000,6000));
		f1.add(new Flight("ASR113T", "s", "Bangalore", arr, "Kolkata", arr, true, 3000, 7000));
		f1.add(new Flight("ASR113U", "k", "Delhi", arr, "Chennai", arr, true, 2000, 1000));
		for (int i = 0; i < f1.size(); i++) {
			System.out.println(f1.get(i));
		}
	
	}
	
}

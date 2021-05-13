package infc;
public class MainApp {
	public static void main(String[] args) {
		
		ElectronicDevice device[] = new ElectronicDevice[4000];
		device[0] = new MobilePhone();
		device[1] = new Printer();
		device[2] = new Laptop();
		MainApp ob1 = new MainApp();
		ob1.doThings(device[2]);
		
	}
	
	public void doThings(ElectronicDevice device)
	{
		device.doSwitchOn();
		
		if(device instanceof MobilePhone)
		{
			MobilePhone phone = (MobilePhone)device;
			phone.doCalling();
		}
		if(device instanceof Printer)
		{
			((Printer)device).doPrinting("c:\\MyDoc.txt");
			
		}
		
		if(device instanceof Laptop)
		{
			Laptop lap = (Laptop)device;
			lap.doDisplay();
		}
		
		device.doSwitchOff();
		
	}
	

}
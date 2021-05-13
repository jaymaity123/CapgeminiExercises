package infc;

public  abstract class ElectronicDevice {

	public abstract void doSwitchOn();
	
	public abstract void doSwitchOff();
	
	public void doCharging()
	{
		System.out.println("--- code to how to charge the device ");
	}
}


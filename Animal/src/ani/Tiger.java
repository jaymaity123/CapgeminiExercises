package ani;

public class Tiger extends Animal {
	
	public Tiger(int legs, float weight) {
		super(legs, weight);
		// TODO Auto-generated constructor stub
	}

	public void doThingSpecificThings()
	{
		System.out.println("Roar");
	}
	
	public void doFeed(int food) {
		super.weight+= (food*0.56);
		System.out.println(" Inside tiger implementation of feed method "+super.weight);
		
	}

	
	public void doWalk() {
		System.out.println(" Implementation of tiger walk method");
	}
}

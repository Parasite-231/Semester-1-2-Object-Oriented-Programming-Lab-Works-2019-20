package DelegationTopic;

public class Bus implements Vehicle {
	
	@Override
	public void move() {
		
		System.out.println("Moving slower");
	}
}

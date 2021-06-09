package DelegationTopic;

public class Main {
	
	
	public static void main(String[] args) {
		
		Traveller eren = new Traveller();
		eren.travel(new Bus());
		eren.travel(new Car());
		eren.travel(new Train());
		Plane ajmeri = new Plane();
		eren.travel(ajmeri);
		
	}
	
}

package DelegationTopic;

public class Demo {
	
	public Demo() {
		System.out.println("Demo Class");
	}
	
	public Demo(int a) {
		System.out.println("A");
		System.out.println(a);
	}
	
	public Demo(String a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Eren eren = new Eren();
	}
}

class Eren extends Demo {
	
	public Eren() {
		super("C");
		System.out.println("B");
	}
	
	public Eren(float b) {
	
	}
	
	
}

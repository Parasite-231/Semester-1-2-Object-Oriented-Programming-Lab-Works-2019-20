public class Human{ //Concept of constructor used here 
	protected String branches , ages  ;
	protected Human(String branches , String ages ){ //constructor Human
		this.branches = branches ;
		this.ages = ages ;
	}

//Below methods expresses  the universal characteristics that exist in Human being.
	
	  protected void live(){
		System.out.println("They all live in Dhaka .") ;
	}
	  protected void sleep(){
		System.out.println("Anika and Tahsin sleeps 8-12 hours a day and lead a comfortable life and goes for work everyday except weekends" ) ;
	}
	  protected void eat (){
		System.out.println("They all are non-vegeterians.") ;
	}
	  protected void walk(){
		System.out.println("In the evening,after office,they all meets together in fast-foods,coffee-shops,sometimes they also went for a walk . ");
	}
	  protected void learn(){
		System.out.println("They always try to learn good things,holds good ethics in heart and pray five times a day. ") ;
	}
}

public class Branchstaffs{//CONCEPT OF INHERITANCE USED

	public void waiter(){
		System.out.println("-Head of waiters of the resturant") ;
	}
	public void sommelier(){
		System.out.println("-Head of waiters of the resturant") ;
	}

}

class Waiter extends Branchstaffs{ //INHERITED CLASS Branchstaffs(PARENT CLASS )
    public void waiter(){ //METHOD OVERRIDDING
    	System.out.println("->Number of waiters is 15.They serves cooked-food.Head in charge of waiters: Mr.Raihan Rahman") ;
    }

}
 class Sommelier  extends Waiter{//CHILD CLASS Sommelier INHERITED PARENT CLASS Waiter 

    public void sommelier(){//METHOD OVERRIDDING
    	System.out.println("->Number of sommelier is 8.They serves bevarages and food pairing.Head in charge of sommelier: Mr.Washim Akram") ;
    }

}
public class Staffs{//ENCAPSULATION CONCEPT USED 
	                //VALUE OF PRIVATE INSTANCE VARIABLE OF A CLASS IS MODIFIED AND RETRIEVED HERE

	private int waitingStaffs ;
	private int cookingStaffs ;
	private int cleaningStaffs ;

	public void setWaiting(int waitingStaffs){//setter()  method
		this.waitingStaffs = waitingStaffs ;
	}

	public void setCooking (int cookingStaffs ){//setter()  method
		this.cookingStaffs  = cookingStaffs ;
	}

	public void setCleaning(int cleaningStaffs){//setter()  method
		this.cleaningStaffs = cleaningStaffs ;
	}

	public int getWaiting(){//getter()  method
		return waitingStaffs ;
	}

	public int getCooking(){//getter()  method
		return cookingStaffs ;

	}
    
    public int getCleaning(){//getter()  method
		return cleaningStaffs ;
	}
    
}





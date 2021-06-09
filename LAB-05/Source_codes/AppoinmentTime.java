class AppoinmentTime{

	
	String docName ,department ,time ;
	

	AppoinmentTime(String docName , String department,String time ){

		this.docName = docName ;
		this.department = department ;
		this.time = time  ;
		
		
	}

	public void docName(){

		System.out.println("Name of Doctor Dr."+docName) ;
	}

	public void department(){

		System.out.println("Department = "+department) ;
	}



	
	}

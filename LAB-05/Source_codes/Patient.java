class Patient{

	private String name , gender , appointmentDate , recommendedDoctor ;
	private int age ;
	private boolean isVacant ;

	
	

	public void setName(String name ){

		this.name = name ;
	}

	public void setAge(int age){

		this.age = age ;
	}

	public void setGender(String gender){

		this.gender = gender ;
	}

	public void setDate(String  appointmentDate){

		this.appointmentDate = appointmentDate ; 
	}

	public void setDoctor(String recommendedDoctor){

		this.recommendedDoctor = recommendedDoctor ;
	}

	public void setisVacant(boolean isVacant){

		this.isVacant = isVacant ;
	}

	public String getName( ){

		return name ;
	}

	public int getAge(){

		return age ;
	}

	public String getGender(){

		return gender ;
	}

	public String getDate(){

		return appointmentDate ;
	}

	public String getDoctor(){

		return recommendedDoctor ;
	}

	public boolean getisVacant(){

		return isVacant ;
	}
}





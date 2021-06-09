class Department {

     int totalDepartmentsOnDuty ;
     String departments ;
     String nameOfDoctors ;
     String qualifications ;

	Department(  int totalDepartments , String departments){

      //super(totalDoctors) ;
      this.totalDepartmentsOnDuty = totalDepartmentsOnDuty ;
      this.departments = departments ;

	}

	public void displayDepartment(){
      
      System.out.println("Total Departments On Duty that day = "+totalDepartmentsOnDuty) ;
      System.out.println("Name of the Departments = "+departments) ;

	}


}
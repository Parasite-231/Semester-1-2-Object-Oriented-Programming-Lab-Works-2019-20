class Surgery {

	String dept , qualifications ;
	int no ;

	Surgery(String dept , int no , String qualifications ){

		

		this.dept = dept ;
		this.no = no ;
		this.qualifications = qualifications;
	}
	void surgery(){

			System.out.println("Department = "+dept) ;
			System.out.println("Number of Doctors = "+no) ;
			System.out.println("Qualifications ="+qualifications) ;
		}
}
class Service {

	public static void main(String[] args){

     System.out.println("Patient Identity = ") ;
		Patient obj = new Patient() ;
        obj.setName("Robiul Haque") ;
        obj.setAge(76) ;
        obj.setGender("Male") ;
        obj.setDate("2 December , 2020") ;
        obj.setDoctor("Medicine Department") ;
        obj.setisVacant(true) ;
        System.out.println(obj.getName()) ;;
        System.out.println(obj.getAge()) ;;
        System.out.println(obj.getGender()) ;;
        System.out.println(obj.getDate()) ;;
        System.out.println(obj.getDoctor()) ;;

           System.out.println("Is Hospital bed is vacant?") ;
        System.out.println(obj.getisVacant()) ;;
        System.out.println() ;

        System.out.println("Recomended Doctor = ") ;

        AppoinmentTime obj2 = new AppoinmentTime("Dr.Tanzid Hossain","Medicine Especialist","Day:12.56 pm") ;
        obj2.docName() ;
        obj2.department() ;
        System.out.println() ;


        Department obj3 = new  Department(3,"Medice,Surgery and Oncology") ;
        obj3.displayDepartment() ;
        System.out.println() ;


    
       System.out.println("Departments and Qualifications of Doctor of each Departments  =") ;
        System.out.println() ;
		Oncology dept1 = new Oncology("Oncology",4,"MBBS ") ;
		dept1.ocanology() ;
		System.out.println() ;

		Medicine dept2 = new Medicine("Medicine",5,"MBBS and FCPS ") ;
		dept2.medicine() ;
		System.out.println() ;

		Surgery dept3 = new Surgery("Surgery",3,"MBBS and MRCP ") ;
		dept3.surgery() ;

	}
}
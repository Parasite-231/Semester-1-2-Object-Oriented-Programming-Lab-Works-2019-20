//LAB TASK 2 
public class Demo{

	public static void main (String[] args ){ //MAIN METHOD 

		System.out.println("Resturant - ") ;
		System.out.println() ;

		Resturant obj = new Resturant ("Sultans Dine","-->Location - 1st floor,Samsuddin Mansion, House: 41 Road: 52, Dhaka 1212. ") ;//CONSTRUCTOR USED
		System.out.println(obj.name) ;
		System.out.println(obj.location) ;

       
        Communication obj1 = new Communication ("-->E-Mail: sultandine@gmail.com","-->Website: www.findlocality.com/sultansdine.") ;//CONSTRUCTOR USED
        System.out.println(obj1.mail) ;
	    System.out.println(obj1.websiteAddress) ;

        System.out.println() ;
        System.out.println("Staffs - ") ;
        System.out.println() ;

        System.out.println("Many staffs work there who has a different identity like name, address, and mobile number.") ; 
        System.out.println("Staffs can be categorized into waiting staff, cleaning staff, cooking staff, etc.");
        System.out.println() ;

        System.out.println("Number of staffs - ") ;
        System.out.println() ;

        Staffs obj4 = new Staffs() ;
        //ENCAPSULATION USED AS WELL AS SETTER AND GETTER METHODS
        obj4.setWaiting(53) ;
        obj4.setCooking(22) ;
        obj4.setCleaning(25) ;

        System.out.println("----->Waiting Staffs - ") ;
        System.out.println(obj4.getWaiting()) ;;
        System.out.println("----->Cooking Staffs - ") ;
        System.out.println(obj4.getCooking()) ;;
        System.out.println("----->Cleaning Staffs - ") ;
        System.out.println(obj4.getCleaning()) ;;
        System.out.println() ;

        System.out.println("Besides,waiting staffs are two types,one is waiter and another is sommelier.") ;
        System.out.println() ;
       
        Branchstaffs obj8 = new Sommelier() ; //INHERITANCE USED
        //METHOD CALL
        obj8.waiter() ;
        obj8.sommelier() ;
        

        System.out.println() ;

        System.out.println("Contacts of Headstaffs - ") ; 
        System.out.println() ;

        Headstaffs obj5 = new Headstaffs("----->Mr.Rafiqul Bhuyian- Headchef","Responsibility - Looks after the whole cooking-System of the Resturant","E-mail: rafiqul@gmail.com",55440,"Phone: 0139965343","Residance- Floor 3rd, House no.120/24,Dhanmondi,Dhaka") ;
        //CONSTRUCTOR
        System.out.println(obj5.name) ;
        System.out.println(obj5.responsibility) ;
        System.out.println(obj5.email) ;
        System.out.println(obj5.id) ;
        System.out.println(obj5.phoneNumber) ;
        System.out.println(obj5.residance) ;

     

         Headstaffs obj6 = new Headstaffs("----->Mr.Safiqul Islam- Deputychef","Responsibility - Looks after the cook-staffs of the Resturant","E-mail: safiqul33@gmail.com",55441,"Phone: 0139965343","Residance- Floor 5th, House no.120/21,Shahjanpur,Dhaka") ;
        //CONSTRUCTOR
        System.out.println(obj6.name) ;
        System.out.println(obj6.responsibility) ;
        System.out.println(obj6.email) ;
        System.out.println(obj6.id) ;
        System.out.println(obj6.phoneNumber) ;
        System.out.println(obj6.residance) ;

      

        Headstaffs obj7 = new Headstaffs("----->Mr.Sohel Alam- Dishwasher-Head","Responsibility - Looks after the cleaning-System of the Resturant","E-mail: sohel22@gmail.com",55442,"Phone: 0139965344","Residance- Floor 1st, House no.110/45,Shobujbaag,Dhaka") ;
        //CONSTRUCTOR
        System.out.println(obj7.name) ;
        System.out.println(obj7.responsibility) ;
        System.out.println(obj7.email) ;
        System.out.println(obj7.id) ;
        System.out.println(obj7.phoneNumber) ;
        System.out.println(obj7.residance) ;
       



        System.out.println() ;
		System.out.println("Customer types - ") ;
		System.out.println() ;
		
		Customer obj3 = new Customer () ;
		//METHOD CALL
		obj3.person() ;
		obj3.identity() ;
		obj3.reserved() ;

		System.out.println() ;
		System.out.println("Regular Customer - ");
		System.out.println() ;

		Vipcustomer obj2 = new Vipcustomer("Name - Sakibal Hasan","Phone Number - 01306989578","Proffession - He is a cricketer of Bangladesh.","Residence - floor - 6th, House no.120/34 , Road no.Z3002, Dhanmondi , Dhaka");
		//CONSTRUCTOR
		System.out.println(obj2.name) ;
		System.out.println(obj2.phoneNumber) ;
		System.out.println(obj2.identity) ;
		System.out.println(obj2.address) ;
        obj2.regular() ;//METHOD CALL

      }
}
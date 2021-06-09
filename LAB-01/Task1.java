public class Task1{

	public static void main (String[] args){
		System.out.println("Friends:") ;
        System.out.println() ;

		Persons obj1 = new Persons("Raiyan"," -is a good programmer,he performs his coding task.") ;//object created for constructor person in person class
        System.out.println(obj1.name) ;
        System.out.println(obj1.abilities) ;


		Persons obj2 = new Persons("Anika"," -likes to sing and play guitar. ") ;
		System.out.println(obj2.name);
		System.out.println(obj2.abilities);

        Persons obj3 = new Persons("Tahsin"," -dances in different festivals.") ;
         System.out.println(obj3.name);
         System.out.println(obj3.abilities);
         System.out.println() ;

         Persons obj4 = new Persons("Salman"," -is a good guy.") ;
         System.out.println(obj4.name);
         System.out.println(obj4.abilities);
         System.out.println() ;

         System.out.println("Proffesions:") ;
        
		
         Members obj = new Members() ; //object created from class members

		obj.setWork("Raiyan works for a company as a junior software engineer");
		obj.setMember("Anikla is a member of the Imaginary brand where she performs as the lead vocalist.");
		obj.setStudent("Tahsin dances in different festivals as a member of the Elite Group of Choturongo Shilpokola Academy. ") ;

		System.out.println() ;


		System.out.println(obj.getWork()) ;;
		System.out.println(obj.getMember()) ;;
		System.out.println(obj.getStudent()) ;;

		System.out.println() ;
        System.out.println("Activities:") ;
        System.out.println() ;

       
        Raiyan obj6 = new Raiyan() ; //OBJECT CREATED FOR INHERITED CLASS RAIYAN
        obj6.live() ;
        obj6.sleep() ;
        obj6.learn() ;

        Tahsin obj8 = new Tahsin() ;//OBJECT CREATED FOR INHERITED CLASS TAHSIN
        obj8.sleep() ;


   }
}
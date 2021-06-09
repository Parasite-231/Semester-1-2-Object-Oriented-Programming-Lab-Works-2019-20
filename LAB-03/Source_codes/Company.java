public class Company {

	public static void main (String[] args){

		System.out.println("Samsung software company has different employees. ") ;
        System.out.println("Each employee has a name, address, email, and identity number.") ;

        EmployeeIdentity perm = new EmployeeIdentity("Hasibul islam - permanent employee","hasibul@gmail.com","123-778-77") ;
        System.out.println(perm.name) ;
        System.out.println(perm.email) ;
        System.out.println(perm.id) ;


        EmployeeIdentity temp = new EmployeeIdentity("Rafiqul  islam - temporary employee ","Rafiqul@gmail.com","233-888-90") ;
        System.out.println(temp.name) ;
        System.out.println(temp.email) ;
        System.out.println(temp.id) ;
       
        EmployeeIdentity honor = new EmployeeIdentity("Safiqul islam - honoury employee","Safiqul @gmail.com","444-555-88") ;
        System.out.println(honor.name) ;
        System.out.println(honor.email) ;
        System.out.println(honor.id) ;


        System.out.println("Salaries of above employess are stated respectively according to their positions in the company ") ;

        EmployeeSalary salaries = new EmployeeSalary() ;
		salaries.setPermanent("As a permanent employee gets a 60% bonus of basic salary, 50% for the festival bonus.") ;
		salaries.setTemporary("As a temporary employee gets a 30% bonus of basic salary, 10% for the festival bonus.") ;
		salaries.setHonoury("An honorary employee gets 5% of basic and no festival bonus") ;
		
		System.out.println(salaries.getPermanent()) ;;
		System.out.println(salaries.getTemporary()) ;;
		System.out.println(salaries.getHonoury()) ;;
		



	}
}
public class Employees{
	public static void main (String[] args ){

		Employee obj = new Employee() ;
		obj.setNme("md fazlul") ;
		obj.setEmail("mdl@gmail.com") ;
		obj.setId("18986") ;
		
		System.out.println(obj.getName()) ;;
		System.out.println(obj.getEmail()) ;;
		System.out.println(obj.getId()) ;;
		
	}

}
 

public class Employee {
	
	private final String name;
	private String id ;
	private String email;
	
	
	public Employee(String name, String email, String  id) {
		this.name = name;
		this.email = email;
		this.id = id
	
	}
	
	
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}

	
	public String getEmail() {
		return email;
	}

	public String getId() {
		return Id;
	}

	
	


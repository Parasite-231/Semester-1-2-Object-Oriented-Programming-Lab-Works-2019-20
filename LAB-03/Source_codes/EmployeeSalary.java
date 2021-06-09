public class EmployeeSalary{
	
    private	String salaryP,salaryT,salaryH ;

	 public void setPermanent(String salaryP){
		this.salaryP = salaryP;
	} 
	public void setTemporary(String salaryT){
		this.salaryT = salaryT ;
	}
	public void setHonoury(String salaryH){
		this.salaryH = salaryH ;
	}
	

	public String getPermanent(){
		return salaryP ;
	}
	public String getTemporary(){
		return salaryT ;
	}
	public String getHonoury(){
		return salaryH ;
	}
	
	
}
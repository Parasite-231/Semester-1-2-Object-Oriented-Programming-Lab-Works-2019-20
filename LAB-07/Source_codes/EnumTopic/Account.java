package EnumTopic;

public class Account {
	
	private String no;
	private Person owner;
	private AccountType type;
	
	public Account(String no, Person owner, AccountType type) {
		this.no = no;
		this.owner = owner;
		this.type = type;
	}
	
	public void print() {
		System.out.println("Account No: " + no);
		System.out.println("Account Owner: " + owner.getName());
		type.print();
	}
}

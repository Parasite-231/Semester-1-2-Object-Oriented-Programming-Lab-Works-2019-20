package EnumTopic;

public class Main {
	
	public static void main(String[] args) {
		Person person = new Person("Eren", 18);
		Account account = new Account("434", person, AccountType.PLATINUM);
		account.print();
		Account account1 = new Account("434", person, AccountType.DIAMOND);
		account1.print();
	}
	
}

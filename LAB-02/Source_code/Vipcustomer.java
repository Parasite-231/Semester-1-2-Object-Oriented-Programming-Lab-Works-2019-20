public class Vipcustomer extends Customer{//INHERITANCE CONCEPT

	protected String name , phoneNumber , identity , address ;

	protected Vipcustomer(String name , String phoneNumber ,String identity, String address){//CONSTRUCTOR Vipcustomer

		this.name = name ;
		this.phoneNumber = phoneNumber ;
		this.identity = identity ;
		this.address = address ;
	}

	protected void regular(){
		System.out.println("He is one of the regular customers of the resturant.He used to come with his family on every Friday.The resturant always offers him extra Discounts") ;
	}

}
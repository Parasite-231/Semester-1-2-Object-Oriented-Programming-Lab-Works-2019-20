package EnumTopic;

public enum AccountType {
	
	BRONZE {
		@Override
		void print() {
			System.out.println("Account type is Bronze.");
		}
	}, SILVER {
		
		@Override
		void print() {
			System.out.println("Account type is Silver.");
		}
	}, GOLD {
		
		@Override
		void print() {
			System.out.println("Account type is Gold.");
		}
	}, PLATINUM {
		@Override
		void print() {
			System.out.println("Account type is Platinum.");
		}
	}, DIAMOND {
		@Override
		void print() {
			System.out.println("Account type is Diamond.");
		}
		
	};
	
	void print() {
	}
}
//EXCERCISE 5

public class Demo extends ArithmeticClass implements Squarable{
	
	
	public double square(double x) {
		return x * x;
	}
	
	public boolean isPrime(int x) {
		
		int root = (int) Math.sqrt(x) + 1;//using math library functiuons

		int i = 2; 
		
		while (i <= root) {//using loops

			i++ ;
			
			if (x % i == 0) 
				return false;
		}
		
		return true;
	}
	
	public boolean isEven(int x) {
		return (x % 2 == 0);
	}
	
}

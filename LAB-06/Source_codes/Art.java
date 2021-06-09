public class Art {
	
	
	public static void main(String[] args) {
		
		Picture picture = new Picture();
		Painter painter = new Painter(picture);


		
		painter.draw(new House(new Point(0, 1), 5, 4)); //SENDING MEASURMENTS
		System.out.println("******************MY HOUSE********************** ") ;

		System.out.println("House color = Brown + Blue") ;
	}
}

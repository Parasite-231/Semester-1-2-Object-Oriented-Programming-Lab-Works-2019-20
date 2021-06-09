public class House implements IShape { //USE OF INTERFACE
	
	private Point rooftop;
	private float width, height;
	
	private Triangle roof;
	private Rectangle room;
	
	public House(Point rooftop, float width, float height) {
		this.rooftop = rooftop;
		this.width = width;
		this.height = height;
		constructHouse();
	}
	
	private void constructHouse() { //CALCULATING CO-ORDINATES USING MATHS
		
		Point[] roofBase = {
				new Point(rooftop.getX() - width / 2, rooftop.getY() + height / 2),
				new Point(rooftop.getX() + width / 2, rooftop.getY() + height / 2)
		};
		roof = new Triangle(rooftop, roofBase[0], roofBase[1]);
		
		Point[] roomBase = {
				new Point(roofBase[0].getX(), rooftop.getY() + height),
				new Point(roofBase[1].getX(), rooftop.getY() + height)
		};
		
		room = new Rectangle(roofBase[0], roofBase[1], roofBase[0], roomBase[1]);
	}
	
	@Override
	public void draw() {
		roof.draw(); //USE OF ROOF- DRAW METHOD USING INTERFACE 
		room.draw(); //ISE OF ROOM- DRAW METHOD USING INTERFACE
	}
}

public class Triangle implements IShape{ //TRIANGE SHAPE MEASURMENTS
	
	
	private final Point[] vertices;
	
	public Triangle(Point... vertices) {
		this.vertices = new Point[3];
		this.vertices[0] = vertices[0];
		this.vertices[1] = vertices[1];
		this.vertices[2] = vertices[2];
	}
	
	@Override
	public void draw() {
		System.out.println("Triangle drawn with " + vertices[0] + ", " + vertices[1] + " and  " + vertices[2]);
		System.out.println("-------------------->Triangle color = Blue") ;
	}

}

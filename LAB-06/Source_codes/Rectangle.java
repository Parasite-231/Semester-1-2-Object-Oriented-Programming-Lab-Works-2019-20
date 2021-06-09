import java.util.Arrays;

public class Rectangle implements IShape {////RECTANGLE SHAPE MEASURMENTS
	
	private final Point[] vertices;
	
	public Rectangle(Point... vertices) {
		this.vertices = new Point[4];
		this.vertices[0] = vertices[0];
		this.vertices[1] = vertices[1];
		this.vertices[2] = vertices[2];
		this.vertices[3] = vertices[3];
	}
	
	@Override
	public void draw() {
		System.out.println("Rectangle drawn with " + vertices[0] + ", " + vertices[1] + ", " + vertices[2] + " and " + vertices[3]);
		System.out.println("--------------------->Rectangular color = Brown") ;
	}
	
}

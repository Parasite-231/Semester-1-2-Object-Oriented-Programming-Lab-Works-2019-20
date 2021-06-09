import java.util.Arrays;

public class LineSegment implements IShape { //USE OF INTERFACE
	
	private final Point[] endPoints;
	
	public LineSegment(Point... endPoints) {
		this.endPoints = new Point[2]; //USE OF ARRAY LISTS
		this.endPoints[0] = endPoints[0];
		this.endPoints[1] = endPoints[1];
	}
	
	@Override
	public void draw() {
		System.out.println("Line segment drawn from " + endPoints[0] + " to " + endPoints[1]);
		System.out.println("--------------------->Line Segment color = White") ;
	}
	
}

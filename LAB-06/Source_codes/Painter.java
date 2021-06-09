public class Painter {
	
	private Picture picture; //ASSOCIATIONS
	
	public Painter(Picture picture) {
		this.picture = picture;
	}
	
	public void draw(IShape shape) {
		picture.shapes.add(shape);
		shape.draw();
	}
}

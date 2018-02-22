package prob6;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	
	public RectTriangle() {
	
	}

	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	public double getArea() {
		return width * height * 0.5;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return width + height + Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
	}
}

package prob6;

public class Rectangle extends Shape implements Resizable{
	private double width;
	private double height;
	
	public Rectangle() {
	
	}
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double value) {
		width = width * value;
		height = height * value;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return (width + height) * 2;
	}

}

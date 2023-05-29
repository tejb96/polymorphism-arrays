
public class Rectangle extends Shape2D{

	
	public Rectangle() {
		this(1.0,  2.0);
	}

	public Rectangle(double w, double h) {
		super(w, h);
	}

	@Override
	public double getCircumference() {
		return 2 * (this.getHeight() + this.getWidth());
	}

	@Override
	public double getArea() {
		return this.getHeight() * this.getWidth();
	}
}


public class RightTriangle extends Shape2D {

	public RightTriangle() {
		// TODO Auto-generated constructor stub
		this(1.0,  2.0);
	}

	public RightTriangle(double w, double h) {
		super(w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCircumference() {
		// TODO Auto-generated method stub
		double heightPlusWidth = Math.pow(this.getHeight(), 2)+Math.pow(this.getWidth(), 2);
		
		double hypot = Math.pow(heightPlusWidth, 0.5);
				
		return (this.getHeight() + this.getWidth() + hypot);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5 * this.getHeight() * this.getWidth();
	}

}

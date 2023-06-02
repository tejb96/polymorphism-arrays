
public class Square extends Shape2D {

	public Square() {
		// TODO Auto-generated constructor stub
		this(2.0);
	}

	public Square(double w) {
		super(w, w);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCircumference() {
		// TODO Auto-generated method stub
		return 4 * (this.getHeight());
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.getHeight()*this.getHeight());
	}

}

/**
 * Represents a square shape in two-dimensional space and is a sub-class of {@link Shape2D}.
 * 
 * @author Tej
 */
public class Square extends Shape2D {

	 /**
     * Constructs a square with a default side length of 2.0.
     * The width and height of the square will be set to the same value.
     */
	public Square() {
		// TODO Auto-generated constructor stub
		this(2.0);
	}

	 /**
     * Constructs a square with the specified side length.
     * The width and height of the square will be set to the same value.
     *
     * @param l the length of each side of the square
     */
	public Square(double l) {
		super(l, l); 
		// TODO Auto-generated constructor stub
	}

	/**
	 * Calculates and returns the circumference of the shape.
	 *
	 * @return the circumference of the shape
	 */
	@Override
	public double getCircumference() {
		// TODO Auto-generated method stub
		return 4 * (this.getHeight());
	}

	/**
	 * Calculates and returns the area of the shape.
	 *
	 * @return the area of the shape
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.getHeight()*this.getHeight());
	}
	
	 /**
     * Sets the width and height of the square to the same value.
     *
     * @param w the length of each side of the square
     */
	@Override
	public void setWidth(double w) {
		super.setWidth(w);
		super.setHeight(w);
	}
	
	 /**
     * Sets the width and height of the square to the same value.
     *
     * @param h the length of each side of the square
     */
	@Override
	public void setHeight(double h) {
		super.setWidth(h);
		super.setHeight(h);
	}

}

/**
 * Represents a right triangle shape in two-dimensional space.
 * 
 * @author Tej
 */
public class RightTriangle extends Shape2D {
	
	 /**
     * Constructs a right triangle with default base and height values of 1.0 and 2.0 respectively.
     * 
     */
	public RightTriangle() {
		// TODO Auto-generated constructor stub
		this(1.0,  2.0);
	}

	 /**
     * Constructs a right triangle with the specified base and height values.
     * The base and height of the triangle will be set to the specified values.
     *
     * @param w the base length of the right triangle
     * @param h the height of the right triangle
     */
	public RightTriangle(double w, double h) {
		super(w, h);
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
		double heightPlusWidth = Math.pow(this.getHeight(), 2)+Math.pow(this.getWidth(), 2);
		
		double hypot = Math.pow(heightPlusWidth, 0.5);
				
		return (this.getHeight() + this.getWidth() + hypot);
	}

	/**
	 * Calculates and returns the area of the shape.
	 *
	 * @return the area of the shape
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5 * this.getHeight() * this.getWidth();
	}

}

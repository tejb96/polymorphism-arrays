/**
 * Represents a rectangle shape in two-dimensional space.
 * 
 */
public class Rectangle extends Shape2D implements IShapePoints{

	private Point2D referencePoint; // Instance variable of type Point2D
	
	/**
     * Constructs a rectangle with default width and height values of 1.0 and 2.0 respectively.
     * 
     */
	public Rectangle() {
		this(1.0,  2.0);
	}

	 /**
     * Constructs a rectangle with the specified width and height values.
     * The width and height of the rectangle will be set to the specified values.
     * Initializes instance variable to represent default ref point at (0,0)
     *
     * @param w  the width of the rectangle
     * @param h the height of the rectangle
     */
	public Rectangle(double w, double h) {
		super(w, h);
		this.referencePoint = new Point2D(0, 0); 
	}

	/**
	 * Calculates and returns the circumference of the shape.
	 *
	 * @return the circumference of the shape
	 */
	@Override
	public double getCircumference() {
		return 2 * (this.getHeight() + this.getWidth());
	}

	/**
	 * Calculates and returns the area of the shape.
	 *
	 * @return the area of the shape
	 */
	@Override
	public double getArea() {
		return this.getHeight() * this.getWidth();
	}

	 /**
     * Retrieves the reference point of the rectangle.
     *
     * @return a copy of the reference point of the rectangle as a Point2D object
     */
	@Override
	public Point2D getReferencePoint() {
		// TODO Auto-generated method stub		
		return new Point2D(referencePoint);
	}

	/**
     * Sets the reference point of the rectangle to the specified Point2D object.
     *
     * @param p the new reference point of the rectangle
     */
	@Override
	public void setReferencePoint(Point2D p) {
		// TODO Auto-generated method stub
		this.referencePoint = new Point2D(p);
	}

	@Override
	public Point2D[] getAllShapePoints() {
		// TODO Auto-generated method stub
		Point2D topRight = new Point2D(this.referencePoint.x + this.getWidth(), this.referencePoint.y + this.getHeight());
        Point2D bottomRight = new Point2D(this.referencePoint.x+ this.getWidth(), this.referencePoint.y);
        Point2D topLeft = new Point2D(this.referencePoint.x, this.referencePoint.y + this.getHeight());
		return new Point2D [] {this.referencePoint, bottomRight, topLeft, topRight};
	}
}

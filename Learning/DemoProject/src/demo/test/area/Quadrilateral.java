package demo.test.area;

public class Quadrilateral extends Triangle{
	
	private Point p2,  p3;
	private Point p4;

	public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
		super(p1, p2, p3);
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	
	
	@Override
	public double getArea() {
		return getArea() + getArea();
		//return super.getArea() + new Triangle(p2,p3,p4).getArea();
	}

}

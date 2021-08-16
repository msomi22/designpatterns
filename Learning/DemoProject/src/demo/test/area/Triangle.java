package demo.test.area;

public class Triangle {
	
	private Point p1,p2,p3;
	
	public Triangle() {
		
	}
	
	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	

	public double getArea() {
		/**
		 * a = p1 and p2 
		 * b = p2 and p3
		 * c = p3 and p1
		 * 
		 */
		double a = distance(p1, p2);
		double b = distance(p2, p3);
		double c = distance(p3, p1);
		/**
		 * Heron's formula
		 * s = perimeter
		 * sqrt of s((s-a) (s-b) (s-c)) 
		 */
		double s = (a + b + c)/2;
		return Math.sqrt(s * ((s-a) * (s-b) * (s-c)));
	}
	
	static double distance(Point p1, Point p2) {
		int dx = (p1.x-p2.x);
		int dy = (p1.y-p2.y);
		dx *=dx;
		dy *=dy;
		return Math.sqrt(dx+dy); 
	}

}

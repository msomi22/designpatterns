package demo.test.area;

public class Test {

	public static void main(String[] args) {

		Point p1 = new Point(-3, 1);
		Point p2 = new Point(-1, 4);
		Point p3 = new Point(3, 2);
		Triangle t = new Triangle(p1,p2,p3);
		System.out.println(t.getArea());
	
		Point p4 = new Point(1, -2);
		Triangle t2 = new Triangle(p2,p3,p4);
		System.out.println(t2.getArea());
		
		
		Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
		System.out.println(q.getArea());

	}

}

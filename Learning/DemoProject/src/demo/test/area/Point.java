package demo.test.area;

public class Point {

	int x;
	int y;

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(int x, int y) {
		if ((x >= -100 || x <= 100) && (y >= -100 || y <= 100)) {
			this.x = x;
			this.y = y;
		}else {
			new Point();
		}
	}

}

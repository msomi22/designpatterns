package pattern.structural.flyweight;

import java.util.Date;

public class Demo {

	static int numberOfShape = 100000;
	static String[] colors = { "RED", "BLACK", "GREED", "BLUE", "GRAY", "YELLOW", "WHITE" };

	public static void main(String[] args) {
       
		long start = new Date().getTime();
		for (int i = 0; i < numberOfShape; i++) {
			Shape shape = ShapeFactory.getShapeByColor(getColor());
			shape.setWidth(getRand(20));
			shape.setBredth(getRand(40));
			shape.setHight(getRand(60));
		}
		long end = new Date().getTime();
		System.out.println("Duration: " + (end - start));

	}

	private static int getRand(int max) {
		return (int) Math.random() * max;
	}

	private static String getColor() {
		return colors[(int) (Math.random() * colors.length)];
	}
}

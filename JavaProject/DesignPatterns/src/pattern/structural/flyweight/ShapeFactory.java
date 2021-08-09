package pattern.structural.flyweight;

import java.util.*;

public class ShapeFactory {
	
	public static Map<String,Shape> shapeMap = new HashMap<>();
	
	public static Shape getShapeByColor(String color) {
		Shape shape = shapeMap.get(color);
		if(null == shape) {
			//System.out.println("new share created for color " + color);
			shape = new Shape(color);
			shapeMap.put(color, shape);
			return shape;
		}else {
			return shape;
		}
	}

}

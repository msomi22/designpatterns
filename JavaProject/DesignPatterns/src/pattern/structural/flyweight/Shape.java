package pattern.structural.flyweight;

public class Shape {
	
	private String color;
	private int width;
	private int hight;
	private int bredth;
	
	public Shape(String color) {
		this.color = color;
		this.width = 0;
		this.hight = 0;
		this.bredth = 0;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public void setBredth(int bredth) {
		this.bredth = bredth;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", width=" + width + ", hight=" + hight + ", bredth=" + bredth + "]";
	}
}

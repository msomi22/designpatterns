package pattern.creational.prototype;

public class Car implements Cloneable{

	private String model;
	private String bodyType;
	private String color;
	private String engineSize;
	private String gears;
	private String fuelType;

	public Car() {
		this.model = "";
		this.bodyType = "";
		this.color = "";
		this.engineSize = "";
		this.gears = "";
		this.fuelType = "";
	}

	public Car(String model, String bodyType, String color, String engineSize, String gears, String fuelType) {
		this.model = model;
		this.bodyType = bodyType;
		this.color = color;
		this.engineSize = engineSize;
		this.gears = gears;
		this.fuelType = fuelType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	public String getGears() {
		return gears;
	}

	public void setGears(String gears) {
		this.gears = gears;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", bodyType=" + bodyType + ", color=" + color + ", engineSize=" + engineSize
				+ ", gears=" + gears + ", fuelType=" + fuelType + "]";
	}
	
	@Override
	public Object clone() {
		Car car = this;
		return car;
	}

}

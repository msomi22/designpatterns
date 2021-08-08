package pattern.creational.prototype;

public class Demo {

	public static void main(String[] args) {
		
		Car car = new Car("Saga", "Sedan", "Pear", "1400", "4", "Petrol");
		System.out.println(car);
		
		Car car2 = (Car)car.clone();
		System.out.println(car);
		System.out.println(car2);
		car2.setColor("Gray");
		System.out.println(car2);

	}

}

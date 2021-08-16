package day.five.dpattersn.factory.simple;

import java.util.Random;

public class MyTest {

	public static void main(String[] args) {
		String s = "123^2834dhcjddd";
		String[] parts = s.split("\\^", -1);
		
		if (parts.length == 2) {
			System.out.println("" + parts[0] + " >>> " +  parts[1]);
		}
		
		Random rand = new Random();
		//rand.nextInt(30);
		System.out.println(rand.nextInt(30));

	}

}

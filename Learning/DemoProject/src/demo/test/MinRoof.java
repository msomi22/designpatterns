package demo.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MinRoof {

	public static void main(String[] args) {

		/*
		 * int size = 10; UM um = new UM(size);//uf um.print();
		 * System.out.println("0-4 = " + um.isConnected(0, 4)); um.union(0, 4);
		 * System.out.println("0-4 = " + um.isConnected(0, 4)); um.print();
		 * 
		 * System.out.println("1-2 = " + um.isConnected(1, 2)); um.union(1, 2);
		 * System.out.println("1-2 = " + um.isConnected(1, 2)); um.print();
		 * 
		 * System.out.println("1-3 = " + um.isConnected(1, 3)); um.union(1, 3);
		 * System.out.println("1-3 = " + um.isConnected(1, 3)); um.print();
		 */
		
		
		//System.out.println(Math.acos(.12));
		//System.out.println(Math.cos(90));
		
		System.out.println(distance(4, 3, 3, -2));
		
	}
	
	static double distance(int x1,int y1, int x2, int y2) {
		int dx = (x1-x2);
		int dy = (y1-y2);
		dx *=dx;
		dy *=dy;
		return Math.sqrt(dx+dy);
	}


}

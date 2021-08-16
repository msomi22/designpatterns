package demo.test;

public class Demo1 {

	public static void main(String[] args) {
		
		double m = 16328472;
		double total = (m / (1024 * 1024));
		
		
		double m1 = 225696;
		double free = (m1 / (1024 * 1024));
		
		System.out.println("====" + total);
		System.out.println("====" + free);
		System.out.println("====" + (free/total*100));
		System.out.println("====" + (0.5/15*100));
		
		/**
		MemTotal:       16328472 kB
        MemFree:          225696 kB


		 */
		
		
		/*
		 * int max = 3; int control = 5000; for(int i=0; i<=max;i++) { if(i % control ==
		 * 0 && i > 0) { System.out.println(i + " chunk to add..."); }else { if((i ==
		 * max) && ( (i < control) || (i > control))) { //line less that the set control
		 * OR last chunk less than control System.out.println(i +
		 * " **line less that the " + "set control OR last chunk less than control " +
		 * (i%control)); } } }
		 */

	}

}

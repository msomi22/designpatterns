package day.four.simplelearn;

import java.lang.reflect.Method;
import java.util.*;

public class Demo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Demo dd = new Demo();
		WeTest t = dd.new WeTest();
		t.dosomething();
		t.test();

		Integer a = 1000, b = 1000;
		System.out.println(a == b);

		Integer c = 100, d = 100;
		System.out.println(c == d);
		
		
		String s1="home";
		String s2="mohe";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean result = new String(c1).equals(new String(c2));
		System.out.println(result);
		
		List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50)); 
		GenericType<Integer> type = new GenericType<Integer>(50);
		System.out.println(list);
		System.out.println(type);
		
		int mine = 3_000_500;
		System.out.println(mine);
		
		Day fri = Day.FRI;
		System.out.println(fri.name());
		System.out.println(fri.getValue());
		System.out.println(Day.FRI.getValue()); 
		
		AnnotationDemo anno = new AnnotationDemo();
		Method m = anno.getClass().getMethod("testAnnotation");
		
		MarkerAnnotation ma = m.getAnnotation(MarkerAnnotation.class);
		
		System.out.println(ma.value());
		
		

	}

	public class WeTest extends Test1 implements App1, App2 {

		public WeTest() {

		}

		void test() {
			// dosomething();
			// super.dosomething();
		}

		@Override
		public void dosomethingA() {
			dosomethingA();
			// prints Class Test1 @dosomething
		}
	}

	interface App1 {
		public default void dosomethingA() {
			System.out.println("Interface App1 @dosomethingA");
		}
	}

	interface App2 {
		public default void dosomethingA() {
			System.out.println("Interface App2 @dosomethingA");
		}
	}

	class Test1 extends Test2 {
		public Test1() {
			super();
		}

		public void dosomething() {
			System.out.println("Class Test1 @dosomething");
		}
	}

	class Test2 {
		public void dosomething() {
			System.out.println("Class Test1 @dosomething");
		}
	}
}

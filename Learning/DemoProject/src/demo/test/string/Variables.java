package demo.test.string;

public class Variables extends Test1{
	
	public Variables(int a, String b) {
		super(a, b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y = 10; //decimal 10
		int a = 010;//octal number 8
		int b = 0xab;//hexadecimal number 171
		
		System.out.println(a);
		System.out.println(b);
		
		char c = 65;//ascii code of A
		char d = '\u0041';//unicode or hexadecimal value of A
		
		System.out.println(c);
		System.out.println(d);
		
		/**
		 * method area in JVM ===code/methods is loaded here
		 * static variables are stored here too.
		 * 
		 * primitive instance variables get memory allocated in heap
		 * 
		 * 
		 * Primitive variables are stored in stack memory...
		 * What about primitive class variables?
		 */

	}

}

package demo.test.string;

public class Test1 {
	
	int a;
	String b;
	
	public Test1(int a, String b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		
		String text = "abcdabcabcdf";
		String s = "abcdf";
		int i = 0;
		for(char ch : text.toCharArray()) {
			char a = s.charAt(i);
			if(ch == a) {
				//match
				System.out.println(i + " match " + ch + " and " + a);
				i++;
			}else {
				//no match
				System.out.println(i + " no match " + ch + " and " + a);
				i = 0;
			}
			
		}

	}

}

package day.two;

public class StringDemo {

	public static void main(String[] args) {
		
		String[] testData = {"100akhh999lh564abc365bg", "100","aaaa","",null,"100a99999b7000"};
		for (int i = 0; i < testData.length; i++) {
			System.out.println(solution(testData[i]));
		}
	}
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static int solution(String s) {
		if(null == s ||s.isEmpty()) return 0;
		int count = 0;
		int num = 0, max = 0, prev = 0;
		for (char ch : s.toCharArray()) {
			int val = (int) ch;
			if (val < 97) {
				if (count == 0) {
					num = (val - 48) * 1;
				} else {
					num = (num * 10) + (val - 48);
				}
			} else {
				// System.out.println("0");
				count = 0;
				if (num > 0) {
					prev = num;
				}
				num = 0;
			}
			if (num > prev) {
				max = num;
			}
			count++;
		}
		return max;
	}

}

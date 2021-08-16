package day.one;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String valueString = "384360794";// 3843607.94
		int len = valueString.length();
		int offset = 0;
		int start = 2;
		System.out.println("valueString=" + valueString.substring(start,len - offset));
		double decimals = 2;
		BigDecimal valueLong = new BigDecimal((valueString).trim()).divide(new BigDecimal(Math.pow(10, decimals)));
		//valueString = valueLong.toPlainString();

		System.out.println("valueString=" + valueString);
		System.out.println("valueString=" + round(valueString,"2"));
		
		try {
            int index = 0;
            String thechar = ".";
            if (valueString.contains(thechar)) {
                valueString = valueString.split("\\.")[index];
                System.out.println("valueString=====" + Arrays.toString(valueString.split("//"+thechar)));
            }
        } catch (Exception e) {

        }
		
		System.out.println("valueString=" + valueString);

	}

	public static String round(String amount, String precision) {
		BigDecimal amountD = round(new BigDecimal(amount), new BigDecimal(precision), RoundingMode.DOWN);
		return amountD.toString();
	}
	
	public static BigDecimal round(BigDecimal value, BigDecimal increment,
            RoundingMode roundingMode) {
        if (increment.signum() == 0) {
            // 0 increment does not make much sense, but prevent division by 0
            return value;
        } else {
            BigDecimal divided = value.divide(increment, 0, roundingMode);
            BigDecimal result = divided.multiply(increment);
            return result;
        }
    }

	public static String invert(char[] s) {
		if (null == s)
			return "";
		String out = "";
		int n = s.length - 1;
		for (int i = 0; i < n; i++, n--) {
			char temp = s[i];
			s[i] = s[n];
			s[n] = temp;
		}
		for (char c : s)
			out += c;
		return out;
	}

}

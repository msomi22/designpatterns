package day.one;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

public class DynamicProgramming_Fib {

	//private static Map<Integer, Integer> memo = new HashMap<>();
	//https://www.youtube.com/watch?v=oBt53YbR9Kk&t=385s

	public static void main(String[] args) {
		int n = 7;
		/**
		 * 12,586,269,025
		 * 12586269025
		 * 
		 * 7.896325826131728E51
		 * 7.896325826131728e+51
		 * 7.8963258261317305093E+51
		 * F250 = 7896325826131730509282738943634332893686268675876375    https://www.omnicalculator.com/math/fibonacci
		 * F250 = 7896325826131727506236816023580005726635406431092736    java
		 * F250 = 7896325826131730164692807593411751534249526991781888     https://keisan.casio.com/exec/system/1180573404
		 * F250 = 7896325826131730509282738943634332893686268675876375     https://www.dcode.fr/fibonacci-numbers
		 * F250 = 7896325826131730509282738943634332893686268675876375     https://calculators.io/fibonacci/
		 *                      |
		 */
		//System.out.println(new BigDecimal(7.8963258261317305093E+51));
		/*System.out.println(new BigDecimal(fib(n)));
		
		Map<Integer,Integer> a = new HashMap<>();
		System.out.println(new BigDecimal(fib(n, a)));*/
		
		boolean state = expiredToken("20210609151723", "123456789");
		System.out.println(state);
		//System.out.println(!state);
		if(!state) {
			System.out.println("return current param");
			return;
		}
		System.out.println("exipred token - get new");
		
		/*if(state){
			System.out.println("exipred token - get new");
        }else{
        	System.out.println("return current param");
        }*/
	}
	
	public static boolean expiredToken(String timeStamp,String transactioncode) {
        try{
        Date date = new Date();
        SimpleDateFormat timeNow = new SimpleDateFormat("YYYYMMddHHmmss");
        long currentTimestamp = Long.parseLong(timeNow.format(date) + "");
        if(timeStamp == null || timeStamp.isEmpty()){
        	System.out.println("TXN ID : " + transactioncode + " : tokenGenerator | CurrentTimestamp - " + currentTimestamp + " greater than loggedTimestamp - " + timeStamp);
            return true;
        }
        long loggedTimestamp = Long.parseLong(timeStamp.trim());
        if (currentTimestamp < loggedTimestamp - 5 * 60) {
        	System.out.println("TXN ID : " + transactioncode + " : tokenGenerator | CurrentTimestamp - " + currentTimestamp + " less than loggedTimestamp - " + loggedTimestamp+ " >> Skip token Retrival Step");
            return false;
        } else {
        	System.out.println("TXN ID : " + transactioncode + " : tokenGenerator | CurrentTimestamp - " + currentTimestamp + " greater than loggedTimestamp - " + loggedTimestamp);
            return true;
        }
        } catch (Exception ex) {
        	System.out.println("TXN ID : " + transactioncode + " : tokenGenerator | expiredToken | Exception " + ex.getMessage());
            return true;
        }
    }

	

	private static int fib(int n, Map<Integer, Integer> a) {
		if(a.containsKey(n)) return a.get(n);
		if(n<2) return n;
		a.put(n, fib(n-1, a) + fib(n-2, a));
		//System.out.println("#");
		return a.get(n); 
	}



	private static double fib(int n) {
		double[] memo = new double[n + 1];
		return fibMemoize(n, memo);
	}

	private static double fibMemoize(int n, double[] memo) {
		//System.out.println(n+" == "+memo[n] + " ==" +memo[6]);
		if (n < 2)
			return n;
		if (memo[n] != 0)
			return memo[n];
		return memo[n] = fibMemoize(n - 1, memo) + fibMemoize(n - 2, memo);
	}
}

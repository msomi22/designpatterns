package demo.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Demo {
	
	private static Map<String, String> hddInfo = new LinkedHashMap<>();


	public static void main(String[] a) {

		String cmd = "df -h";
		System.out.println("=== getting HDD info");
		exec(cmd);
		System.out.println("=== done");
		
	}

	/**
	 */
	static void exec(String cmd) {
		try {
			Runtime run = Runtime.getRuntime();
			Process pr = run.exec(cmd);
			pr.waitFor();
			BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line;
			int count = 0;
			while ((line = buf.readLine()) != null) {
				String[] parts = line.split("\\ ", -1);
				int data = 0;
				for(String s : parts) {
					if(!s.isBlank()) {
						 hddInfo.put(count+"-"+data, s);
						 data++;
					}
				}
				System.out.println("=============== " + count + " ================");
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println();
		//System.out.println(hddInfo);
		hddInfo.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
	}

}

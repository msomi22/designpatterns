package host.resouce.monitor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class HDD {
	
	private  Map<String, String> hddInfo = new LinkedHashMap<>();
	
	public HDD() {
		hddInfo= exec("df -h");
	}
	
	/**
	 */
	private Map<String, String> exec(String cmd) {
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
					if(!s.isEmpty()) {
						 hddInfo.put(count+"-"+data, s);
						 data++;
					}
				}
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hddInfo;
	}

	public Map<String, String> getHddInfo() {
		return hddInfo;
	}

}

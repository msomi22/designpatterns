package host.resouce.monitor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Memory {

	private Map<String, Double> memInfo = new HashMap<>();

	public Memory() {
		memInfo = memInfo("cat /proc/meminfo");
	}

	/**
	 * 
	 * @return
	 */
	private Map<String, Double> memInfo(String cmd) {
		return exec(cmd);
	}

	/**
	 * 
	 * @param cmd
	 */
	private Map<String, Double> exec(String cmd) {
		try {
			Runtime run = Runtime.getRuntime();
			Process pr = run.exec(cmd);
			pr.waitFor();
			BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line;
			while ((line = buf.readLine()) != null) {
				if (!line.isEmpty()) {
					String type = getmemType(line.toCharArray());
					double size = getMemSize(line);
					memInfo.put(type.trim(), size);
					//System.out.println("************* " +type.trim() + " ======== " + size + " line= " + line);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return memInfo;
	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	private String getmemType(char[] input) {
		String type = "", temp = "";
		for (char ch : input) {
			if (ch == ':') {
				type = temp;
				break;
			}
			temp += ch;
		}
		return type;
	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	private double getMemSize(String input) {
		if(input.contains("kB")) {
			double mem = Double.valueOf(input.substring(input.indexOf(':') + 1, input.lastIndexOf("kB")).trim());
			return mem / (1024 * 1024);
		}else {
			return 0;
		}
	}

	/**
	 * 
	 * @return
	 */
	public Map<String, Double> getMemInfo() {
		return memInfo;
	}

}

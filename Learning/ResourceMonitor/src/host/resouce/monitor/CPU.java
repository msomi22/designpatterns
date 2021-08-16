package host.resouce.monitor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CPU {
	
	public String data;
	
	public CPU() {
		this.data = exec("cat /proc/stat");
	}
	
	/**
	 * 
	 * @param prevData
	 * @param lastSum
	 * @return
	 */
	public long cpuInfo(String prevData, long lastSum) {
		long sum = sum();
		long idle = idle(splitData(prevData));
		long cpuDelta = sum - lastSum;
		long cpuUsed = cpuDelta - idle;
		long usedPercent = (100 * cpuUsed) / cpuDelta;
		return usedPercent;
	}
	

	/**
	 * 
	 * @param cmd
	 * @return
	 */
	private String exec(String cmd) {
		try {
			Runtime run = Runtime.getRuntime();
			Process pr = run.exec(cmd);
			pr.waitFor();
			BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line;
			int count = 1;
			while ((line = buf.readLine()) != null) {
				line = line.substring(line.indexOf(' '));
				count++;
				if (count > 1)
					return line.trim();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		return "";
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	public long idle(String input) {
		return idle(splitData(input)); 
	}

	/**
	 * 
	 * @param lines
	 * @param lastLines
	 * @return
	 */
	private long idle(String[] lastLines) {
		String idle1 = "0", idle2 = "0";
		String[] lines = splitData();
		long idle = 0;
		if(lines.length >= 4) {
			idle1 = lines[3];
		}
		if(lastLines.length >= 4) {
			idle2 = lastLines[3];
		}
		try {
			idle = Long.valueOf(idle1) -  Long.valueOf(idle2);
		}catch (Exception e) {
			
		}
		return idle;
	}

	/**
	 * 
	 * @param lines
	 * @return
	 */
	public long sum() {
		long sum = 0;
		for (String s : splitData()) { 
			if (!s.isEmpty()) {
				sum += Long.valueOf(s);
			}
		}
		return sum;
	}

	/**
	 * 
	 * @return
	 */
	private String[] splitData() {
		return  this.data.split("\\ ", -1);
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private String[] splitData(String input) {
		return  input.split("\\ ", -1);
	}

	public String getData() {
		return data;
	}
}

package host.resouce.monitor;

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

public class Application {
	
	private static DecimalFormat df = new DecimalFormat(".##");

	public static void main(String[] args) {

		int sleep = 5;
		String previus = "";
		long lastSum = 0;
		while (true) {
			//======= GET CPU INFO =========================================
			System.out.println("======= Getting CPU INFO =======");
			CPU cpu = new CPU();
			long usedPercent = cpu.cpuInfo(previus, lastSum);
			lastSum = cpu.sum();
			System.out.println("CPU used " + usedPercent + "%");
			previus = cpu.getData();
			
			//======= GET MEM INFO =========================================
			System.out.println("======= Getting MEM INFO =======");
			Memory mem = new Memory();
			//System.out.println("======= " + mem.getMemInfo() + " =======");
			//df.format(
			double total = mem.getMemInfo().getOrDefault("MemTotal", 0.0);
			double free = mem.getMemInfo().getOrDefault("MemFree", 0.0);///MemFree
			System.out.println("Memory " + df.format(free/total*100) + "% free");
			System.out.println("Memory " + df.format(((total-free)/total)*100) + "% used");
			double totals = mem.getMemInfo().getOrDefault("SwapTotal", 0.0);
			double frees = mem.getMemInfo().getOrDefault("SwapFree", 0.0);
			System.out.println("Swap " + df.format(frees/totals*100) + "% free");
			System.out.println("Swap " + df.format(((totals-frees)/totals)*100) + "% used");
			
			//======= GET MEM INFO =========================================
			System.out.println("======= Getting HDD INFO =======");
			/*HDD hdd = new HDD();
			hdd.getHddInfo().forEach((key, value) -> {
				System.out.println(key + " " + value);
			});*/
			
			try {
				TimeUnit.SECONDS.sleep(sleep);
			} catch (Exception e) {

			}
		}

	}

}

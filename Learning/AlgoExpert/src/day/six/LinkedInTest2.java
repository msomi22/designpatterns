package day.six;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class LinkedInTest2 {
	
	private static String archiveDest = "";

	public static void main(String[] args) {
		/**
		 * http://www.sergiy.ca/guide-to-selecting-appropriate-map-collection-in-java
		 * 
		 * collections -ordering -duplicates -speed -memory
		 */
		/**
		 * all collections implement Iterable Iterable -> Collection -> [Set, List,
		 * Queue] Set -No duplicates -Unordered
		 * 
		 * List -allow duplicates -order is significant
		 * 
		 * QUEUE -fifo
		 * 
		 * MAP -does not extend collection interface -key-value pair
		 * 
		 * LinkedList -fast in insert/remove elements in the middle of the list
		 *
		 * 
		 */

		LinkedList<String> queue = new LinkedList<>();
		queue.add("A");
		queue.add("C");
		queue.add(1, "B");
		System.out.println(queue);
		serve(queue);
		System.out.println(queue);

		BlockingQueue<String> q = new ArrayBlockingQueue<>(5);
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		q.add("E");
		System.out.println(q);
		// q.add("F");// java.lang.IllegalStateException: Queue full
		System.out.println(q);

		/**
		 * initialCapacity loadFactor --> when 75% full, resize the map accessOrder -->
		 * when false or when not provided -> use insertion order when true, use access
		 * order. Most recently accessed will be at the bottom
		 */
		Map<String, String> map = new LinkedHashMap<>(10, 0.75f, true);
		map.put("Kevin", "1233443");
		map.put("Jill", "1233443");
		map.put("Brenda", "1233443");
		map.put("Gary", "1233443");
		map.put("Peter", "1233443");
		System.out.println("Kevin --->" + map.get("Kevin"));

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("" + entry.getKey() + " " + entry.getValue());
		}

		// Functional interface
		GreetingInterface gi = new GreetingInterface() {
			@Override
			public void sendGreetings(String receipient) {
				System.out.println("Hello " + receipient);
			}
		};
		gi.sendGreetings("Peter");

		GreetingInterface gi2 = (name) -> {
			System.out.println("Helloo " + name);
		};
		gi2.sendGreetings("Peter");

		// method references
		Square s = new Square(4);
		Shape shape = Square::calculateArea;
		System.out.println("Area " + shape.getArea(s));

		System.out.println("====================================");
		List<String> list = new ArrayList<>();
		list.add("Karugu");
		list.add("Julius");
		list.add("Omollo");

		// External Iterations, Iterator - for each
		for (String str : list) {
			if (str.startsWith("J") || str.startsWith("O") && str.endsWith("s")) {
				System.out.println("==================" + str + "==================");
			}
		}

		// Internal Iteration - stream
		list.stream().filter(str1 -> {// lazy method
			return str1.startsWith("J") || str1.startsWith("O");
		}).filter(str2 -> {
			return str2.endsWith("s");
		}).forEach(System.out::println); // eager method
		
		
		
		
		String directory = "";
		File myDir = new File(directory);
		List<File> files = new ArrayList<>(Arrays.asList(myDir.listFiles()));
		files.stream().filter(file -> {
			return file.isFile() && file.exists() && file.canRead();
		}).forEach(file -> {
			System.out.println(file.getAbsoluteFile());
			 moveFile(file);
		});
		
		String key = "";
		var myVar = switch (key) {
		case "A" , "B":
			yield "AAAAAAAAA";
		
		case "Z": 
			yield "AAAAAAAAA";

		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		};

	}

	/**
	 * 
	 */
	private static void moveFile(File file) {
		try {
			Files.move(Paths.get(file.getAbsolutePath()),
					Paths.get(archiveDest + File.separator + file.getName()), 
					StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	private static void serve(LinkedList<String> queue) {
		String cus = queue.poll();
		System.out.println("servred " + cus);
	}

}

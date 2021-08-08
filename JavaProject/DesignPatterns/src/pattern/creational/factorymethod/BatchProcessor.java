/**
 * 
 */
package pattern.creational.factorymethod;

import java.io.File;
import java.util.List;

/**
 * @author 
 *
 */
public abstract class BatchProcessor {
	
	public final void processBatch(String fileName) {
		System.out.println("fileName " + fileName);
		var file = openFile(fileName);
		var parser = createParser(file);//Factory Method 
		List<Record> records = parser.parse();
		processRecords(records);
		writeSummary();
		closeFile(file);
	}
	
	/**
	 * Factory Method Pattern
	 * Factory Method 
	 * Define an interface for creating an object, 
	 * but let subclasses decide which class to instantiate.
	 * One factory is specialized in creating only one kind of object.
	 * Provide a contract/method to create an object. 
	 * 
	 * Use case
	 * If there is an inheritance hierarchy where a polymorphic creation is needed
	 * Where a class modification of a class is required to accommodate Open-closed principles 
	 * 
	 * @param file
	 * @return
	 */
	protected abstract Parser createParser(File file); 

	private void closeFile(File file) {
		System.out.println("Crossing file");
	}

	private void writeSummary() {
		System.out.println("Writing summary");
	}

	private void processRecords(List<Record> records) {
		System.out.println("Processing Records");
	}
	private File openFile(String fileName) {
		System.out.println("Openning file");
		return null;
	}

}

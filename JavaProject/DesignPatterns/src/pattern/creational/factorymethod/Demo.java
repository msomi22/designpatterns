/**
 * 
 */
package pattern.creational.factorymethod;


/**
 * @author KEN19282
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("App Starting");
		String type = "xml";
		BatchProcessor processor = createProcessor(type);
		processor.processBatch("SomeFile"); 
		System.out.println("Exiting...");

	}

	/**
	 * Simple/static factory pattern 
	 * Simple Factory Pattern (Programming Idiom)
	 * Separate what changes from what doesn't
	 * Only one place to change, 
	 * the Factory class which doesn't implement/extend any interface/class.
	 * 
	 * @param type
	 * @return
	 */
	private static BatchProcessor createProcessor(String type) {
		return switch (type) {
		case "csv": {
			yield new CSVProcessor();
		}
		case "fixed": {
			yield new FixedLengthProcessor();
		}
		case "xml": {
			yield new XMLProcessor();
		}
		case "text": {
			yield new TextProcessor();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		};

	}
}

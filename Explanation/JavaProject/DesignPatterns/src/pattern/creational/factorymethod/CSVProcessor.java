package pattern.creational.factorymethod;

import java.io.File;

public class CSVProcessor extends BatchProcessor {

	@Override
	protected Parser createParser(File file) {
		return new CSVparser(file);
	}

}

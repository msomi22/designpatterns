package pattern.creational.factorymethod;

import java.io.File;

public class XMLProcessor extends BatchProcessor {

	@Override
	protected Parser createParser(File file) {
		return new XMLparser(file);
	}

}

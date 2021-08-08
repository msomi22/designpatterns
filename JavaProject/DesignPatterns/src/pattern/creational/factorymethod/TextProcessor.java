package pattern.creational.factorymethod;

import java.io.File;

public class TextProcessor extends BatchProcessor {

	@Override
	protected Parser createParser(File file) {
		return new TextParser(file); 
	}

}

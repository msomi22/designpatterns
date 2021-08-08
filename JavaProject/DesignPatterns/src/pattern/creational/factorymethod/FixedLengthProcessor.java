package pattern.creational.factorymethod;

import java.io.File;

public class FixedLengthProcessor extends BatchProcessor {

	@Override
	protected Parser createParser(File file) {
		// TODO Auto-generated method stub
		return new FixedLenParser(file);
	}

}

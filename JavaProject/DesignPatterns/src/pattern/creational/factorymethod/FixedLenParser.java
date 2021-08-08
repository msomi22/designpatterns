package pattern.creational.factorymethod;

import java.io.File;
import java.util.List;

public class FixedLenParser extends Parser {

	public FixedLenParser(File file) {
		
	}

	@Override
	public List<Record> parse() {
		System.out.println("Parsing Fixed Length file");
		return null;
	}

}

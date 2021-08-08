package pattern.creational.factorymethod;

import java.io.File;
import java.util.List;

public class CSVparser extends Parser {

	public CSVparser(File file) {
		
	}

	@Override
	public List<Record> parse() {
		System.out.println("Parsing CSV file");
		return null;
	}

}

package pattern.creational.factorymethod;

import java.io.File;
import java.util.List;

public class XMLparser extends Parser {

	public XMLparser(File file) {
		
	}

	@Override
	public List<Record> parse() {
		System.out.println("Parsing XML file");
		return null;
	}

}

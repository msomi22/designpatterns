package pattern.creational.factorymethod;

import java.io.File;
import java.util.List;

public class TextParser extends Parser{

	public TextParser(File file) {
		System.out.println("Creating text parser"); 
	}
	
	public List<Record> parse(){
		System.out.println("Parsing text file");
		return null;
	}
}

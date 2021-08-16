package day.one;

public class CustomStringEnumerator implements IEnumerable<String>{
	
	private String[] s;
	private EnumeratorConfig config;
	public CustomStringEnumerator(String[] s, EnumeratorConfig config) {
		this.s = new String[config.getMaxLength()];
		for(int i =0; i<config.getMaxLength();i++ ) {
			this.s[i] = s[i];
		}
		this.config = config;
	}
}

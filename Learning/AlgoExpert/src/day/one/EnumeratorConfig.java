package day.one;

public class EnumeratorConfig {
	
	private int MinLength;
	private int MaxLength;
	boolean StartWithCapitalLetter;
	
	public EnumeratorConfig(int MinLength,int MaxLength,boolean StartWithCapitalLetter) {
		this.MinLength = MinLength;
		this.MaxLength = MaxLength;
		this.StartWithCapitalLetter = StartWithCapitalLetter;
	}

	public int getMinLength() {
		return MinLength;
	}

	public void setMinLength(int minLength) {
		MinLength = minLength;
	}

	public int getMaxLength() {
		return MaxLength;
	}

	public void setMaxLength(int maxLength) {
		MaxLength = maxLength;
	}

	public boolean isStartWithCapitalLetter() {
		return StartWithCapitalLetter;
	}

	public void setStartWithCapitalLetter(boolean startWithCapitalLetter) {
		StartWithCapitalLetter = startWithCapitalLetter;
	}

}

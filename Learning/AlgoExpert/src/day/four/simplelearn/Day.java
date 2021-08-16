package day.four.simplelearn;

public enum Day {
	
	MON("Monday"), TUE("Tuesday"), WED("Wednesday"), 
	THUR("Thursday"), FRI("Friday"), SAT("Saturday"), SUN("Sunday");
	
	private String value;

	Day(String dayValue) {
		this.value = dayValue;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}

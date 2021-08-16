package day.four.simplelearn;

public class GenericType<T> {
	transient T obj;

	public GenericType(T obj) {
		this.obj = obj;
	}
	
	

	public T getObj() {
		return obj;
	}



	public void setObj(T obj) {
		this.obj = obj;
	}



	@Override
	public String toString() {
		return "GenericType [obj=" + obj + "]";
	}
	
	
}

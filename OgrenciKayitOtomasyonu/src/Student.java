
public class Student {
	private static int DEFAULT_NUMBER = 0;
	private String name;
	private int number;
	private int year; //TODO
	
	
	Student(String name){
		this.name = name;
		this.number = DEFAULT_NUMBER;
		this.DEFAULT_NUMBER ++;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNumber() {
		return this.number;
	}
}


public class Finder {

	Student cursor;
	
	public Student find(String name) {
		Student found = null;
		for (Student x : Engine.data) {
			if (x.getName().equalsIgnoreCase(name)){
				found =  x;  
			}
		}
		this.cursor = found;
		return found;
	}
	
	public Student find(int number) {
		Student found = null;
		for (Student x : Engine.data) {
			if(x.getNumber() == number) {
				found =  x;
			}
		}
		this.cursor = found;
		return found;
	}
	
}

package inheritanceQ3;

public class Marks {
	
	private int roll_number;
private String name;
private int marks;
public int getRoll_number() {
	return roll_number;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}

public Marks( String name, int marks) {
	super();
	roll_number++;
	this.name = name;
	this.marks = marks;
}

@Override
public String toString() {
	return "Marks [roll_number=" + roll_number + ", name=" + name + ", marks=" + marks + "]";
}

}

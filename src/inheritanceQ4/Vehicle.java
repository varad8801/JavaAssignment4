package inheritanceQ4;

public class Vehicle {
private int milage;
private int price;

public int getMilage() {
	return milage;
}
public void setMilage(int milage) {
	this.milage = milage;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Vehicle [milage=" + milage + ", price=" + price + "]";
}
}

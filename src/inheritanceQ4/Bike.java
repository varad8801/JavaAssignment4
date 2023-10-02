package inheritanceQ4;

public class Bike extends Vehicle{
	private int number_of_cylinders;
	private int number_of_gears;
	private int fuel_tank_size;
	private String wheel_type;
	private String cooling_type;
	public int getNumber_of_cylinders() {
		return number_of_cylinders;
	}
	public void setNumber_of_cylinders(int number_of_cylinders) {
		this.number_of_cylinders = number_of_cylinders;
	}
	public int getNumber_of_gears() {
		return number_of_gears;
	}
	public void setNumber_of_gears(int number_of_gears) {
		this.number_of_gears = number_of_gears;
	}
	public int getFuel_tank_size() {
		return fuel_tank_size;
	}
	public void setFuel_tank_size(int fuel_tank_size) {
		this.fuel_tank_size = fuel_tank_size;
	}
	public String getWheel_type() {
		return wheel_type;
	}
	public void setWheel_type(String wheel_type) {
		this.wheel_type = wheel_type;
	}
	public String getCooling_type() {
		return cooling_type;
	}
	public void setCooling_type(String cooling_type) {
		this.cooling_type = cooling_type;
	}
	@Override
	public String toString() {
		super.toString();
		return "Bike [number_of_cylinders=" + number_of_cylinders + ", number_of_gears=" + number_of_gears
				+ ", fuel_tank_size=" + fuel_tank_size + ", wheel_type=" + wheel_type + ", cooling_type=" + cooling_type
				+ "]"+super.toString()+"";
	}
	
}

class Bajaj extends Bike{
	private String make_type;

	public String getModel_type() {
		return make_type;
	}

	public void setModel_type(String make_type) {
		this.make_type = make_type;
	}

	@Override
	public String toString() {
		super.toString();
		return "Bajaj [make_type=" + make_type + "] "+super.toString()+ "";
	}
}
class TVS extends Bike{
	private String make_type;

	public String getModel_type() {
		return make_type;
	}

	public void setModel_type(String make_type) {
		this.make_type = make_type;
	}
	

	@Override
	public String toString() {
		
		return "TVS [make_type=" + make_type + "] "+super.toString()+ " ";
	}
}


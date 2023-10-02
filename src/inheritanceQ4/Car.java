package inheritanceQ4;

public class Car extends Vehicle{
	private int ownership_cost;
	private int warranty;
	private int fuel_cap;
	private String fuel_type;
	public int getOwnership_cost() {
		return ownership_cost;
	}
	public void setOwnership_cost(int ownership_cost) {
		this.ownership_cost = ownership_cost;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public int getFuel_cap() {
		return fuel_cap;
	}
	public void setFuel_cap(int fuel_cap) {
		this.fuel_cap = fuel_cap;
	}
	public String getFuel_type() {
		return fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	@Override
	public String toString() {
		super.toString();
		return "Car [ownership_cost=" + ownership_cost + ", warranty=" + warranty + ", fuel_cap=" + fuel_cap
				+ ", fuel_type=" + fuel_type + "] "+super.toString()+ " ";
	}
	
	
}
class Audi extends Car{
	private String model_type;

	public String getModel_type() {
		return model_type;
	}

	public void setModel_type(String model_type) {
		this.model_type = model_type;
	}

	@Override
	public String toString() {
		super.toString();
		return "Audi [model_type=" + model_type + "]"+super.toString()+ "";
	}
}
class Ford extends Car{
	private String model_type;

	public String getModel_type() {
		return model_type;
	}

	public void setModel_type(String model_type) {
		this.model_type = model_type;
	}

	@Override
	public String toString() {
		super.toString();
		return "Ford [model_type=" + model_type + "]"+super.toString()+ "";
	}
}


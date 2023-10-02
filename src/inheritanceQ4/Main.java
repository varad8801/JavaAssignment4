package inheritanceQ4;

public class Main {
public static void main(String[] args) {
	Audi audi=new Audi();
	audi.setPrice(400000);
	audi.setOwnership_cost(2000000);
	audi.setModel_type("Q7");
	audi.setMilage(30);
	audi.setWarranty(4);
	audi.setFuel_type("Petrol");
	audi.setFuel_cap(40);
	System.out.println(audi.toString());
	Ford ford=new Ford();
	ford.setPrice(40000000);
	ford.setOwnership_cost(200000);
	ford.setModel_type("ecosport");
	ford.setMilage(36);
	ford.setWarranty(2);
	ford.setFuel_type("Diesel");
	ford.setFuel_cap(56);
	System.out.println(ford.toString());
	Bajaj bajaj=new Bajaj();
	bajaj.setPrice(80000);
	bajaj.setWheel_type("alloy");
	bajaj.setModel_type("Platina");
	bajaj.setMilage(36);
	bajaj.setCooling_type("Liquid");
	bajaj.setFuel_tank_size(33);
	bajaj.setNumber_of_cylinders(4);
	bajaj.setNumber_of_gears(5);
	System.out.println(bajaj.toString());
	TVS tvs=new TVS();
	tvs.setPrice(60000);
	tvs.setWheel_type("plastic");
	tvs.setModel_type("Victor");
	tvs.setMilage(70);
	tvs.setCooling_type("Liquid");
	tvs.setFuel_tank_size(36);
	tvs.setNumber_of_cylinders(7);
	tvs.setNumber_of_gears(3);
	System.out.println(tvs.toString());
}
}

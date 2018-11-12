// Create by : Peter zhu
// Create on : Oct 2018
// This is main class of Vehicle class

public class VehicleMain {
	
	public static void main(String[]args) {
		
		Vehicle vehicleObject = new Vehicle(34554,4,50,120,"Black");
		vehicleObject.speak();
		vehicleObject.accelerate(20);
		vehicleObject.brake(10);
		System.out.println();
		
		Bike bikeObject = new Bike(000, 0, 12, 20, "red",5);
		bikeObject.speak();
		bikeObject.accelerate(20);
		bikeObject.brake(10);
		System.out.println();
		
		Truck truckObject = new Truck(3636363, 2, 50, 100, "blue",500);
		truckObject.speak();
		truckObject.accelerate(20);
		truckObject.brake(10);
		System.out.println();
		
	}

}

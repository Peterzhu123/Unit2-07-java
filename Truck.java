// Create by : Peter zhu
// Create on : Oct
// This is Truck class

public class Truck extends Vehicle {
	private int _boxVolume;
	
	public Truck(int licensePlateNumber, int numberOfDoor, int speed, int max, String color, int volume) {
		super(3636363, 2, 50, 100, "blue");
		_boxVolume = volume;		
		
	}
	
	public void speak() {
		System.out.println("This is Truck");
		super.speak();
		System.out.println("The box volume of the truck is " + _boxVolume);	
		System.out.println();
	}
	
	public void Brake() {
		super.brake(30);
	}
	
	public void accelerate() {
		super.accelerate(10);
	}

}

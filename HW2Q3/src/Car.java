
public class Car {
	
	private int speed;
	private int maxSpeed;
	private String licensePlate;
	
	public Car(int ms, String lp) {
		speed = 0;
		maxSpeed = ms;
		licensePlate = lp;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void speedUp() {
		if (speed + 1 <= maxSpeed)
			speed = speed + 1;
		// if the speed + 1 doesn't go over the max speed, 1 will be added the to speed. Otherwise nothing.
	}
	
	public void speedUp(int change) {
		if (speed > -1 && speed + change < maxSpeed)	
			speed = speed + change;
		// check for validity of change
		// if negative or taking the speed over the limit - do nothing
	}
	
	public void speedDown() {
		if (speed - 1 > -1)
			speed = speed - 1;
		// if the speed - 1 doesn't go under 0, 1 will be subtracted from the speed. Otherwise nothing.
	}
	
	public void speedDown(int change) {
		if (speed > -1 && speed - change > -1)	
			speed = speed - change;
		// check for validity of change
		// if negative or taking the speed under 0 - do nothing
	}
	
	public void stop() {
		speed = 0;
	}
	
	public void show() {
		System.out.println("License Plate: " + licensePlate + " current speed: " + speed + " speed limit: " + maxSpeed);
	}
	
}
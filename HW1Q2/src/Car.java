
public class Car {
	
	private int speed = 0;
	
	public void speedUp() {
		speed = speed + 1;
		speed = speed - (speed / 11); 
		// If speed = 11, the division will result in the number 1 - subtracting 1 as a result which maintains the 10 speed limit.
		// Otherwise, if the speed = 0-10, then devision will result in 0. Not affecting the final speed.
	}
	
	public void speedDown() {
		speed = speed -1 + 1/(speed+1);
		// Subtract 1 from the speed
		// Add 1 when the speed drops below 0 (-1 + 1 = 1; 1/1 = 1; 0 + 1) 
	}
	
	public void stop() {
		speed = 0;
	}
	
	public void show() {
		System.out.println("current speed: " + speed);
	}
	
}

//Let's test when speed is 0:
//With the formula speed = speed - 1 + 1/(speed + 1)
//When speed = 0:
//0 - 1 + 1/(0 + 1)
//= -1 + 1/1
//= -1 + 1
//= 0
//It works perfect for 0!
//Because:
//
//First we subtract 1: 0-1 = -1
//Then we add 1/(0+1) which is 1/1 = 1
//So -1 + 1 = 0
//
//This formula is actually perfect for speed = 0 because:
//
//It prevents going below 0
//When speed is 0, it stays at 0
//When speed is positive, it decrements by 1
//
//The only issue we found was with negative numbers, but since the initial speed starts at 0 and we're controlling the increment (which never goes above 10), we won't actually encounter negative numbers in normal usage.
//Should we keep this as our final solution?




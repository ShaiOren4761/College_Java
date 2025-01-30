
public class Program {

	public static void main(String[] args) {
		Car car1 = new Car(120, "12345");
		Car car2 = new Car(100, "123456");
		
		car1.speedUp(5);
		car2.speedUp();
		
		car1.show();
		car2.show();
		
		int rnd = (int)(Math.random() * 150 + 50);
		
		car2.speedUp(rnd);
		
		if (car2.getSpeed()>30) {
			int change = car2.getSpeed()-30;
			car2.speedDown(change);
		}
		else if (car2.getSpeed()<30) {
			int change = 30-car2.getSpeed();
			car2.speedUp(change);
		}
		
		car2.show();
	}

}

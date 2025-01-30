
public class Program {

	public static void main(String[] args) {
				
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		
		car2.speedUp();
		car2.speedUp();
		
		car1.show();
		car2.show();
		
		car2.speedDown();

		car1.show();
		car2.show();
		
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		
		car1.show();
		car2.show();
		
		car2.speedUp();
		car2.speedUp();
		car2.speedUp();
		car2.speedUp();
		
		car1.show();
		car2.show();
		
		car1.stop();
		car2.stop();
		
		car1.show();
		car2.show();
		
	}

} 

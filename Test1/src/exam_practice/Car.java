package exam_practice;

public class Car {
	
	private int car_num;
	private boolean handicap_spot;
	
	public Car(int car_num, boolean handicap_spot) {
		this.car_num = car_num;
		this.handicap_spot = handicap_spot;
	}

	public int getCar_num() {
		return car_num;
	}

	public void setCar_num(int car_num) {
		this.car_num = car_num;
	}

	public boolean get_isHandicap_spot() {
		return handicap_spot;
	}

	public void set_Handicap_spot(boolean handicap_spot) {
		this.handicap_spot = handicap_spot;
	}
	
	
}

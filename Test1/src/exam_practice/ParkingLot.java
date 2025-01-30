package exam_practice;

public class ParkingLot {
	
	private int lot_size;
	private int handicap_spot_percentage; // Don't forget to divide by 100! PERCENTAGE!	
	
	private int handicap_spot_index;
	
	private Car[] lot;
	
	public ParkingLot(int lot_size, int handicap_spot_percentage) {
		this.lot_size = lot_size;
		this.handicap_spot_percentage = handicap_spot_percentage;
		
		this.lot = new Car[lot_size]; //create parking lot
		
		this.handicap_spot_index = this.lot_size * this.handicap_spot_percentage/100;
	}
	
	public int enter(Car c) {
		// handicap may park anywhere, search must start from the beginning
		// upon success return car position of parking, otherwise -1
		
		int start_index = 0; //start search position
		int end_index = this.lot_size; //end search position
		
		// only cars invalid for handicap spots will not search from the beginning (handicap spots)
		if (!c.get_isHandicap_spot()){
			start_index = this.handicap_spot_index;
		}
		
		// search for parking space
		for (int i=start_index; i<end_index; i++) {
			if (this.lot[i] != null) {
				this.lot[i] = c;
				return c.getCar_num();
			}
		}
		
		return -1; // no parking space found for car
	}
	
	public void exit(Car c) {
		// remove given car from it's position, replacing it by a null value
		// if removed car is a car with a valid handicap spot pass, and it was removed from a handicap spot -
		// check for other handicap spots that may be in regular spots and re-position in handicap spot
		
		// if not handicap not handicap, quick solution
		// if handicap, must test for position if at handicap spots to fill in other handicaps outside of it
		
		// not handicap
		if (c.get_isHandicap_spot()) {
			
					
		}
		
	}
	
	
	
}

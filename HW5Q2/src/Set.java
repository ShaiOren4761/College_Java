
public class Set {
	
	int numbers[];
	
	public Set() {
		this(10); 
	}
	
	public Set(int size) {
		this.numbers = new int[size];
	}
	
	public Set(int ... numbers_with_duplicates) {
			
		// method:
		// copy numbers while checking they aren't already in the new set.
		// 0 is the default value of an int the array, that means we can count until 0 to set the unique numbers point and copy only those. 
		// because 0 is the initialized value of all integers, check if 0 is required at the end to not cut it away from the set.
		
		int []number_collector = new int[numbers_with_duplicates.length];
		int temp_index = 0; //index for keeping track of where we are in numbers 
		
		for (int i = 0; i < numbers_with_duplicates.length; i++) {
			
			if (!isExists(numbers_with_duplicates[i], number_collector)) { //if current number doesn't exist in the set, copy it.
				number_collector[temp_index] = numbers_with_duplicates[i];
				temp_index++;
			}
		}
		
		int size = 0; // size of unique number array, set by counting how many numbers we have in the collector
		for (int num:number_collector) {
			if (num == 0) //cutoff point
				break;
			size++;
		}
		
		if (isExists(0, numbers_with_duplicates))
			size++; // 0 edge-case - we have to make sure we don't miss it as a number in case it is needed.
		
		this.numbers = new int[size];
		
		for (int i = 0; i <size; i++) {
			this.numbers[i] = number_collector[i];
		}
		
	}
 	
	public Set(Set s) {
		this.numbers = new int[s.numbers.length];
		for(int i = 0; i < s.numbers.length; i++)
			this.numbers[i] = s.numbers[i];
	}
	
	public Boolean equals(Set s) {
		if (this.numbers.length != s.numbers.length)
			return false; // if the size doesn't match, the lists can't possibly be equal
		
		for (int i=0; i<this.numbers.length; i++) {
			if (!isExists(s.numbers[i], this.numbers))
				return false; // if one of the outer Set's numbers does not exist in our numbers, equality is false.
		}
		
		return true; // otherwise, we have 2 sets that hold the same numbers.
	}
	
	public Set union(Set s) { 
		
		// create a new array with all numbers we need, and then use array constructor to transform the array to a set. 
		
		int new_set_array_size = this.numbers.length + s.numbers.length;
		int []new_set_array = new int[new_set_array_size];
		int temp_index = 0; // index for iterating through the new set for adding all the numbers
		
		// copy all numbers from both sets
		for (int i = 0; i<this.numbers.length; i++) {
			new_set_array[temp_index] = this.numbers[i];
			temp_index++;
		}
		for (int i = 0; i<s.numbers.length; i++) {
			new_set_array[temp_index] = s.numbers[i];
			temp_index++;
		}
		// use array to set constructor
		return new Set(new_set_array);
	}
	
	public Set intersect(Set s) {
		
		// we check for intersecting numbers, save those and return.
		
		int []number_collector = new int[this.numbers.length]; // initializing size is unknown, either set's size is good. 
		int temp_index = 0; //index for keeping track of where we are in number_collector	
		int edge_case_index = 0; // used to save the index of 0 if there is one

		
		// intersect current set with outer set
		for (int i = 0; i < this.numbers.length; i++) {
			
			if (isExists(this.numbers[i], s.numbers)) { //if current number intersects with outer set, copy it.
				number_collector[temp_index] = this.numbers[i];
				temp_index++;
				
				if (this.numbers[i] == 0) 
					edge_case_index = temp_index; // 0 edge case flag
			}
		}
		// now we have all intersecting numbers
		// all that's left is to set the correct size to the final array
		
		int size = edge_case_index; 
		// we set the size as the edge_case_index because 0 is used to identify the end of needed area of the array
		// so we start measuring the size of the array after the 0 to find the relevant 0
		
		for (int i = edge_case_index; i<number_collector.length; i++) {
			if (number_collector[i] == 0) //cutoff point
				break;
			size++;
		}
		
		int []intersection_array = new int[size];
		
		for (int i = 0; i <size; i++) 
			intersection_array[i] = number_collector[i];
		
		return new Set(intersection_array);
	}
	
	public Boolean subset(Set s) {
		for (int i=0; i<s.numbers.length; i++)
			if (!isExists(s.numbers[i], this.numbers))
				return false; // if one of the outer set's numbers do not exist within current set, s is not a subset of current set.
		return true;
	}
	
	public int[] toArray() { // the question's phrasing confuses me.. I assume we are required to simply return the array in the current set.
		return this.numbers;
	}
	
	public Set substract(Set s) { // this - s = return
		Set intersection_set = this.intersect(s); // the intersection creates the difference between the two sets
		
		// if we do the length of the current set minus the intersection's set size, we get the amount of numbers that will remain after the subtraction.
		int []substracted_array = new int[this.numbers.length - intersection_set.numbers.length]; 
		int temp_index = 0;
		
		// go through all numbers in current set, taking only those in the intersection of both sets
		for (int i=0; i<this.numbers.length; i++) {
			if (!isExists(this.numbers[i], intersection_set.numbers)) {
				substracted_array[temp_index] = this.numbers[i];
				temp_index++;
			}
		}
		
		return new Set(substracted_array);
	}
	
	private Boolean isExists(int x, int[]list) { // checks if an int exists in an array of integers
		for (int num:list) {
			if (num==x)
				return true;
		}
		return false;
	}
	
	public void show() {
		for (int a:numbers)
			System.out.print(a + ", ");
		System.out.println();
	}
 
}

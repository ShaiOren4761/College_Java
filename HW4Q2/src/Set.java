
public class Set {
	
	private int[]set;
	private int maxSize;
	private int counter;
	
	public Set(int maxSize) {
		this.maxSize = maxSize;
		this.set = new int[maxSize];
		this.counter = 0;
	}
	
	
	public boolean add(int num) {
		
		if (counter == maxSize) // Is the Set full?
			return false;
		
		for (int i=0; i<counter; i++) // Does num exist in the Set?
			if (set[i] == num) {
				return false;
			}
		
		set[counter] = num; //if the set isn't full we can simply go to the next free position
		counter++;
		return true;
	}
	
	public int find(int num) {
	
		for (int i=0; i<counter; i++) // Iterate over set to check for matching case with num
			if (set[i] == num)
				return i;

		return -1;
	}
	
	public void show() {
		System.out.print("(");
		for (int i=0; i<counter; i++) {
			if (i+1 != counter)
				System.out.print(set[i] + ",");
			else System.out.print(set[i]);
		}
		System.out.print(")");
	}
	
	public boolean isEmpty() {
		return counter == 0;
	}
	
	public boolean isFull() {
		return counter == this.maxSize;
	}
	
	public boolean remove(int num) {
		int remove_index = find(num);
		if (remove_index == -1) // num to remove doesn't exist in the set
			return false;
		
			
		for (int i=remove_index; i<counter; i++) {
			if (i+1<counter) // if there's an element an index after the current one, take it's value. "move it left"
				set[i] = set[i+1];
			else // otherwise, we have reached the end of the set. turn the current value into a 0 to remove it.
				set[i] = 0;
		}
		
		counter--;
		return true;
	}
	
	
	
	
}


public class Die {
	private int numOfSides;
	private int[] statistics;
	private int lastToss;
	
	public Die() {
		this(6);
	}

	public Die(int n) {
		numOfSides = n;
		statistics = new int[numOfSides];
		lastToss = 0; //0 is out of range therefore a valid initialization of the value
	}

	public int rollDie(boolean unique) {
		int result;
		result = 1 + (int) (Math.random() * numOfSides);
		
		if (unique) // 1.1
			while (result==lastToss)
				result = 1 + (int) (Math.random() * numOfSides);

		statistics[result - 1]++;
		lastToss = result;
		return result;
	}

	public void showStatistics() {
		int k;
		for (k = 0; k < numOfSides; k++)
			System.out.println(k + 1 + ":" + statistics[k]);
		System.out.println("The most frequent digit is " + getMostFrequent());
	}
	
	private int getMostFrequent() { //1.2
		int maxValue = statistics[0];
		int maxIndex = 1; 
		
		for (int i=0; i<statistics.length; i++) {
			if (maxValue < statistics[i]) {
				maxValue = statistics[i];
				maxIndex = i+1;
			}
		}
		return maxIndex;
	}
	
	public int[] getAllMostFrequents() { // two steps - count max amount and save index of max.
		int max_index = getMostFrequent()-1;
		// First step - check how many times max appears, to be able to set the size of the array that'll hold the max occurred die sides
		int count_max_ocurrence = 0;
		
		for (int a:statistics) //read statistics
			if (a == statistics[max_index]) // whenever the max value is met, increment the count by 1
				count_max_ocurrence++;
		
		int[]allMostFrequents = new int [count_max_ocurrence]; // exact space for max die sides rolls to be saved
		
		// Second step - after creating the array, we iterate over the statistics to save the relevant numbers.
		int temp_index = 0;

		for (int i=0; i<statistics.length; i++) {
			if (statistics[i] == statistics[max_index] && temp_index < allMostFrequents.length) { //save die sides with max occurrences 
				allMostFrequents[temp_index] = i+1; // check temp_index < allMostFrequents.length just to be safe..
				temp_index++;
			}
		}
		
		return allMostFrequents;
	}
}

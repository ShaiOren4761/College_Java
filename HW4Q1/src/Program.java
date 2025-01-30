import java.util.Scanner;

class Program{
	
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter number of sides:");
		int s = scan.nextInt();
		
		System.out.println("Please enter number of rolls in the experiment:");
		int r = scan.nextInt();
		
		int iter_count = 0; //iteration counter
		
		while(true) { 
			iter_count++;

			System.out.println("Starting iteration # " + iter_count);
			Die myDie = new Die(s);
			for (int k=1;k<=r;k++) myDie.rollDie(false); //I chose false by default, task doesn't specify what to set.
			myDie.showStatistics();
			
			if (myDie.getAllMostFrequents().length > 1)
				break;
		}
		
		System.out.println("Found multiple max frequency. Experiment ended after " + iter_count + " iterations");

	}
}
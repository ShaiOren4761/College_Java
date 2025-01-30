import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		//initialize highest sum check, scanning first progression into it.
		System.out.println("Print the first element of progression "+ 1 +" and then the difference");
		Progression pHighest = new Progression(s.nextInt(),s.nextInt()); 
		int highestSum = pHighest.sum(5);
		
		
		// scan 6 more progressions, using temp for highest sum tests
		Progression temp;
		
		for (int i=2; i<8; i++) {
			System.out.println("Print the first element of progression "+ i +" and then the difference");
			temp = new Progression(s.nextInt(), s.nextInt());
			
			if (temp.sum(5) > highestSum) {
				pHighest = temp;
				highestSum = temp.sum(5);
			}
		}
		
		// show the 12 first numbers of the progression with the highest sum(5)
		pHighest.showProg(12);
	}

}

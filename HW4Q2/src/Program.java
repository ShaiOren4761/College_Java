import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter new set maximal size");
		Set s = new Set(scan.nextInt());
		
		int input = 0; //initialize input, value gets written over in the loop.
		
		while (true) {
			System.out.println("Press 0 to exit program.");
			if (!s.isFull())
				System.out.println("Press 1 to add new number to set.");
			if (!s.isEmpty())
				System.out.println("Press 2 to remove existing number from set.");
			
			input = scan.nextInt();
			if (input == 0)
				break;
			else if (input == 1) {
				System.out.println("Enter new number to add to set");
				input = scan.nextInt();
				if (s.add(input))
					System.out.println("Adding "+input+" succeeded");
				else System.out.println("Adding "+input+" failed");
			}
			else if (input == 2) {
				System.out.println("Enter number to remove from set");
				input = scan.nextInt();
				if (s.remove(input))
					System.out.println("Removing "+input+" succeeded");
				else System.out.println("Removing "+input+" failed");
			}
			System.out.print("The current set is:");
			s.show();
			System.out.println();
		}
		
	}

}

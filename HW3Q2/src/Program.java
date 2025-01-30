import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		System.out.println("Please enter some num");
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		System.out.println("The number you entered is " + num);
		
		if (c.isSymmetric(num))
			System.out.println("The number " + num + " is symmetric");
		else System.out.println("The number " + num + " is not symmetric");
		
		int temp = num+1;
		while (!c.isSymmetric(temp))
			temp++;
		System.out.println("The next symmetric number after "+ num +" is "+ temp);
		
	}

}

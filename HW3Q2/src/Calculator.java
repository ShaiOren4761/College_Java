import java.lang.Math;

public class Calculator {

	public int countDigits(int num) {
		int count = 0;
		do {
			num = num/10;
			count++;
		}
		while (num != 0);
		
		return count;
	}
	
	public boolean evenOdd(int num) {
		int sumEven = 0;
		int sumOdd = 0;
		
		do {
			if (num%2 == 0)
				sumEven += num%10;
			else sumOdd += num%10;
			num = num/10;
		}
		while (num !=0);
		
		return sumEven>sumOdd;
	}
	
	public int getLastDigit(int num) {
		int check = num/10;
		
		while (check!=0) {
			check = check/10;
			num = num/10;
		}
		
		return num;
	}
	
	public int getDigit(int num, int k) {
		//assuming k is inputed correctly i.e not negative
		for (int i=0; i<k; i++) {
			num = num/10;
		}
		return num%10;
	}

	public int setDigit(int num, int k, int d) {
		num -= getDigit(num, k) * (int)Math.pow(10, k); //remove old unwanted digit in relation to it's position in the number
		num += d * (int)Math.pow(10, k); //add new digit corresponding to position in the number
		return num;
	}

	public int getLastDigit2(int num) {
		return getDigit(num, countDigits(num)-1); //get the last digit using the count digit method
	}
	
	public int countMinDigit(int num) { //find smallest number and count appearances
		int temp = num; //copy num for initial usage in detecting smallest number
		int min = temp%10; //initialize smallest number using the existing numbers
		
		do { //compare smallest number container to each digit of num
			if (min > (temp%10)) { 
				min = temp%10;
			}
			temp = temp/10;
		} while (temp!=0);
				
		int count = 0;
		do { //count smallest number's appearances
			if (num%10 == min)
				count++;
			num = num/10;
		} while (num!=0);
		
		return count;
	}

	public boolean isSymmetric(int num) {
		int numLength = countDigits(num);
		
		if (numLength<2) //numbers with 1 digit are automatically Symmetrical
			return true;
		
		while (getLastDigit(num) == num%10 && numLength>1) { // compare last and first digit, and make sure we have more than 1 digit 
			num = num/10; // remove right digit
			num = num - (getLastDigit(num) * (int)Math.pow(10, numLength-2)); // remove left digit
			numLength = countDigits(num);
		}
		//if the loop deleted all digits down to 1, it means it was a successful run. Otherwise, it stopped mid-way; meaning false.
		return numLength<2; 
	}
	
	public int search(int num, int d) { // returns amount of appearances of d in num, 0 <= d =< 9
		int count = 0;
		do { 
			if (num%10 == d) //check each first digit with d, whenever equal count it up
				count++;
			num = num/10; //remove last digit, continue search
		} while (num!=0);
		
		return count;
	}
	
}

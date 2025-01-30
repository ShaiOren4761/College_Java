
public class Progression {

	int firstElement;
	int d; //difference
	
	public Progression(int firstElment, int d) {
		this.firstElement = firstElment;
		this.d = d;
	}
	
	public Progression() { //default progression constructor: -3 , -1 , 1 , 3 , 5 , 7 , 9 , 11 , . . .
		this(-3,2);
	}
	
	public int getElement(int k) {
		return firstElement+(k-1)*d; //a1+(n-1)d
	}
	
	public void showProg(int n) {
		for (int i = 1; i < n +1 ; i++)
			if (i +1 == n +1) // if the current element is the final, print without a comma
				System.out.print(getElement(i));
			else System.out.print(getElement(i) + ",");
	}
	
	public void showProg() {
		showProg(10); //default value
	}
	
	public void showProgUpTo(int n) {
		for (int i = 1;  ; i++) //could've used a while loop. I like this better.
			if (getElement(i+1) >= n) { //if the current element is the final, print without a comma
				System.out.print(getElement(i)); 
				break; //end loop, requested number of elements was printed
			}
			else System.out.print(getElement(i) + ",");
	}
	
	public int sum(int n) {
		int sum = 0;
		for (int i=1; i<n+1; i++) {
			sum+=getElement(i);
		}
		return sum;
	}
		
}











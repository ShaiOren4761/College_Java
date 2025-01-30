
public class Question4 {

	public static int floodOnes(int[]A, int left, int right, int k) {
		if (k == left || k == right) {
			if (A[k] == 1)
				return 1;
			else return 0;
		}
		else if (A[k] == 1)
			return 1 + floodOnes(A, 0, k-1, k-1) + floodOnes(A, k+1, right, k+1); // Damnit.
		else return 0;
	}
	public static void main(String[] args) {
	int[]A = {1,1,1,0,1,1,0,1,1,1,1,1,0,1,1};
	
	System.out.println(floodOnes(A,0,A.length-1, 9)); // 5 תדפיס
	System.out.println(floodOnes(A,0, A.length-1, 3)); // 0 תדפיס
	System.out.println(floodOnes(A,0, A.length-1, 0)); // 3 תדפיס
	System.out.println(floodOnes(A,0, A.length-1, 14)); // 2 תדפיס
	}

}

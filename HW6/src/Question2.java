
public class Question2 {

	public static boolean isMalben(int[][]arr, int n) {
		if (n < 2) {
			return true;
		}
		if (arr[n-1].length != arr[n-2].length) {
			return false;
		}
		return isMalben(arr, n-1);
	}
	public static void main(String[] args) {
	
		int[][] arr2d = new int[3][4];
		System.out.println(isMalben(arr2d,arr2d.length)); // true תדפיס
		arr2d[1] = new int[] { 1,2};
		System.out.println(isMalben(arr2d,arr2d.length)); // false תדפיס
		arr2d[0] = new int[] {5,6};
		arr2d[2] = arr2d[0];
		System.out.println(isMalben(arr2d,arr2d.length)); // true ת
	
	}

}

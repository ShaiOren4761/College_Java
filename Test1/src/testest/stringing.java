package testest;

public class stringing {

	public static void main(String[] args) {
		String s = "asdf";
		int[]arr = new int[s.length()];
		
		for (int i=0; i<s.length(); i++)
			arr[i] = s.indexOf(s.charAt(i));
		
		System.out.println(s.indexOf('s'));
		
		System.out.println();
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}

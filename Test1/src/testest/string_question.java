package testest;

public class string_question {

	public static boolean question1(String s) {
		for (int i=0; i<s.length()-1; i++) {
			if (s.charAt(i) == s.charAt(i+1))
				return false;
		}
		
		return true;
	}
	public static String question2(String s) {
		String[]s_arr = s.split(" ");
		String temp = "";
		
		for (int i=0; i<s_arr.length; i++) {
			if (!question1(s_arr[i])) { //has duplicates - needs attention 
				
				for (int j=0; j<s_arr[i].length()-1; j++) {
					if (s_arr[i].charAt(j)!=s_arr[i].charAt(j+1))
						temp += s_arr[i].charAt(j);
				}
				
				temp += s_arr[i].charAt(s_arr[i].length()-1);
				s_arr[i] = temp;
				temp = "";
			}
		}
		
		String ret = "";
		for (int i=0; i<s_arr.length; i++)
			if (i+1 != s_arr.length)
				ret = ret + s_arr[i] + " ";
			else ret = ret + s_arr[i];
		
		return ret;
	}
	public static void main(String[] args) {
		String s = "abc aabc xxzzyy abcabc"; //abc abc xzy abcabc
		System.out.println(question2(s));
		
	}

}

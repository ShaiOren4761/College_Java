package testest;

public class mein {
	
	public static int stringValue(String s) {
		int ret = 0;
		for (int i=0; i<s.length(); i++)
			ret+= (int)s.charAt(i);
		
		return ret;
	}
	public static void main(String[] args) {
		
	String s1 = "d";
	String s2 = "c";
	
	int val1 = stringValue(s1);
	int val2 = stringValue(s2);
	
	System.out.println("s1 = "+s1);
	System.out.println("s2 = "+s2);
	System.out.println("val1 = "+val1);
	System.out.println("val2 = "+val2);
	
	System.out.println(s1==s2);
	System.out.println("s1 equlas to s2 = " + s1.equals(s2));
	System.out.println("s2 equals to s1 = "+s2.equals(s1));
	System.out.println("s1 comapred to s2 = " + s1.compareTo(s2));
	System.out.println("s2 compared to s1 = " + s2.compareTo(s1));
	}

}

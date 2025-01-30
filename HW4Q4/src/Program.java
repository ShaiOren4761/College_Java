import java.util.Scanner;
public class Program {

	public static String unspare(String myStr) { // abaabc --> abc
		String[]strings = myStr.split(" "); // split sentence to individual words
		
		for (int i=0; i<strings.length; i++) // remove duplicates from each word and override
			strings[i] = removeDups(strings[i]); 
		
		String newStr = ""; // result string initialization
		
		for (int i=0; i<strings.length; i++) {
			newStr = newStr + strings[i] + " ";
		}
		
		return newStr.strip(); //remove extra space at the end
	}
	public static String removeDups(String myStr) {
		String newStr = "";
		for (int i=0; i<myStr.length(); i++) {
			if (newStr.indexOf(myStr.charAt(i)) == -1)
				newStr = newStr + myStr.charAt(i);
		}
		return newStr;
	}
	public static String reverse(String myStr) {
		String[]words = myStr.split(" ");
		String temp = ""; //used for storing reversed strings temporarily before being stored in an array
		
		for (int i=0; i<words.length; i++) { //iterate through every word in the sentence
			for (int j=words[i].length()-1; j>=0; j--) {
				temp = temp + words[i].charAt(j); // reverse each word by going from end to start 
			}
			words[i] = temp; // save the change
			temp = ""; //reset temporary value
		}
		
		temp = ""; //reset temporary string
		for (int i=0; i<words.length; i++) { //reconstruct the string
			if (!words[i].equals(""))  //ignore spaces
				temp = temp + words[i] + " ";
		}
		
		return temp.strip();
	}
	
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	
	System.out.println("The Start");
	String input = scan.nextLine();
	
	while(!input.equals("")) {
		System.out.println(unspare(input));
		System.out.println(reverse(input));
		input = scan.nextLine();
	}
	System.out.println("The End");

	}

}

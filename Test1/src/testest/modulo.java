package testest;

public class modulo {

	public static void main(String[]args){
		int [][] arr = new int[10][10]; //define 2 dimensional array 10x10
		
		for (int i=0; i<10; i++) { //"i" will be used to iterate through 10 indexes of the first dimension in array "arr"
			for (int j=0; j<10; j++) { //"j" will be used to iterate through 10 indexes of the second dimension in array "arr"
				if (j==0){ 
					arr[i][j] = i+1;	
				}
				else if (i==0){
					arr[i][j] = j+1;
				}
				else {
					arr[i][j] = (i+1) * (j+1);
				}
			}
		}

		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				System.out.print(arr[i][j] + "|");
			}
			System.out.println();
		}

		
	}
}

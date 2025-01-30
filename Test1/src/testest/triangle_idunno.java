package testest;


public class triangle_idunno {

	static int n;
	
	public triangle_idunno(int x) {
		n=x;
	}
	public void printTriangle(char tav) {
		for(int k=1 ; k<=n ; k++) {	
			for(int j=1;j<=n-k;j++)
				System.out.print(" ");
			
			for(int i=1 ; i<=k; i++) {  
				System.out.print(tav);
			}
		
			System.out.println();
		}
	}

}

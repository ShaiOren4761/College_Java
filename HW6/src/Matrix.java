
public class Matrix {

	
	private int[][] data;
	
	public Matrix(int rows, int columns, int min, int max) {
		data = new int[rows][columns];
		
		// fill matrix with random numbers not bigger than max nor smaller than min

		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				data[i][j] = min + (int)(Math.random()*(max-min+1));
			}
		}
	}
	
	public Matrix(Matrix m) { //copy Matrix constructor

		// assuming m has at least 1 row..
		data = new int[m.data.length][m.data[0].length]; // copy outer matrix's dimensions
		
		for (int i=0; i<m.data.length; i++) { 
			for (int j=0; j<m.data[i].length; j++) {
				data[i][j] = m.data[i][j]; // copy all values to exact positions
			}
		}
	}
	
	public Matrix(int[][] m) { //copy two-dimesion array constructor

		// assuming m has at least 1 row..
		data = new int[m.length][m[0].length]; // copy outer matrix's dimensions
		
		for (int i=0; i<m.length; i++) { 
			for (int j=0; j<m[i].length; j++) {
				data[i][j] = m[i][j]; // copy all values to exact positions
			}
		}
	}
	public boolean isSquareMatrix() {
		if (data.length == data[0].length)
			return true;
		return false;
	}
	
	public boolean isUnitMatrix() {
		// before we check for Unit Matrix characteristics, the matrix must be a Square matrix.
		if (!isSquareMatrix())
			return false; 
		
		for (int i=0; i<data.length; i++) {
			if (data[i][i] != 1) // check for 1 diagonal
				return false;
			
			for (int j=0; j<data[i].length; j++) { // check for 0 everywhere else, ignoring diagonal positions
				if (j!=i) 
					if (data[i][j] !=0)
						return false;
			}
		}
		
		return true;
	}

	public boolean isSymmetricalMatrix() {
		// before we check for Symmetry characteristics, the matrix must be a Square matrix.
				if (!isSquareMatrix())
					return false; 
				
				for (int i=0; i<data.length; i++) {
					for (int j=0; j<data[0].length; j++) {
						if (data[i][j] != data[j][i])
							return false;
					}
				}
				
				return true;
	}
	
	public boolean compareToMatrix(Matrix m) {
		//assuming current matrix and outer matrix have a least 1 row..
		if (data.length != m.data.length || data[0].length != m.data[0].length) // compare dimensions
			return false;
		
		for (int i=0; i<data.length; i++) {
			for (int j=0; j<data[0].length; j++) {
				if (data[i][j] != m.data[i][j])
					return false;
			}
		}
		
		return true;
	}
	
	public Matrix subMatrix(int i, int j, int a, int b) {
		// i and j describe the top left corner of the sub matrix
		// a is the amount of rows of the sub matrix (length of first dimension)
		// b is the amount of columns of the sub matrix (length of second dimension)
		
		// ASSUMPTION - Size of sub matrix and starting point are in the current matrix. No out of bounds checks are made here.
		// This WILL FAIL if you input values that are out of bounds!
		
		int[][] sub_Matrix_arr = new int[a][b];
				
		for (int row=0; row<a; row++) {
			for (int col=0; col<b; col++) {
				sub_Matrix_arr[row][col] = data[i+row][j+col]; // access position of needed value in accordance to sub Matrix's dimensions.
				// assuming data[i+row][j+col] is a valid position
			}
		}
		
		return new Matrix(sub_Matrix_arr);
	}
	
	public void show() {
		for (int i=0; i<data.length; i++) {
			for (int j=0; j<data[0].length; j++) {
				if (j+1==data[0].length)
					System.out.print(data[i][j]);
				else
					System.out.print(data[i][j] + ", ");
			}
			System.out.println();
		}
	}
}

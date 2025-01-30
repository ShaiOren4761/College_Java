
public class Program {

	
	public static void main(String[] args) {
		int[][]arr = {{1,2,6},{2,8,4},{6,4,7}};
		int[][]arr2 = {{0,1,0},{0,0,1}};
		
		
		Matrix m = new Matrix(arr);
		Matrix m2 = new Matrix(arr2);
		
		System.out.println("Matrix 1: ");
		m.show();
		System.out.println("Matrix 2: ");
		m2.show();
		
		System.out.println("Are the Matrixes equal? (compareToMatrix): " + m.compareToMatrix(m2));
		System.out.println("Is Matrix 1 a square matrix? (isSquareMatrix): " + m.isSquareMatrix());
		System.out.println("Is Matrix 2 a square matrix? (isUnitMatrix): " + m.isUnitMatrix());
		System.out.println("Is Matrix 1 a symmetrical matrix? (isSymmetricalMatrix): " + m.isSymmetricalMatrix());
		System.out.println("The subset of Matrix 1, starting from position (1,1) with 2 rows and 1 columns, is(subMatrix): ");
		m.subMatrix(1, 1, 2, 1).show();
	}

}


public class Program {

	public static void main(String[] args) {
		 Rectangle r1 = new Rectangle(3, 4, 5, 2);
		 int result = r1.getArea();
		 System.out.println(result);
		 
		 Rectangle r2 = new Rectangle(5,6,7,1);
		 r2.moveTo(1, 5, 3, 1);
		 
		 int r1_perimeter = r1.getPerimiter();
		 int r2_perimeter = r2.getPerimiter();
		 
		 System.out.println(r1_perimeter);
		 System.out.println(r2_perimeter);
		 
		 System.out.println(r1.isSquare());
		 System.out.println(r2.isSquare());
	}

}

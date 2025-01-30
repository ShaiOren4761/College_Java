
public class Program {

	public static void main(String[] args) {
		
		Line line = new Line();
		
		Line parallel = new Line(-1,0,3,2);
		
		System.out.println(parallel.getSlope());
		
		Line perpendicular = new Line(0,3,4,1);
		
		double x = line.getSlope() * perpendicular.getSlope();
		
		System.out.println(x);
		
	}

}

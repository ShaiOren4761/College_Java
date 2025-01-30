
public class Line {
	
	private double x1,y1;
	private double x2, y2;
	
	public Line() { // No parameter constructor
		x1 = 0.0;
		y1 = 1.0;
		x2 = 4.0;
		y2 = 3.0;
	}
	
	public Line(double a, double b, double c, double d) { //full constructor
		x1 = a;
		y1 = b;
		x2 = c;
		y2 = d;
	}
	
	public Line(double a, double b) { // Half parameters constructor
		x1 = a;
		y1 = b;
		x2 = 0;
		y2 = 0;
	}
	
	public void show() {
		System.out.println("(" + x1 + "," + y1 + ")" + "-(" + x2 + "," + y2 + ")");
	}
	
	
	public double getSlope() {
		return (y2 - y1) / (x2 - x1); //assumption; x1 != x2
	}
	
	public boolean isInLine (double a, double b) { 
		// y = ax + b
		double formula_b = y1 - getSlope()*x1; //calculate line's y axis meet point
		
		// we compare the y value of the point (b) to the line's formula calculation of ax + b (getSlope()*a + formula_b)
		if (getSlope()*a + formula_b == b) { 
			return true;
		}
		return false;
	}
}

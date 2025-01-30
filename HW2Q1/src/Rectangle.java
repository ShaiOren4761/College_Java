import java.lang.Math;

public class Rectangle {
		 
	private int xu, yu;
	private int xl, yl;
	
	private int height;
	private int width;
	
	public Rectangle (int a, int b, int c, int d) {
		xu=a;
		yu=b;
		xl=c;
		yl=d;
		
		height = yu - yl; 
		width = xl - xu;
	 }
	
	public Rectangle() {
		xu=0;
		yu=0;
		xl=1;
		yl=-1;
		
		height = yu - yl;
		width = xl - xu;
	} 
	
	public int getArea(){
		return height * width;
	} 	
	
	public int getPerimiter() {
		return height * 2 + width *2;
	}
	
	public void show() {
		System.out.println(
				"xu="+xu
				+" yu="+yu
				+" xl="+xl
				+" yl="+yl
				);
	}
	
	public void moveTo(int a, int b, int c, int d) {
		xu=a;
		yu=b;
		xl=c;
		yl=d;
	}
	
	public boolean isInside(int x, int y) {
		if ((x < xl && x > xu) && (y < yu && y > yl)) {
			return true;
		}
		return false;
	}
	
	public double getDiagonalLength() {
		// a^2 + b^2 = c^2
		// we have 90 degrees in our rectangle, so we can use this formula
		// a = width, b = height
		// sqrt((width^2 + height^2)) = length of diagonal
		return Math.sqrt((width*width) + (height*height));
	}
	
	public boolean isSquare() {
		return width == height;
	}
	
	public boolean isGolden() {
		double check = (double) height/width;
		System.out.println(check);
		if (check == 1.618) { //this might never be true, but the homework demands exact values. Very difficult with natural numbers.
			return true;
		}
		return false;
	}
}

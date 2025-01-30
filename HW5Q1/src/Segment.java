import java.util.Scanner;

public class Segment {

	private Point first , second;
	
	public Segment(Point first, Point second) {
		this.first = new Point(first);
		this.second = new Point(second);
	}
	
	public Segment(Point second) {
		this.first = new Point(0,0);
		this.second = new Point(second);
	}
	
	public Segment(int x1, int y1) {
		this.first = new Point(0,0);
		this.second = new Point(x1,y1);
	}
	
	public Segment(int x, int y, Point second) {
		this.first = new Point(x, y);
		this.second = new Point(second);
	}
	
	public Segment(Point first, int x, int y) {
		this.first = new Point(first);
		this.second = new Point(x, y);
	}
	
	
	public Segment(int x1, int y1, int x2, int y2) {
		this.first = new Point(x1,y1);
		this.second = new Point(x2,y2);
	}
	
	public Segment(Segment s) {
		this.first = new Point(s.first);
		this.second = new Point(s.second);
	}
	
	public Segment() {
		this(new Point(0,0), new Point(1,1));
	}
	
	public void readSegment() { 
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Reading new Segment..");
		System.out.println("Print x and y of the first point");
		Point p1 = new Point(scan.nextInt(), scan.nextInt());
		
		System.out.println("Print x and y of the second point");
		Point p2 = new Point(scan.nextInt(), scan.nextInt());
		
		this.first = p1;
		this.second = p2;
	}
	
	public Point middle() { // Middle = ((x1 + x2)/2, (y1 + y2)/2)
		float middle_x = (first.getX() + second.getX()) / 2;
		float middle_y = (first.getY() + second.getY()) / 2;
		return new Point(middle_x, middle_y);
	}
	
	public float lengtht() { //lengtht is a typo but I do what the homework says. Instructions read like a compiler.
		// distance = sqrt((x2-x1)^2 + (y2 - y1)^2
		return (float)Math.sqrt((double)(Math.pow(second.getX()-first.getX(),2) + Math.pow(second.getY()-first.getY(),2) ) );
		// I have to cast to double because Math.sqrt() only accepts integers and doubles, our point use float so I retain that type.
	}
	
	public Boolean greaterThan(Segment sg2) {
		return this.lengtht() > sg2.lengtht();
	}
	
	public Boolean lessThan(Segment sg2) {
		return this.lengtht() < sg2.lengtht();
	}
	
	public Boolean equals(Segment sg2) {
		Boolean x1_comparison = this.first.getX() == sg2.first.getX(); //Compare X values of first points of segments
		Boolean x2_comparison = this.second.getX() == sg2.second.getX(); //Compare X values of second points of segments
		Boolean y1_comparison = this.first.getY() == sg2.first.getY(); //Compare Y values of first point of segments
		Boolean y2_comparison = this.second.getY() == sg2.second.getY(); //Compare Y values of first point of segments
		
		// return true only if all are true, meaning first = sg2.first and second = sg2.second
		return x1_comparison && x2_comparison && y1_comparison && y2_comparison; 
		
	}
	
	public int compareTo(Segment sg2) {
		// 0 if lengths are equals (not to be confused to equals, which checks for coordinates equality
		// 1 if sg1.greaterThan(sg2)
		// 2 if sg1.lessThan(sg2)
		
		if (this.greaterThan(sg2))
			return 1;
		else if (this.lessThan(sg2))
			return 2;
		else //if sg1 is not bigger nor smaller than sg2, they must be equal. therefore 0.
			return 0;
	}
	
	public void show() { 
		// Homework demands to show Segment's data, default for me is just the Points. "Data" was not explicitly defined.
		System.out.println("Segment data:");
		this.first.show();
		this.second.show();
	}

}









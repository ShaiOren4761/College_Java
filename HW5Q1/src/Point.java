
public class Point {
	
	private float x,y;
	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	
	public void show() {
		System.out.println("Point data: x = " + this.x + " y = " + this.y);
	}
	
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}
}

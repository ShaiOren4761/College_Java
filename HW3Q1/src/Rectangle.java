import java.util.Scanner;

public class Rectangle {
	private int height, width;
	
	public Rectangle (int h, int w) {
		this.height = h;
		this.width = w;
	}
	
	public void drawFilled() {
		drawFilled('*');
	}
	
	public void drawEmpty() {
		drawEmpty('*');
	}
	
	public void drawFilled(char c) {
		for (int i=0; i < this.height; i++) {
			for (int n=0; n < this.width; n++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public void drawEmpty(char c) {
		for (int i=0; i < this.height; i++) {
			for (int n=0; n < this.width; n++) {
				if (n == 0 || n==this.width-1 || (i == 0 || i==this.height-1))
					System.out.print(c);
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void readRectFromConsole() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		System.out.println("Please enter new width");
		this.width = s.nextInt();
		
		System.out.println("Please enter new height");
		this.height = s.nextInt();
	}
	
	
}

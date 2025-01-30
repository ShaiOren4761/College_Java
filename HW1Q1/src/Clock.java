public class Clock {
		
	private int hours;
	private int minutes;
	private int seconds;
	private int milliseconds;	

	public void tick () {
		
		milliseconds = milliseconds+1;
		seconds = seconds + milliseconds/1000;
		minutes = minutes + seconds/60;
		hours = hours + minutes/60;
		
		milliseconds = milliseconds%1000;
		seconds = seconds%60;
		minutes = minutes%60;
		hours = hours%24;
		}
	
	public void show(){
		System.out.print("the current time is : ");
		System.out.print(hours);
		System.out.print(':');
		System.out.print(minutes);
		System.out.print(':');
		System.out.print(seconds);
		System.out.print(':');
		System.out.print(milliseconds);
		System.out.print("\n");
	}

	public void setMidNight() {
		milliseconds = 0;
		seconds = 0;
		minutes = 0;
		hours = 0;
		
	}
	
	public void setMidDay() {
		milliseconds = 0;
		seconds = 0;
		minutes = 0;
		hours = 12;
		
	}
} 
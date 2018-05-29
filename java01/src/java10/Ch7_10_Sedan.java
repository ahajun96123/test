package java10;

public class Ch7_10_Sedan extends Ch7_10_Car {
	Ch7_10_Sedan(String color, int speed) {
		super(color, speed);
		// TODO Auto-generated constructor stub
	}

	private int seat;
	
	int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

}

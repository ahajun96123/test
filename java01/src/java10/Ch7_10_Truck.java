package java10;

public class Ch7_10_Truck extends Ch7_10_Car {
	Ch7_10_Truck(String color, int speed) {
		super(color, speed);
		// TODO Auto-generated constructor stub
	}

	private int carry;

	public int getCarry() {
		return carry;
	}

	public void setCarry(int carry) {
		this.carry = carry;
	}

}

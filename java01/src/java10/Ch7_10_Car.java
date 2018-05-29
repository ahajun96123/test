package java10;

public class Ch7_10_Car {
	private String color;
	private int speed;
	
	Ch7_10_Car(String color, int speed){
		this.color = color;
		this.speed = speed;
	}
	
	void speedUp(int speed) {
		this.speed += speed;
	}
	void speedDown(int speed) {
		this.speed -= speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

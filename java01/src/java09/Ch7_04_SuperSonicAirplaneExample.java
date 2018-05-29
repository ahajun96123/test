package java09;

public class Ch7_04_SuperSonicAirplaneExample {

	public static void main(String[] args) {
		Ch7_04_SuperSonicAirplane sa = new Ch7_04_SuperSonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = Ch7_04_SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = Ch7_04_SuperSonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}

package java07;

//상수 선언
public class Ch6_13_Earth {
	static final double EARTH_RADIUS = 6400;	//상수선언시 static final은 무조건 써준다
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_SURFACE_AREA*EARTH_RADIUS;
	}

}

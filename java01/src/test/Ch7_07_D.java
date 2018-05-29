package test;

import java10.Ch7_07_A;

public class Ch7_07_D extends Ch7_07_A{
	public Ch7_07_D() {
		//부모클래스의 생성자 호출
		super();
		//부모클래스(A)의 필드, 메소드에 접근간능한지 확인
		this.a=3;
		this.a();
	}

}

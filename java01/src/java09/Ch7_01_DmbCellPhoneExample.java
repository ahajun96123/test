package java09;

public class Ch7_01_DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone에 대한 객체 생성
		
		//생성한 객체의 model, color, channel 값을 각각 출력
		Ch7_01_DmbCellPhone dmb = new Ch7_01_DmbCellPhone("gallaxy S9","코발트 블루",157);
		//자식 클래스
		dmb.turnOnDmb();
		dmb.changeChannelDmb(207);
		dmb.turnOffDmb();
		//부모 클래스
		dmb.PowerOn();
		dmb.powerOff();
		dmb.bell();
		dmb.sendVoice("안녕!");
		dmb.receiveVoice("나도 안녕!");
		dmb.hangUp();
		//생성한 객체의 model, color, channel 값을 출력
		System.out.println("모델명 : "+dmb.model);
		System.out.println("색상 : "+dmb.color);
		System.out.println("채널 : "+dmb.channel);

	}

}

package kr.ac.kopo.day15.inter;

public class UserMain {

	public static void main(String[] args) {
		
//		TV tv = new LGTV();
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeDown();
		tv.mute();
		tv.channelUp();
		tv.mute();
		tv.powerOff();
		SamsungTV sam = (SamsungTV)tv;
		
		System.out.println(sam);
		System.out.println(sam.toString());
		
	}
}










package kr.or.tv.model.vo;

public class SamsungTv implements Tv {
	public void powerOn() {
		System.out.println("SamsungTv--전원 켬");
	}
	public void powerOff() {
		System.out.println("SamsungTv--전원 끔");
	}
	public void volumeUp() {
		System.out.println("SamsungTv--소리키움");
	}
	public void volumeDown() {
		System.out.println("SamsungTv--소리 줄임");
	}
}

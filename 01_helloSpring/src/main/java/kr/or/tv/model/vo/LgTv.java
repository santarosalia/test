package kr.or.tv.model.vo;

public class LgTv implements Tv {
	public void powerOn() {
		System.out.println("lgTv--전원 켬");
	}
	public void powerOff() {
		System.out.println("lgTv--전원 끔");
	}
	public void volumeUp() {
		System.out.println("lgTv--소리키움");
	}
	public void volumeDown() {
		System.out.println("lgTv--소리 줄임");
	}
}

package kr.or.tv.model.vo;

public class TvFactory {
	public Tv getTv(String brand) {
		if(brand.equals("samsung")) {
			return new SamsungTv();
		}else if(brand.equals("lg")) {
			return new LgTv();
		}
		return null;
			
	}
}

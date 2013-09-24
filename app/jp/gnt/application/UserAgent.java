package jp.gnt.application;

public enum UserAgent {

	DOCOMO("fp",".jpg"), AU("fp",".jpg"), SOFTBANK("fp",".jpg"), MOBILE("",""), SMARTPHONE("",""), 
	ANDROID("adr",".jpg"), IPHONE3("adr",".jpg"), IPHONE("ip4",".jpg"), IPAD("ip4",".jpg"), BLACKBERRY("",""), MOTOROLA("",""), 
	LG("",""), LESS_CSS("",""), EZWEB("fp",".jpg"), PC("adr",".jpg"), DEFAULT("adr",".jpg");
	
	public String imageDir;
	
	public String ext;
	
	private UserAgent(String imageDir, String ext) {
		this.imageDir = imageDir;
		this.ext = ext;
	}
}

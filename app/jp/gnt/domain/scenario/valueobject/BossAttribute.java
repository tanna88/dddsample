package jp.gnt.domain.scenario.valueobject;

import play.i18n.Messages;

public enum BossAttribute {

	ALL("all"),STRENGTH("strength"),INTELLIGENT("intelligent"),EROTIC("erotic");

	//ALL("全部", "ALL"),STRENGTH("力", "STRENGTH"),INTELLIGENT("知", "INTELLIGENT"),EROTIC("魅", "EROTIC");

	public String name;

	private String str;
	BossAttribute(String label){
		this.name = Messages.get("cardAttribute." + label + ".name");
		this.str = Messages.get("cardAttribute." + label);
	}
	public String toString() {
		return str;
	}

}

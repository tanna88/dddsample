package jp.gnt.application.domain.model;


import play.db.jpa.Model;


public class SpecialAttack extends Model {
	private static final long serialVersionUID = 943314520245650601L;

	public String name;
	public String description;
	public int maxLv;
	public int atkUp;
	public int defUp;
	public RankId rankId = RankId.ALL;
	
	public enum RankId {
		ALL, MYSEFL, SAME_ATTRIBUTE
	}
	
	public String toString() {
		String name = this.name;
		if (name == null || "".equals(name)) {
			name = "(no name)";
		}
		return "【" + getId() + "】 " + name;
	}
}

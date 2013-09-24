package jp.gnt.domain.scenario.admin.model;

import com.google.code.morphia.annotations.Entity;

import jp.gnt.application.domain.model.SpecialAttack;
import jp.gnt.domain.scenario.valueobject.BossAttribute;
import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity(noClassnameStored = true)
public class Boss extends Model {

	private static final long serialVersionUID = 943314524584650601L;

	private String name;
	private String description;
	private boolean kingFlag;

	private BossAttribute bossAttribute;
	private int defaultHP;
	private int defaultAtk;
	private int defaultDef;
	private int limitHP;
	private int limitAtk;
	private int limitDef;

	private String image;
	private Blob upimage;

	private Blob upinactiveImage;

	private String inactiveImage;

	private SpecialAttack specialAttackId1;
	private int specialAttackLv1;
	private String nameLv1;
	
	private String descriptionLv1;
	private String descriptionAfterLv1;

	private String imageLv1;
	private Blob upimageLv1;

	private SpecialAttack specialAttackId2;
	private int specialAttackLv2;
	private String nameLv2;
	
	private String descriptionLv2;
	private String descriptionAfterLv2;

	private String imageLv2;
	private Blob upimageLv2;

	private SpecialAttack specialAttackId3;
	private int specialAttackLv3;
	private String nameLv3;

	private String descriptionLv3;
	private String descriptionAfterLv3;

	private String imageLv3;
	private Blob upimageLv3;
}

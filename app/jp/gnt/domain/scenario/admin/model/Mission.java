package jp.gnt.domain.scenario.admin.model;

import java.util.List;

import com.google.code.morphia.annotations.Entity;

import jp.gnt.application.domain.model.Reward;
import play.data.validation.MaxSize;
import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity(noClassnameStored = true)
public class Mission extends Model {
	private static final long serialVersionUID = 943314523984650601L;

	private int priority;
	private String name;
	private String description;
	private boolean isFree;
	private Area area;

	private int rewardPoly;
	private int rewardExp;

	private enum MissionType {
		NORMAL, BOSS
	}

	private MissionType missionType;

	private int requiredStamina;
	private int requiredActionNum;

	private String image;

	private Blob upimage;

	private int currentAction;

	private Boss boss;
	private int bossLv;

	private int bossSexyLv;

	private Mission nextMission;

	private List<Reward> rewardCards;

	private List<Reward> rewardItems;

//	private TreasureGroup rewardTreasureGroup;

	private int cardDropProbability;

	private int itemDropProbability;

	private int treasureDropProbability;
	
	private int opponentProbability = 0;
	
	private List<Reward> enemysList;
	
	private List<Enemy> enemyList;
}

package jp.gnt.application;

import java.util.Arrays;
import java.util.List;

import play.Play;
import play.i18n.Messages;
import play.mvc.Router;

public final class Constants {
	
	public static final String NULL="null";
	
	public static final String RESOURCE_VERSION;
	
	public static final float BONUS_STRENGTHEN_CARD = 1.5f;
	
	public static final boolean TEST_MODE;
	
	public static final BuildPlatform PLATFORM;

	public static final String SERVER_CASSANDRA;

	public static final String IMG_PATH;

	public static final String IMG_URL;

	public static final String PUBLIC_URL;

	public static final String IMG_NOIMAGE_URL;

	public static final int NUMBER_PAGE_OF_FORUM = 20;

	public static final int NUMBER_PAGE_OF_SEARCH = 5;

	public static final int PAGE_SEARCH = 50;

	public static final int CARD_EXP_CONSTANT = 1;

	public static final int CARD_EXP_FACTORY = 5;

	public static final int USER_EXP_CONSTANT = 120;

	public static final int USER_EXP_FACTORY = 500;

	public static final int INTRO_LIMIT_CHAR_NUM = 200;

	public static final int GREETING_LIMIT_CHAR_NUM = 100;

	public static final int MAX_GREETINGS_PER_DAY = 100;

	public static final int INVITATION_POINT = 1;

	// public static final String EMOJI_PACKAGE =
	// "";

	public static final String EMOJI_URL;

	public static final int RESET_HOUR = 5;

	public static final String ATK_PREFIX_DECK = "ATK";

	public static final String DEF_PREFIX_DECK = "DEF";

	public static final int FRIEND_VISIT_GP_GET = 8;
	public static final int GUEST_VISIT_GP_GET = 4;
	public static final int FRIEND_GREETING_GP_GET = 12;
	public static final int GUEST_GREETING_GP_GET = 6;
	public static final int MYPAGE_DEFAULT_GREETING_NUM = 2;

	public static final int ADD_SCHEDULE_SENDGIFT = 1;
	public static final int ADD_SCHEDULE_PUSHNOTIFICATION = 2;
	public static final int ADD_SCHEDULE_GREE_NOTIFICATION = 3;
	public static final int ADD_SCHEDULE_MOBAGE_NOTIFICATION = 4;

	public static final int REMOVE_SCHEDULE_SENDGIFT = 11;
	public static final int REMOVE_SCHEDULE_PUSHNOTIFICATION = 12;
	public static final int REMOVE_SCHEDULE_GREE_NOTIFICATION = 13;
	public static final int REMOVE_SCHEDULE_MOBAGE_NOTIFICATION = 14;
	
	public static final String TUTORIAL_REWARD;
	
	public static final int SESSION_KEY_TTL;

	public static boolean USE_TEST_FEATURE = "on".equals(Play.configuration.getProperty("test_feature"));
	
	public static boolean IS_BETA_MODE = "beta".equals(Play.id);
	
	public static final String[] cardIds = { "card1", "card2", "card3", "card4", "card5" };

	// public static final List<String> allDecksId = Arrays.asList("1", "2",
	// "3", "4", "5");

	public static final int MAX_DECK = 6;
	public static final int MAX_CARD_IN_DECK = 5;

	public static final int MAX_MEM_CARDS = 100;
	
	public static final int LIMIT_GET_CARD = 1000;

	public static final int MAX_MATERIAL_CARDS = 10;

	public static final int MAX_COIN_IN_MONTH = 380000;

	public static final int MAX_LEVEL_OF_BOSS = 50;

	public static final int MAX_LEVEL_OF_QUEEN = 50;

	public static final int MAX_MEMBER_TO_FIGHT_QUEEN = 10;

	public static final int MAX_GIFT_RATE_POLY = 100;

	public static final int MAX_SENT_GIFT = 10;

	public static final int MAX_RECEIVE_GIFT = Integer.parseInt(Play.configuration.getProperty("max_receive_gift", "9999"));
	
	public static final int MAX_TREASURE_IN_GROUP = 6;
	// ///
	public static final String ANDROID = "ANDROID";
	public static final String IOS = "IOS";
	// //
	public static final String FLASH_PATH;

	public static final String TEMP_PATH;

	public static final int NOTIFICATION_PAGING = 10;

	public static final String GAME_ID = Play.configuration.getProperty("game_id");

	public static final String PUSH_LINK;

	public static final String PUSH_SERVER;

	public static final String PUSH_LINK_NEW;

	public static final String PUSH_SERVER_NEW;

	public static final String BG_SERVER;

	public static final String CLEAR_URL;

	public static final int RANKING_PAGING = 20;
	
	public static final int TOP_HIGH_RARE = 3;
	
	public static final int TOP_MORE_HIGH_RARE = 10;

	public static final int TUTORIAL_FINISH;

	public static final int TUTORIAL_CHOOSE_CARD;

	public static final String[] TUTORIAL_CARD_OPTIONS;

	public static final String RECOMMENDED_DECK_ID = "recommendDeck";

	public static final String GA_TRACKING_ID;

	public static final String GA_TRACKING_ID_IOS;

	public static final String GAMO_TRACKING_ID;

	public static final String FP_BASEURL;
	
	public static final String SP_BASEURL;

	public static final String REAL_BASE;

	public static final String GREE_SP_TOUCH_JS;

	public static final long LIMIT_UPDATE_STAMINA = 1000 * 60 * 30;

	public static final int STAMINA_RECOVERY_PER_MINUTE = 5;

	public static final int FORCE_RECOVERY_PER_MINUTE = 1;

	public static final int UPDATE_ONLINE = 60 * 30;

	public static final int UPDATE_ACTIVE_1DAY = 60 * 60 * 24 * 1;

	public static final int UPDATE_ACTIVE_2DAY = 60 * 60 * 24 * 2;

	public static final int UPDATE_ACTIVE_3DAY = 60 * 60 * 24 * 3;

	public static final int QUEEN_FRIEND_INVITE_LIMIT = 9;

	public static final int MEET_QUEEN_LIMIT = 1;

	public static final int QUEEN_BATTLE_FEE_COST = 10;

	public static final int DAMAGE_INDEX = 0;

	public static final int MULTIPOINT_INDEX = 1;

	public static final boolean IS_WRITE_LOG = true;

	public static final boolean IS_WRITE_COIN_LOG = true;

	public static final int FP_GREETING_MSG_NUM;
	
	public static final int NUM_PLAY_QUEEN_GACHA = 50;
	
	public static final String greeInviteMsgShiftJis = "%82%a2%82%c2%82%e0%8f%95%82%a9%82%c1%82%c4%82%dc%82%b7%28%5e0%5e%81%55%82%dc%82%bd%8f%b5%91%d2%82%b5%82%c4%88%ab%82%a2%82%f1%82%be%82%af%82%c7%a4%94%fc%8f%97%ce%df%d8%bd%82%c1%82%c4%b9%de%b0%d1%82%bf%82%e5%82%c1%82%c6%82%be%82%af%82%e2%82%c1%82%c4%97%7e%82%b5%82%a2%82%c5%82%b7%82%c1%28%81%45_%81%45%3b%29%0a%82%c7%81%5b%82%b5%82%c4%82%e0%8f%b5%91%d2%93%c1%93%54%82%aa%82%d9%82%b5%82%a2%82%cc%82%c1%21%c1%ad%b0%c4%d8%b1%d9%8c%e3%82%cd30%95%aa%8a%d4%91%cc%97%cd%96%b3%90%a7%8c%c0%82%be%82%b5%81%49%82%a8%8a%e8%82%a2%82%c1%81%49%0a%8b%43%82%c9%93%fc%82%c1%82%bd%82%e7%90%a5%94%f1%88%ea%8f%8f%82%c9%82%e2%82%e8%82%dc%82%b5%82%e5%82%a4%81%f4%81%f4";
	public static final String greeInvitemsgUtf8 = "%e3%81%84%e3%81%a4%e3%82%82%e3%81%82%e3%82%8a%e3%81%8c%e3%81%a8%e3%81%86%28%5e0%5e%e3%82%9e%e3%81%be%e3%81%9f%e6%8b%9b%e5%be%85%e3%81%97%e3%81%a6%e6%82%aa%e3%81%84%e3%81%91%e3%81%a9%e3%80%81%e3%81%93%e3%81%ae%e3%82%b2%e3%83%bc%e3%83%a0%e3%81%a1%e3%82%87%e3%81%a3%e3%81%a8%e3%81%a0%e3%81%91%e3%82%84%e3%81%a3%e3%81%a6%e6%ac%b2%e3%81%97%e3%81%84%e3%81%a7%e3%81%99%28%e3%83%bb_%e3%83%bb%3b%29%e3%81%a9%e3%83%bc%e3%81%97%e3%81%a6%e3%82%82%e6%8b%9b%e5%be%85%e7%89%b9%e5%85%b8%e3%81%8c%e3%81%bb%e3%81%97%e3%81%8f%e3%81%a6%e2%80%a5%e3%81%8a%e9%a1%98%e3%81%84%e3%81%a3%ef%bc%81";
	public static final String inviteMsgShiftJis = "%82%a2%82%c2%82%e0%8f%95%82%a9%82%c1%82%c4%82%dc%82%b7%28%5e0%5e%81U%82%dc%82%bd%8f%b5%91%d2%82%b5%82%c4%88%ab%82%a2%82%f1%82%be%82%af%82%c7%a4%94%fc%8f%97%ce%df%d8%bd%82%c1%82%c4%b9%de%b0%d1%82%bf%82%e5%82%c1%82%c6%82%be%82%af%82%c5%82%a2%82%a2%82%cc%82%c5%82%e2%82%c1%82%c4%82%ad%82%be%82%b3%82%a2%82%c1%28%81E_%81E%81G%29%5cn%82%c7%81%5b%82%b5%82%c4%82%e0%8f%b5%91%d2%93%c1%93T%82%aa%82%d9%82%b5%82%a2%82%cc%82%c1%21%5cn%89%bd%82%c6%82%a9%82%a8%8a%e8%82%a2%82%c1%21%21%8bC%82%c9%93%fc%82%c1%82%bd%82%e7%90%a5%94%f1%88%ea%8f%8f%82%c9%82%e2%82%e8%82%dc%82%b5%82%e5%82%a4%81%f4%81%f4";
	public static final String invitemsgUtf8 = "%e3%81%84%e3%81%a4%e3%82%82%e5%8a%a9%e3%81%8b%e3%81%a3%e3%81%a6%e3%81%be%e3%81%99%28%5e0%5e%e3%82%9e%e3%81%be%e3%81%9f%e6%8b%9b%e5%be%85%e3%81%97%e3%81%a6%e6%82%aa%e3%81%84%e3%82%93%e3%81%a0%e3%81%91%e3%81%a9%ef%bd%a4%e7%be%8e%e5%a5%b3%ef%be%8e%ef%be%9f%ef%be%98%ef%bd%bd%e3%81%a3%e3%81%a6%ef%bd%b9%ef%be%9e%ef%bd%b0%ef%be%91%e3%81%a1%e3%82%87%e3%81%a3%e3%81%a8%e3%81%a0%e3%81%91%e3%81%a7%e3%81%84%e3%81%84%e3%81%ae%e3%81%a7%e3%82%84%e3%81%a3%e3%81%a6%e3%81%8f%e3%81%a0%e3%81%95%e3%81%84%e3%81%a3%28%e3%83%bb_%e3%83%bb%ef%bc%9b%29%c2%a5n%e3%81%a9%e3%83%bc%e3%81%97%e3%81%a6%e3%82%82%e6%8b%9b%e5%be%85%e7%89%b9%e5%85%b8%e3%81%8c%e3%81%bb%e3%81%97%e3%81%84%e3%81%ae%e3%81%a3%21%c2%a5n%e4%bd%95%e3%81%a8%e3%81%8b%e3%81%8a%e9%a1%98%e3%81%84%e3%81%a3%21%21%e6%b0%97%e3%81%ab%e5%85%a5%e3%81%a3%e3%81%9f%e3%82%89%e6%98%af%e9%9d%9e%e4%b8%80%e7%b7%92%e3%81%ab%e3%82%84%e3%82%8a%e3%81%be%e3%81%97%e3%82%87%e3%81%86%e2%99%aa%e2%99%aa";
	
	// Reward
	public static final String APPDRIVER_URL;
	public static final String APPDRIVER_IP;
	public static final String APPDRIVER_MEDIA_ID;
	public static final String APPDRIVER_KEY;
	public static final String APPDRIVER_ENCRYPT_KEY;
	
	// CAReward
	public static final String CAREWARD_URL;
//	public static final String CAREWARD_IP;
//	public static final String CAREWARD_CID;
//	public static final String CAREWARD_MID;
//	public static final String CAREWARD_TID;
//	public static final String CAREWARD_GUID;
	public static final String CAREWARD_ENCRYPT_KEY;
	public static final int CAREWARD_REQUEST_LIMIT = 2;
	
	public static final String DEFAULT_WEB_SCHEMA = "app://defaultweb?";
	public static final String METAPS_SCHEMA = "app://metaps?";
	public static final String GNT_REWARD_SCHEMA = "app://gntreward?";
	public static final String CA_REWARD_SCHEMA = "app://careward?";

	public static String NOTIFICATION_PATH = "/usr/local/src/notification/";
	public static String ANDROID_MEMIDS_FILENAME = "androidMemIdsStandalone";
	public static String IOS_MEMIDS_FILENAME = "iosMemIdsStandalone";
	public static String MEMIDS_FILENAME = "memIdsStandalone";
	public static final String MASTER_COUNTER_CF = "CardGameCounter";
	
	public static final String MBG_INVITATION_REWARD = Play.configuration.getProperty("cardgame.invitation.reward", "");
	//Bg sound
	public static String TUTORIAL_ACTION = Play.configuration.getProperty("tutorial.action");
	public static String TUTORIAL_PAGES = Play.configuration.getProperty("tutorial.pages");
	
	public static final int LIMIT_GIFT_RECEIVE = Integer.parseInt(Play.configuration.getProperty("limit_gift_receive", "30"));

	public static final int NUM_NEW_REGISTER = 20;
	
	public static final int LEVEL_SEARCH_BATTLE;
	
	public static final String INACTIVE_FILTER;
	
	public static final String QUEEN_EVENT_DATE_FORMAT = Play.configuration.getProperty("queen_event_date_format","MM月 dd日 (E) HH:mm");
	
	public static final String SECURE_URL;
	// Time is used for updating ranking of vote card in hazecache
	public static final int UPDATE_VOTECARD_RANKING_MINS_TIME;
	
	public static final String SUFFIX_NEW_USER_ANIMATION = Play.configuration.getProperty("suffix_new_user_animation", "");
	// http://redmine.gnt.co.jp/documents/907
	public static final List<String> SEESIONKEY_URL_LIST = Arrays.asList("/", "/changemodel", "/setpassword", "/mypage", "/menu", "/coin",
			"/votecardevent/votetop", "/invitation", "/page", "/magazinereward/serialnumber", "/mission", "/area/normalmission", "/area/investigate",
			"/area/missionResult", "/gacha", "/gachanormal", "/gachabatchnormal", "/gachacoin", "/gachabatchcoin", "/gacha/gachareward",
			"/gacha/gacharesult", "/card/strengthenconfirm", "/card/evolutionconfirm", "/card/listsellcard", "/card/sellconfirm",
			"/item/useitemconfirm", "/gift/giftlistfromadmin", "/gift/giftlistfromuser", "/gift/acceptgift", "/gift/receiveallgiftsuser",
			"/gift/receiveallgiftsadmin", "/shop", "/shop/confirmbuyset", "/shop/buysetitem", "/deck/editdeck", "/deck/removecard", "/deck/cleardeckconfirm",
			"/friend/requestconfirm", "/friend/unfriendconfirm", "/friend/removerequestconfirm", "/friend/requestfriendsconfirm",
			"/friend/acceptconfirm", "/friend/denyconfirm", "/gift/sentgiftto", "/gift/choicegift", "/gift/sendgiftconfirm", "/guest/trade",
			"/battle", "/battle/battleprepare", "/battle/battletreasure", "/battle/battlestart", "/battle/battleResult", "/queen/prepare",
			"/queen/fightqueen", "/gacha/gachaanimation", "/queen/gachaanimation", "/queen/gacharesult");

	public static final int TIME_ROCKIE_BATTLE = 1;
	public static final int DAYS_LIMIT_ROCKIE_BATTLE = 3;
	static {
		
		String build = Play.configuration.getProperty("cardgame.build.platform");
		if ("gree".equalsIgnoreCase(build)) {
			PLATFORM = BuildPlatform.GREE;
		} else if ("mobage".equalsIgnoreCase(build)) {
			PLATFORM = BuildPlatform.MOBAGE;
		} else if ("mixi".equalsIgnoreCase(build)) {
			PLATFORM = BuildPlatform.MIXI;
		} else if ("mobageus".equalsIgnoreCase(build)) {
			PLATFORM = BuildPlatform.MOBAGEUS;
		} else {
			PLATFORM = BuildPlatform.STANDALONE;
		}
		
		TEST_MODE = Boolean.parseBoolean(Play.configuration.getProperty("test_mode","false"));
		
		if(TEST_MODE){
			INACTIVE_FILTER = "debug !=";
		}else{
			INACTIVE_FILTER = "inactive";
		}
				
		SERVER_CASSANDRA = Play.configuration.getProperty("cassandra.host");

		PUSH_SERVER = Play.configuration.getProperty("pushserver");
		PUSH_SERVER_NEW = Play.configuration.getProperty("pushserver.new");

		PUSH_LINK = PUSH_SERVER + "pushnotification/";
		PUSH_LINK_NEW = PUSH_SERVER_NEW + "pushnotification/";

		BG_SERVER = Play.configuration.getProperty("backgroundServer");
		
		FP_BASEURL = Play.configuration.getProperty("cardgame.fp.baseUrl");
		SP_BASEURL = Play.configuration.getProperty("cardgame.sp.baseUrl");
		GREE_SP_TOUCH_JS = Play.configuration.getProperty("cardgame.sp.touch");
		REAL_BASE = Play.configuration.getProperty("cardgame.url.realBase");
		
		RESOURCE_VERSION = Play.configuration.getProperty("cardgame.url.version", "1");

		CLEAR_URL = Router.reverse("Template.clear").url;
		FLASH_PATH = Play.applicationPath.getAbsolutePath() + "/data/attachments/";
		TEMP_PATH = Play.applicationPath.getAbsolutePath() + "/data/temp/";

		EMOJI_URL = Play.configuration.getProperty("cardgame.url.emoji");
		IMG_PATH = Play.configuration.getProperty("cardgame.url.imgPath");
		IMG_URL = Play.configuration.getProperty("cardgame.url.imgUrl");
		PUBLIC_URL = Play.configuration.getProperty("cardgame.url.publicUrl", Constants.REAL_BASE);
		IMG_NOIMAGE_URL = IMG_URL + Play.configuration.getProperty("cardgame.url.noImg");

		GA_TRACKING_ID = Play.configuration.getProperty("cardgame.ga.id");
		GA_TRACKING_ID_IOS = Play.configuration.getProperty("cardgame.ga.ios");
		GAMO_TRACKING_ID = Play.configuration.getProperty("cardgame.gamo.id");

		// Reward
		APPDRIVER_URL = Play.configuration.getProperty("cardgame.appdriver.url");
		APPDRIVER_IP = Play.configuration.getProperty("cardgame.appdriver.ip");
		APPDRIVER_MEDIA_ID = Play.configuration.getProperty("cardgame.appdriver.media_id");
		APPDRIVER_KEY = Play.configuration.getProperty("cardgame.appdriver.key");		
		APPDRIVER_ENCRYPT_KEY = Play.configuration.getProperty("cardgame.appdriver.encrypt_key");
		
		// CAReward
		CAREWARD_URL = Play.configuration.getProperty("cardgame.careward.url");
//		CAREWARD_IP = Play.configuration.getProperty("cardgame.careward.ip");
//		CAREWARD_CID = Play.configuration.getProperty("cardgame.careward.cid");
//		CAREWARD_MID = Play.configuration.getProperty("cardgame.careward.mid");
//		CAREWARD_TID = Play.configuration.getProperty("cardgame.careward.tid");
//		CAREWARD_GUID = Play.configuration.getProperty("cardgame.careward.guid");
		CAREWARD_ENCRYPT_KEY = Play.configuration.getProperty("cardgame.careward.encrypt_key");

		// Tutorial
		TUTORIAL_FINISH = Integer.parseInt(Play.configuration.getProperty("cardgame.tutorial.finishStep", "15"));
		TUTORIAL_CHOOSE_CARD = Integer.parseInt(Play.configuration.getProperty("cardgame.tutorial.chooseCardStep", "2"));
		String options = Play.configuration.getProperty("cardgame.tutorial.cardOptions");
		if (options != null && !"".equals(options)) {
			TUTORIAL_CARD_OPTIONS = options.split(",");
		} else {
			TUTORIAL_CARD_OPTIONS = Play.configuration.getProperty("cardgame.init.cardId").split(",");
		}
		TUTORIAL_REWARD = Play.configuration.getProperty("cardgame.tutorial.reward");
		FP_GREETING_MSG_NUM = Integer.parseInt(Play.configuration.getProperty("cardgame.fpgreeting.num"));
		// GREETING
		
		LEVEL_SEARCH_BATTLE = Integer.parseInt(Play.configuration.getProperty("cardgame.MemListConst.SEARCHRANDOM", "150"));
		
		SECURE_URL = Play.configuration.getProperty("cardgame.url.secure", Constants.REAL_BASE);
		
		SESSION_KEY_TTL = Integer.parseInt(Play.configuration.getProperty("session-ttl", "3600"));
		UPDATE_VOTECARD_RANKING_MINS_TIME = Integer.parseInt(Play.configuration.getProperty("cardgame.votecard.update-ranking-time.mins", "15"));
	}

	public enum NotificationType {
		FRIEND_REQUEST(0), PRESENT_RECEIVE(1), TRADE_REQUEST(2), TRADE_ACCEPT(3), 
		QUEEN_PARTY(4), QUEEN_PARTY_NOTFIEND(5), QUEEN_PARTY_FRIEND(6), 
		INVITATION(7), CLEAR_BADGE(8), SYSTEM(9), BATTLE_EVENT(10), BATTLE(11), FRIEND_ACCEPT(12), 
		TEAM_BATTLE_USE_SKILL(13), TEAM_BATTLE_CONVENE_MSG(14), GREETING_FRIEND(15), CRON_PUSH(16),
		GENERATE_PASSWORD(17);

		private String msg;
		private String label;
		private int type;

		private NotificationType(int type) {
			this.type = type;
			this.msg = Messages.get("notification.type" + type + ".msg", "");
			this.label = Messages.get("notification.type" + type + ".label");
		}

		public String getMsg() {
			return msg;
		}

		public String getMsg(Object... args) {
			if (args == null || args.length <= 0) {
				return msg;
			} else {
				return Messages.get("notification.type" + type + ".msg", args);
			}
		}

		public String getLabel() {
			return label;
		}
		
		public String getPushMsg(Object... args) {
			return Messages.get("notification.type" + type + ".pushMsg", args);
		}
	}

	public enum ImageType {
		big_image1, big_image2, big_image3,big_image4, thumbnail, small_image1, small_image2, small_image3, gacha_many, gacha_only, full;
	}

	public enum Permission {
		NO_PERMISSION(0, "Don't have permission"), READ_ONLY(1, "Read only"), READ_AND_WRITE(3, "Read and Write"), READ_WRITE_DELTE(7, "Read, Write and Delete"), ADMINISTRATIVE_PERMISSION(
				15, "Administrative permission");
		private int permission;
		private String label;

		private Permission(int permission, String label) {
			this.permission = permission;
			this.label = label;
		}

		public int getPermission() {
			return permission;
		}

		public String getLabel() {
			return label;
		}
	}

	public enum BuildPlatform {
		STANDALONE, GREE, MOBAGE, MIXI, MOBAGEUS
	}

	public enum TreasureGroupType {
		COMPLETE, UNCOMPLETE
	}

	public enum PushType {
		SEND("send"), ADD("add"), REMOVE("remove");
		private String type;

		private PushType(String type) {
			this.type = type;
		}

		public String getType() {
			return type;
		}
	}

	public enum CounterType {
		TREASURE_, TREASURE_UNCOMPLETE, TREASURE_COMPLETE, TREASURE_TRAP, SEND_GIFT_NUM_DAY, RECEIVE_GIFT_NUM_DAY, NOTIFICATION, ITEM, INVITAION, GREETING_LOG, GIFT, GIFT_ITEM, GIFT_NUM, CARD_NUM, CARD_COLLECTION, BOSS_COLLECTION, BOSS_EVENT_COLLECTION, BATTLE_CHECK_LOG, SET_ITEM, LOGIN_STAMP, COME_BACK_MAIL;
	}

	public enum SegmentType {
		INDEX, MYPAGE, MYPAGE_2, LIST_GACHA, GACHAINFO, GACHAINFO_FP, INDEX_FP, MYPAGE_FP, MYPAGE_2_FP, LIST_GACHA_FP, LIST_INVITATION, LIST_INVITATION_FP, 
		LIST_SHOP, LIST_SHOP_FP, GACHA_DETAILS, GACHA_DETAILS_FP, BATTLE_WIN, BATTLE_WIN_FP, BATTLE_LOSE, BATTLE_LOSE_FP, 
		LIST_GACHA_2, LIST_GACHA_2_FP, LIST_GACHA_3, LIST_GACHA_3_FP, LIST_GACHA_4, LIST_GACHA_4_FP, NO_STAMINA, NO_STAMINA_FP, 
		NOTIFICATION_LIST, NOTIFICATION_LIST_FP, MENU, MENU_FP, MISSION_EVENT, MISSION_EVENT_FP, BATTLE_TOP_FP, BATTLE_TOP, 
		MISSION_LIST, MISSION_LIST_FP, QUEEN_PREPARE, USEITEM_CONFIRM, QUEEN_PREPARE_FP, USEITEM_CONFIRM_FP,
		EVOLCOMPLETE, EVOLCOMPLETE_FP, STRENGTHEN, STRENGTHEN_FP, REQUESTFRIENDOK, REQUESTFRIENDOK_FP, BUYITEM, BUYITEM_FP, GACHARESULT, GACHARESULT_FP, 
		QUEEN_GACHARESULT, QUEEN_GACHARESULT_FP, QUEEN_ESCAPE, QUEEN_ESCAPE_FP, WINQUEEN, WINQUEEN_FP, BATTLE_EVENT_TOP, BATTLE_EVENT_TOP_FP, USE_ITEM_FINISH, USE_ITEM_FINISH_FP,
		AREA_GROUP_LIST, AREA_MISSION_LIST, AREA_AREA_LIST;
	}

	public enum EffectType {
		BUTTON, PUSH, ITEM_USE, MISSION_CLEAR, GACHA, GACHA_BATCH, GACHA_COIN, GACHA_COIN_BATCH, MISSION_ATTACK, MISSION_TREASURE, MISSION_RESULT
		,BATTLE_USERATTACK,BATTLE_BOSSATTACK,BATTLE_BOSSWIN,BATTLE_BOSSLOSE, BATTLE_FRIEND_START, BATTLE_FRIEND_SKILL, BATTLE_FRIEND_BATTLE, BATTLE_FRIEND_END
		,QUEENEVENT_MEET, QUEENEVENT_START, QUEENEVENT_MEMATTACK, QUEENEVENT_QUEENATTACK, QUEENEVENT_SKILL, QUEENEVENT_WIN, QUEENEVENT_GACHA
		,EVOLUTION_GROW,EVOLUTION_DONE, BATTLE_WIN,BATTLE_LOSE,LEVEL_UP
		,LOGIN_BONUS,WELCOME,STRENGTHEN_SELECT,STRENGTHEN_GROW,STRENGTHEN_LVUP,STRENGTHEN_DONE,EVOLUTION_SELECT,EVOLUTION_KODUCHI;
	}

	public enum PageType {
		FEATURE_PHONE, SMART_PHONE
	}

	public static final int ONE_DAY_IN_MS = 86400000; // = 24 * 3600 * 1000
	public static final int TIME_17H_IN_MS = 61200000; // = 17 * 3600 * 1000
	public static final int ONE_HOUR_IN_MS = 3600000; // = 3600 * 1000
	public static final int BONUS_DAYS_LIMIT = 5;
	public static final int BONUS_TIME = 5;
	public static final int DELAY_HOUR = 5;
	public static final int ITEMS_PER_PAGE = 5;

	public static final int GIFT_ITEM_ID = 9;

	public static final int BATTLE_LIMIT = 3;

	public static final int LIMIT_FRIEND = 100;

	public static final int MAGAZINE_LIMIT = 5;
	
	public static final int CHANGE_DEVICE_LIMIT = 3;
	
	public static final String DEFAULT_MAC_ADDR = "02:00:00:00:00:00";
	
	public static final String DEFAULT_MAC_VENDOR_ID = "00000000-0000-0000-0000-000000000000";

	public enum SerialType {
		EMPTY, ACTIVE;
	}
	
	public enum SysNotificationLinkType {
		CustomLink, CAReward, Metaps, AppReward, GNTReward;
	}
	
	public enum EnumPushStatus {
		NOT_PUSH(0, "Scheduled"), PUSHING(1,"Pushing"), PUSHED(2, "Pushed"), ERROR(3,"Error"), NO_MEMID(4, "No MemId");
		public int status ;
		public String msg;
		private EnumPushStatus(int status, String msg){
			this.status = status;
			this.msg = msg;
		}
	}

	public static final int MISSION_SESSION = 60 * 60 * 24 * 1;

    public static final int BATTLE_HISTORY = 60 * 60 * 24 * 30;
    public static final int BATTLE_EVENT = 60 * 60 * 24 * 60;
    public static final int GREETING_MSG = 60 * 60 * 24 * 30;
    public static final int NOTIFICATION_MSG = 60 * 60 * 24 * 30;
    public static final int GIFT_HISTORY = 60 * 60 * 24 * 30;
/*
	public static final int BATTLE_HISTORY = 60 * 60 * 24 * 7;
	public static final int BATTLE_EVENT = 60 * 60 * 24 * 60;
	public static final int GREETING_MSG = 60 * 60 * 24 * 7;
	public static final int NOTIFICATION_MSG = 60 * 60 * 24 * 5;
	public static final int GIFT_HISTORY = 60 * 60 * 24 * 1;
*/

	public enum GachaImageSize {
		SP_MANY_W(149), SP_MANY_H(200), SP_ONLY_W(283), SP_ONLY_H(380),

		FP_MANY_W(88), FP_MANY_H(120), FP_ONLY_W(179), FP_ONLY_H(240);

		private int size;

		private GachaImageSize(int size) {
			this.size = size;
		}

		public int getSize() {
			return size;
		}
	}

	public enum PayType {
		COIN(Messages.get("pay.coin")),
		POLY(Messages.get("pay.poly")), 
		GACHA_POINT(Messages.get("pay.gachaPoint")), 
		EVENT_POINT(Messages.get("pay.eventPoint")),
		COIN_AND_ITEM(Messages.get("pay.coinAndItem"));

		public String currency;

		PayType(String currency) {
			if (!StringUtils.isEmpty(currency))
				this.currency = currency;
			else
				this.currency = "";
		}
	}
	public enum MissonType {
		ALL_MISSION,NORMAL_MISSION, EVENT_MISSION;
	}
	
	public enum BatchOption {
		NORMAL_ONLY, BATCH_ONLY, NORMAL_BATCH;
	}
	
	//Max data group on mobage is 5
	public static final String TEXTDATA_GREETING = "GREETING_CBT";
	public static final String TEXTDATA_COMMENT = "COMMENT_CBT";
	public static final String TEXTDATA_COMMENT_BAZZAR = "COMMENT_BAZZAR_CBT";
	public static final String TEXTDATA_TEAM_INFO = "DATA_TEAM_INFO";
	public static final String TEXTDATA_TEAM_BBS = "DATA_TEAM_BBS";


	public static final Long START_LOGIN_STAMP =  1343296963561L;
	
	public static final String KEY_CHANGEPASS = "adminchange";

	public static final int NUM_NEW_REGISTER_RECOMMEND = 10;
	
	public enum AnimationCategory {
		GACHA, QUEEN_EVENT, EVENT_OPENING, LOGINSTAMP;
	}

	public enum MagazineTypes {
		ONE(0,0,0),
		MANY(0,0,0),
		
		
		//********** STANDALONE *************************//
		//Tutorial
		TUTORIAL(3,14,20), //AYAKASHI_SEXYPOLICE_TUTORIAL
		AYAKASHI_DESPERADO_TUTORIAL(19,12,2),
		AYAKASHI_TEACHER_TUTORIAL(19,12,3),
		AYAKASHI_SEXYPOLICE_IOS_TUTORIAL(18,12,5),
		AYAKASHI_SPY_TUTORIAL(11,12,5),
		AYAKASHI_SHINOBI_TUTORIAL(10,12,5),
		
		SEXYPOLICE_AYAKASHI_TUTORIAL(5,9,17),
		SEXYPOLICE_DESPERADO_TUTORIAL(11,19,7),
		SEXYPOLICE_TEACHER_TUTORIAL(11,19,8),
		SEXYPOLICE_SEXYPOLICE_IOS_TUTORIAL(12,19,5),
		SEXYPOLICE_SPY_TUTORIAL(13,19,5),
		SEXYPOLICE_SHINOBI_TUTORIAL(13,16,5),
		
		DESPERADO_AYAKASHI_TUTORIAL(20,12,3),
		DESPERADO_TEACHER_TUTORIAL(21,12,4),
		DESPERADO_SEXYPOLICE_TUTORIAL(7,20,9),
		DESPERADO_SEXYPOLICE_IOS_TUTORIAL(8,20,9),
		DESPERADO_SPY_TUTORIAL(9,20,9),
		DESPERADO_SHINOBI_TUTORIAL(9,2,5),
		
		SEXYPOLICE_IOS_AYAKASHI_TUTORIAL(5,9,17),
		SEXYPOLICE_IOS_DESPERADO_TUTORIAL(11,19,7),
		SEXYPOLICE_IOS_TEACHER_TUTORIAL(11,19,8),
		SEXYPOLICE_IOS_SEXYPOLICE_TUTORIAL(1,5,7),
		SEXYPOLICE_IOS_SPY_TUTORIAL(5,5,7),
		SEXYPOLICE_IOS_SHINOBI_TUTORIAL(5,3,7),
		
		TEACHER_AYAKASHI_TUTORIAL(10,11,12),
		TEACHER_SEXYPOLICE_IOS_TUTORIAL(10,11,13),
		TEACHER_SEXYPOLICE_TUTORIAL(10,11,14),
		TEACHER_DESPERADO_TUTORIAL(10,11,15),
		TEACHER_SPY_TUTORIAL(9,9,8),
		TEACHER_SHINOBI_TUTORIAL(7,9,8),
		
		SPY_AYAKASHI_TUTORIAL(7,11,13),
		SPY_TEACHER_TUTORIAL(8,12,13),
		SPY_SEXYPOLICE_IOS_TUTORIAL(9,13,14),
		SPY_SEXYPOLICE_TUTORIAL(10,14,15),
		SPY_SHINOBI_TUTORIAL(10,12,13),
		
		SHINOBI_AYAKASHI_TUTORIAL(10,15,12),
		SHINOBI_SEXYPOLICE_IOS_TUTORIAL(10,11,16),
		SHINOBI_SEXYPOLICE_TUTORIAL(10,1,19),
		SHINOBI_DESPERADO_TUTORIAL(10,2,1),
		SHINOBI_SPY_TUTORIAL(1,9,8),
		SHINOBI_TEACHER_TUTORIAL(2,9,8),
		
		//Mission==========================
		AYAKASHI_SEXYPOLICE_MISSION(17,11,5),
		AYAKASHI_DESPERADO_MISSION(6,10,12),
		AYAKASHI_SEXYPOLICE_IOS_MISSION(7,10,12),
		
		SEXYPOLICE_AYAKASHI_MISSION(18,2,11),
		SEXYPOLICE_DESPERADO_MISSION(11,20,3),
		SEXYPOLICE_SEXYPOLICE_IOS_MISSION(18,12,11),
		
		DESPERADO_AYAKASHI_MISSION(2,16,3),
		DESPERADO_SEXYPOLICE_MISSION(12,1,2),
		DESPERADO_SEXYPOLICE_IOS_MISSION(15,12,2),
		
		SEXYPOLICE_IOS_AYAKASHI_MISSION(18,2,11),
		SEXYPOLICE_IOS_DESPERADO_MISSION(11,20,3),
		SEXYPOLICE_IOS_SEXYPOLICE_MISSION(10,19,3),
		
		//AreaGroup1
		AYAKASHI_SEXYPOLICE_AREAGROUP1(19,18,2),
		AYAKASHI_DESPERADO_AREAGROUP1(1,8,2),
		AYAKASHI_SEXYPOLICE_IOS_AREAGROUP1(3,16,5),
		AYAKASHI_TEACHER_AREAGROUP1(3,17,6),
		
		SEXYPOLICE_IOS_AYAKASHI_AREAGROUP1(6,5,19),
		SEXYPOLICE_IOS_DESPERADO_AREAGROUP1(7,15,6),
		SEXYPOLICE_IOS_SEXYPOLICE_AREAGROUP1(8,17,20),
		
		DESPERADO_AYAKASHI_AREAGROUP1(20,1,3),
		DESPERADO_SEXYPOLICE_AREAGROUP1(19,1,3),
		DESPERADO_SEXYPOLICE_IOS_AREAGROUP1(18,1,3),
		
		SEXYPOLICE_AYAKASHI_AREAGROUP1(6,5,19),
		SEXYPOLICE_DESPERADO_AREAGROUP1(16,3,1),
		SEXYPOLICE_SEXYPOLICE_AREAGROUP1(15,3,1),
		
		TEACHER_SEXYPOLICE_IOS_AREAGROUP1(6,9,18),
		TEACHER_SEXYPOLICE_AREAGROUP1(17,10,6),
		TEACHER_AYAKASHI_AREAGROUP1(9,8,19),
		
		//AreaGroup2
		AYAKASHI_SEXYPOLICE_AREAGROUP2(18,10,6),
		AYAKASHI_DESPERADO_AREAGROUP2(5,9,11),
		AYAKASHI_SEXYPOLICE_IOS_AREAGROUP2(18,10,6),
		
		SEXYPOLICE_IOS_AYAKASHI_AREAGROUP2(19,3,13),
		SEXYPOLICE_IOS_DESPERADO_AREAGROUP2(13,20,5),
		SEXYPOLICE_IOS_SEXYPOLICE_AREAGROUP2(15,17,18),
		
		DESPERADO_AYAKASHI_AREAGROUP2(3,17,5),
		DESPERADO_SEXYPOLICE_AREAGROUP2(4,17,3),
		DESPERADO_SEXYPOLICE_IOS_AREAGROUP2(5,17,2),
		
		SEXYPOLICE_AYAKASHI_AREAGROUP2(19,3,13),
		SEXYPOLICE_DESPERADO_AREAGROUP2(14,12,11),
		SEXYPOLICE_SEXYPOLICE_AREAGROUP2(12,10,1),
		
		//AreaGroup3
		AYAKASHI_SEXYPOLICE_AREAGROUP3(19,10,7),
		AYAKASHI_DESPERADO_AREAGROUP3(6,9,11),
		AYAKASHI_SEXYPOLICE_IOS_AREAGROUP3(19,10,7),
		
		SEXYPOLICE_IOS_AYAKASHI_AREAGROUP3(19,5,15),
		SEXYPOLICE_IOS_DESPERADO_AREAGROUP3(15,20,6),
		SEXYPOLICE_IOS_SEXYPOLICE_AREAGROUP3(15,16,19),
		
		DESPERADO_AYAKASHI_AREAGROUP3(7,17,4),
		DESPERADO_SEXYPOLICE_AREAGROUP3(4,18,5),
		DESPERADO_SEXYPOLICE_IOS_AREAGROUP3(4,16,3),
		
		SEXYPOLICE_AYAKASHI_AREAGROUP3(19,5,15),
		SEXYPOLICE_DESPERADO_AREAGROUP3(19,12,18),
		SEXYPOLICE_SEXYPOLICE_AREAGROUP3(12,16,17),
		
		//AreaGroup4
		AYAKASHI_SEXYPOLICE_AREAGROUP4(17,10,5),
		AYAKASHI_DESPERADO_AREAGROUP4(5,10,7),
		AYAKASHI_SEXYPOLICE_IOS_AREAGROUP4(17,10,5),
		
		SEXYPOLICE_IOS_AYAKASHI_AREAGROUP4(9,13,1),
		SEXYPOLICE_IOS_DESPERADO_AREAGROUP4(1,2,5),
		SEXYPOLICE_IOS_SEXYPOLICE_AREAGROUP4(5,7,8),
		
		DESPERADO_AYAKASHI_AREAGROUP4(3,7,5),
		DESPERADO_SEXYPOLICE_AREAGROUP4(4,7,3),
		DESPERADO_SEXYPOLICE_IOS_AREAGROUP4(5,7,2),
		
		SEXYPOLICE_AYAKASHI_AREAGROUP4(9,13,1),
		SEXYPOLICE_DESPERADO_AREAGROUP4(14,2,1),
		SEXYPOLICE_SEXYPOLICE_AREAGROUP4(1,10,2),
		
		//********** MOBAGE *************************//
		//Tutorial
		MOBAGE_AYAKASHI_SEXYPOLICE_TUTORIAL(4,10,19), 
		MOBAGE_AYAKASHI_DESPERADO_TUTORIAL(20,11,1),
		MOBAGE_AYAKASHI_SEXYPOLICE_IOS_TUTORIAL(9,11,8),
		MOBAGE_AYAKASHI_SPY_TUTORIAL(20,9,13),
		
		MOBAGE_SEXYPOLICE_AYAKASHI_TUTORIAL(1,12,2),
		MOBAGE_SEXYPOLICE_DESPERADO_TUTORIAL(2,13,3),
		MOBAGE_SEXYPOLICE_SPY_TUTORIAL(13,9,13),

		
		MOBAGE_DESPERADO_AYAKASHI_TUTORIAL(3,14,4),
		MOBAGE_DESPERADO_SEXYPOLICE_TUTORIAL(7,20,5),
		MOBAGE_DESPERADO_SEXYPOLICE_IOS_TUTORIAL(7,9,1),
		
		
		MOBAGE_SPY_SEXYPOLICE_TUTORIAL(9,12,3),
		MOBAGE_SPY_AYAKASHI_TUTORIAL(19,15,3),

		//Mission
		MOBAGE_AYAKASHI_SEXYPOLICE_MISSION(4,15,6),
		MOBAGE_AYAKASHI_DESPERADO_MISSION(5,16,7),
		MOBAGE_AYAKASHI_SEXYPOLICE_IOS_MISSION(3,6,9),
		
		MOBAGE_SEXYPOLICE_AYAKASHI_MISSION(6,17,8),
		MOBAGE_SEXYPOLICE_DESPERADO_MISSION(7,18,9),
		
		MOBAGE_DESPERADO_AYAKASHI_MISSION(8,19,10),
		MOBAGE_DESPERADO_SEXYPOLICE_MISSION(9,11,15),
		MOBAGE_DESPERADO_SEXYPOLICE_IOS_MISSION(9,10,20),
		
		//Area group 1
		MOBAGE_AYAKASHI_SEXYPOLICE_AREAGROUP1(5,16,7),
		MOBAGE_AYAKASHI_DESPERADO_AREAGROUP1(1,16,8),
		MOBAGE_AYAKASHI_SEXYPOLICE_IOS_AREAGROUP1(3,9,2),
		MOBAGE_AYAKASHI_SPY_AREAGROUP1(17,9,13),
		
		MOBAGE_SEXYPOLICE_AYAKASHI_AREAGROUP1(1,20,15),
		MOBAGE_SEXYPOLICE_DESPERADO_AREAGROUP1(19,10,17),
		MOBAGE_SEXYPOLICE_SPY_AREAGROUP1(14,9,13),
		
		MOBAGE_DESPERADO_AYAKASHI_AREAGROUP1(6,9,10),
		MOBAGE_DESPERADO_SEXYPOLICE_AREAGROUP1(3,10,11),
		MOBAGE_DESPERADO_SEXYPOLICE_IOS_AREAGROUP1(11,10,20),
				
		//Area group 2
		MOBAGE_AYAKASHI_SEXYPOLICE_AREAGROUP2(3,15,7),
		MOBAGE_AYAKASHI_DESPERADO_AREAGROUP2(9,12,7),
		MOBAGE_AYAKASHI_SEXYPOLICE_IOS_AREAGROUP2(3,15,7),
		
		MOBAGE_SEXYPOLICE_AYAKASHI_AREAGROUP2(2,17,6),
		MOBAGE_SEXYPOLICE_DESPERADO_AREAGROUP2(13,14,2),
		
		MOBAGE_DESPERADO_AYAKASHI_AREAGROUP2(7,19,10),
		MOBAGE_DESPERADO_SEXYPOLICE_AREAGROUP2(10,12,15),
		MOBAGE_DESPERADO_SEXYPOLICE_IOS_AREAGROUP2(19,10,20),
		
		MOBAGE_SPY_SEXYPOLICE_AREAGROUP1(12,9,13),
		MOBAGE_SPY_AYAKASHI_AREAGROUP1(16,9,13);
		
		//*******************************************//
		
		
		public int key1;
		public int key2;
		public int key3;

		MagazineTypes(int key1,int key2,int key3) {
			this.key1 = key1;
			this.key2 = key2;
			this.key3 = key3;
		}
	}	
	
	public enum SnsSite {
		FACEBOOK, TWITTER;
	}
	
	public enum FreeStaminaType {
		LEVEL, REGIST_TIME;
	}
	
	public static final boolean CHECK_ALL_GIFT = Boolean.parseBoolean(Play.configuration.getProperty("cardgame.check_all_gift"));
}



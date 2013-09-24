package jp.gnt.application.impl;

import java.io.File;

import jp.gnt.application.Constants;
import jp.gnt.application.UserAgent;

import org.apache.commons.io.FileUtils;

public class ImageService {
	public static void uploadImage(File file, String name) {
		try {
			File dest = new File(Constants.IMG_PATH + name);
//			if(Constants.PLATFORM == BuildPlatform.GREE){
//				dest = new File("/var/static/sp/gree/" + name);
//			}else if(Constants.PLATFORM == BuildPlatform.MOBAGE){
//				dest = new File("/var/static/sp/mobage/" + name);
//			}else{
//				dest = new File("/var/static/sp/stand/" + name);
//			}
			FileUtils.copyFile(file, dest);
			
//			if(!Play.id.contains("dev")){
//				FileInputStream in = new FileInputStream(file);
//				S3Service s3Service = new RestS3Service(AmazonFactory.getAWSCredentials());
//				S3Bucket myBuckets = s3Service.getBucket("img.mobigame.jp");
//				S3Object object = new S3Object();
//				if (name.contains(".png")) {
//					object.setContentType("image/png");
//				} else if (name.contains(".jpg") || name.contains(".jpeg")) {
//					object.setContentType("image/jpg");
//				} else if (name.contains(".gif")) {
//					object.setContentType("image/gif");
//				} else if (name.contains(".swf")) {
//					object.setContentType("application/x-shockwave-flash");
//				}
//				object.setDataInputStream(in);
//				object.setName(Constants.IMG_PATH + name);
//				object.setAcl(AccessControlList.REST_CANNED_PUBLIC_READ);
//				s3Service.putObject(myBuckets, object);
//				s3Service.shutdown();
//			}
		} catch (Exception e) {
		
		}
	}

	public static String parseFullImageUrl(String src) {
		UserAgent deviceType = UserAgent.ANDROID;
//		if (SystemService.getDeviceRatio() == DeviceConst.Ratio.X2) {
//			deviceType = UserAgent.IPHONE;
//		}
//		if (Project.current().detectResolutionByRatio()) {
//			return parseFullImageUrl(deviceType, src);
//		}
//		
//		UserAgent deviceType = SystemService.getUserAgent();
		return parseFullImageUrl(deviceType, src);
	}
	
	
	public static String parseFullImageUrlAndroid(String src) {
		return parseFullImageUrl(UserAgent.ANDROID, src);
	}
	

	public static String parseFullImageUrl(UserAgent deviceType, String src) {
		if (src == null || "".equals(src)) {
			return Constants.PUBLIC_URL + "/public/images/bp_spacer.gif";
		} else if (src.contains(".")) {
			return Constants.IMG_URL + deviceType.imageDir + src;
		}
		return Constants.IMG_URL + deviceType.imageDir + src + deviceType.ext;
	}
}

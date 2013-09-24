package jp.gnt.application;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang.StringEscapeUtils;

public class StringUtils {
	private static final int C1 = 52845;
	private static final int C2 = 22719;
	
	protected static final char[] HEX_CHARS = { '0', '1', '2', '3', '4', '5',
		'6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
	
	public static boolean isEmpty(String s) {
        if (null == s || "".equals(s.trim()) || "null".equals(s) || "none".equals(s))
            return true;
        return false;
    }
	
	public static boolean isNotEmpty(String s) {
        return !isEmpty(s);
    }
	
	public static boolean isMatch(String s1, String s2){
		return (s1 + "").equals(s1 + "");
	}
	
	public static int[] convertStringToIntArray(String s) {
		String[] sa = s.split(",");
		int[] ia = new int[sa.length];
		for (int i = 0; i < sa.length; ++i) {
			ia[i] = Integer.parseInt(sa[i]);
		}
		return ia;
	}
	
	public static byte[] intToByteArray(int a) {
		byte[] ret = new byte[4];
		ret[3] = (byte) (a & 0xFF);
		ret[2] = (byte) ((a >> 8) & 0xFF);
		ret[1] = (byte) ((a >> 16) & 0xFF);
		ret[0] = (byte) ((a >> 24) & 0xFF);
		return ret;
	}
	
	private static char Decrypt_C(final char C, AtomicInteger aNumCode) {
		int NumCode = aNumCode.get();
		char convert = (char) (C ^ (NumCode >> 8));
		NumCode = (int) ((C + NumCode) * C1 + C2) & 0xFFFF;
		aNumCode.set(NumCode);
		return convert;
	}

	public static String Decrypt(String s, int key) {
		AtomicInteger aKey = new AtomicInteger(key);
		char[] sCharArray = s.toCharArray();
		for (int i = 0; i < s.length(); i++)
			sCharArray[i] = Decrypt_C(sCharArray[i], aKey);
		return new String(sCharArray);
	}
	
	public static int byteArrayToInt(byte[] b) {
		int value = 0;
		for (int i = 0; i < 4; i++) {
			int shift = (4 - 1 - i) * 8;
			value += (b[i] & 0x000000FF) << shift;
		}
		return value;
	}
	
	public static String urlSplitAction(String URL, String host){
		int shpos = URL.indexOf(host);
		int ehpos = URL.indexOf("/", shpos);
		int qpos = URL.indexOf('?');
		URL.substring(ehpos, qpos);
		return URL;
	}
	
	public static String urlAddParameter(String URL, String name, String value)
	{
		String lastedChar = URL.substring(URL.length()-1);
		if("&".equals(lastedChar)|| "?".equals(lastedChar)){
			URL = URL.substring(0, URL.length()-1);
		}
		
		int qpos = URL.indexOf('?');
		int hpos = URL.indexOf('#');
		char sep = qpos == -1 ? '?' : '&';
		String seg = sep + encodeUrl(name) + '=' + encodeUrl(value);
		return hpos == -1 ? URL + seg : URL.substring(0, hpos) + seg + URL.substring(hpos);
	}
	
	public static String urlRemoveParameter(String URL, String name)
	{
		String data = encodeUrl(name);
		int sdpos = URL.indexOf(data);
		if(sdpos == -1){
			return URL;
		}
		int edpos = URL.indexOf('&', sdpos);
		if(edpos == -1){
			URL = URL.substring(0, sdpos);
		}
		else{
			URL = URL.substring(0, sdpos)+ URL.substring(edpos+1, URL.length());
		}
		
		String lastedChar = URL.substring(URL.length()-1);
		if("&".equals(lastedChar)|| "?".equals(lastedChar)){
			URL = URL.substring(0, URL.length()-1);
		}
		return URL;
	}
	
	public static String encodeUrl(String url)
	{
		try{
			return URLEncoder.encode(url,"UTF-8");
		}
		catch(Exception e){
			return url;
		}
	}
	
	public static String byteArrayIdToStringId(byte[] bytes) {
		return new String(bytesToHex(bytes));
	}

	public static byte[] stringIdToByteArrayId(String id) {
		if (org.apache.commons.lang.StringUtils.isNotBlank(id)) {
			return hexToBytes(id);
		}
		return null;
	}
	
	public static String utf8Decode(String s) {
		String t = StringEscapeUtils.unescapeHtml(s);

		if (t.equals(s))
			try {
				return new String(s.getBytes("ISO-8859-1"), "UTF-8");
				// return new String(s.getBytes("ISO-8859-1"), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		return t;
	}

	public static char[] bytesToHex(byte[] raw) {
		if (raw != null) {
			int length = raw.length;
			char[] hex = new char[length * 2];
			for (int i = 0; i < length; i++) {
				int value = (raw[i] + 256) % 256;
				int highIndex = value >> 4;
				int lowIndex = value & 0x0f;
				hex[i * 2 + 0] = HEX_CHARS[highIndex];
				hex[i * 2 + 1] = HEX_CHARS[lowIndex];
			}
			return hex;
		} else
			return "".toCharArray();
	}

	public static byte[] hexToBytes(char[] hex) {
		int length = hex.length / 2;
		byte[] raw = new byte[length];
		for (int i = 0; i < length; i++) {
			int high = Character.digit(hex[i * 2], 16);
			int low = Character.digit(hex[i * 2 + 1], 16);
			int value = (high << 4) | low;
			if (value > 127)
				value -= 256;
			raw[i] = (byte) value;
		}
		return raw;
	}

	public static byte[] hexToBytes(String hex) {
		return hexToBytes(hex.toCharArray());
	}

//	public static String toMD5(String original) {
//		String destination = "";
//		try {
//			MessageDigest md5 = MessageDigest.getInstance("MD5");
//			md5.update(original.getBytes());
//			BigInteger dis = new BigInteger(1, md5.digest());
//			destination = dis.toString(16);
//
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//		return destination;
//	}
}

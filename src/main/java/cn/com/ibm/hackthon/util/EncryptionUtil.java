package cn.com.ibm.hackthon.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptionUtil {
	
	/**
	 * 字符串按MD5方式加密
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static String MD5(String str) throws Exception {
		MessageDigest digest = MessageDigest.getInstance("MD5");
		byte[] arr = digest.digest(str.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte item : arr) {
            sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString().toUpperCase();
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(MD5("hi"));
			System.out.println(MD5("12345"));
			System.out.println(MD5("lasd9234y24"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

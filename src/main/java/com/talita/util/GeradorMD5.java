package com.talita.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GeradorMD5 {

	public static String converterStringEmMD5(String conteudo) {
		MessageDigest messageDigest = null;
		
		try {
			messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(conteudo.getBytes());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return messageDigest.digest().toString();
	}
	
}

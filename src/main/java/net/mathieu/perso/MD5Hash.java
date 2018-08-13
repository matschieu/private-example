package net.mathieu.perso;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.xerces.impl.dv.util.HexBin;


public class MD5Hash {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		System.out.println(new String(HexBin.encode(MessageDigest.getInstance("MD5").digest("toto".getBytes()))).toLowerCase());
	}
}

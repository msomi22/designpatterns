package day.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 
 * 
 *
 */
public class FineHash {
	
	public static void main(String[] a) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			checksum(md, "");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param md
	 * @param filepath
	 * @return
	 */
	public static synchronized String checksum(MessageDigest md, String file) {
		StringBuilder checksum = new StringBuilder();
		try (DigestInputStream dis = new DigestInputStream(new FileInputStream(file), md)) {
			try {
				while (true) {
					if (dis.read() == -1) {
						md = dis.getMessageDigest();
						byte[] digest = md.digest();
						int len = digest.length;
						for (int i = 0; i < len; ++i) {
							byte b = digest[i];
							checksum.append(String.format("%02x", b));
						}
						break;
					}
				}
			} catch (Throwable t) {
				throw t;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return checksum.toString();
	}

}

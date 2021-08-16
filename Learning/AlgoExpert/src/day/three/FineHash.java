package day.three;

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
	public static synchronized String checksum(MessageDigest md, String filepath) {
		StringBuilder result = new StringBuilder();
		try (DigestInputStream dis = new DigestInputStream(new FileInputStream(filepath), md)) {
			try {
				while (true) {
					if (dis.read() == -1) {
						md = dis.getMessageDigest();
						byte[] gigest = md.digest();
						int len = gigest.length;
						for (int i = 0; i < len; ++i) {
							byte b = gigest[i];
							result.append(String.format("%02x", b));
						}
						break;
					}
				}
			} catch (Throwable t) {
				throw t;
			} finally {}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return result.toString();
	}

}

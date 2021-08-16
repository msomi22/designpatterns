package day.four.simplelearn;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NonBlockingIO_NIO {

	public static void main(String[] args) throws IOException {
		String file = "C:\\Users\\pmnjeru.HERCULES\\Documents\\demo.txt";
		FileInputStream fin = new FileInputStream(file);
		FileChannel rc = fin.getChannel();
		ByteBuffer bb = ByteBuffer.allocate(1024);
		int result = rc.read(bb);
		System.out.println(result);
		/*int result;
		while(rc.read(bb) != -1) {
			result = rc.read(bb);
			System.out.println(result);
		}*/
		
		

	}

}

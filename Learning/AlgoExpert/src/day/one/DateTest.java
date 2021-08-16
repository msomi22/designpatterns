package day.one;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		System.out.println("======" +sdf.format(new Date())); 
		//2014-09-27T12:53:19.0000521Z
		//2021-06-24T13:08:21Z

	}

}

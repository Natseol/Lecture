package c230901;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void test() {
		Date now = new Date();
		System.out.println(now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a HH:mm:ss.S");
		System.out.println(sdf.format(now));
		
		
	}
}

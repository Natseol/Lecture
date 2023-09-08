package c230901;

import java.util.Random;

public class MathTest {

	public static void test() {
		System.out.println(Math.abs(-5));
		System.out.println(Math.abs(-5.5));
		
		System.out.println(Math.ceil(5.1));//올림
		System.out.println(Math.ceil(5.0000000001));
		
		System.out.println(Math.floor(5.999));//내림
		
		System.out.println(Math.max(4, 7));
		System.out.println(Math.min(4, 7));
		
		System.out.println(Math.round(5.2));
		System.out.println(Math.round(5.8));
		
		Random rd = new Random();
		System.out.println(rd.nextInt(9)+1);//0~'9'전까지
		
		System.out.println("시작");
		
		for (int i=0; i<9;i++) {
		Random rd1 = new Random(i);//매개변수로 참조값(seed)을 전달할 수 있다
		System.out.println(rd1.nextInt(9)+1);
		}
		Random rd2 = new Random(5);
		System.out.println(rd2.nextInt(9)+1);
		
	}
}

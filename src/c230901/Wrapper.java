package c230901;

public class Wrapper {
	
	public static void test() {
		//Wrapper는 클래스들의 통칭이다. 원시 타입을 클래스로 묶어준다
		//Integer / Byte / Double / Float / Short / Long / Char / Boolean
		
		Integer wrappedInt = 128;
		System.out.println(wrappedInt);
		int unwrappedInt = wrappedInt;// 자동 타입 변환
		int unwrappedInt2 = wrappedInt.intValue();
		
		Integer wrappedInt2 = 128;
		System.out.println(wrappedInt == wrappedInt2);
		// == 을 사용하여 비교할 경우 일정한 범위 내에서는 같다고 결과가 나온다
		//byte, short, int => =128~127
		//unsigned => 숫자앞에 붙인다. byte:0~255 short:0~65535 ...
		
		System.out.println(wrappedInt.equals(wrappedInt2));
	}
}

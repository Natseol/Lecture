package myPack;

public class Variable01 {

	public static void main(String[] args) {
	
		//TypeCasting(형변환) 
		//대입연사자를 중심으로 왼쪽과 오른쪽 자료형을 일치시켜야할때가 있음
		
		double num = 58.2;
		
		//(타입)피연산자 (오른쪽)
		int score = (int)num;
		System.out.println(score);
		System.out.println(num);
		
		float value = (int)5.3;
		float value2 = 5.8f;
		float value3 = (float)5.8;
		
		int charTypeCasting = 65;
		char intTypeCasting = 65;//"A"
		int intTofloat = 10;
		
		System.out.println(intTypeCasting);
		System.out.println((char)charTypeCasting);
		System.out.println((float)intTofloat);
		
		
	}
}

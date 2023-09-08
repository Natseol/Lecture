package Object;

//필드영역 : 멤버변수(클래스변수 + 인스턴스변수)
//그외영역 : 지역변수

//			선언위치		생성시기
//인스턴스변수	클래스영역		인스턴스 생성될 떄
//클래스변수	클래스영역		클래스가 메모리에 올라갈 때
//지역변수		그외			변수 선언문이 실행되었을 때
//			(메서드,생성자,블럭내부)

class Variables {
	
	int instanceValiable;//인스턴스
	
	static int classVariable;//클래스

}

class Card {
	
	//인스턴스
	String kind;
	int number;
	
	//클래스 변수
	static int width=100;//폭
	static int height=200;//높이	
	
//	void Print() {
//		int num;
//		System.out.println(num);//지역변수라서 초기화가 안되어있음
//	}
	
}


public class Class02 {

	public static void main(String[] args) {
		
//		Variables.classVariable=20;//인스턴스를 생성하지 않아도 됨, 독립적
//		System.out.println(Variables.classVariable); // 자동초기화
		
		System.out.println("card의 폭 : "+Card.width);
		System.out.println("card의 높이 : "+Card.height);
		
		System.out.println();
		
		Card c1 =new Card();
		c1.kind = "◆";
		c1.number = 7;
		
		Card c2=new Card();
		c2.kind="♠";
		c2.number = 5;
		
		System.out.println("c1은 "+c1.kind+c1.number+" 사이즈 : "+c1.width+", "+c1.height);
		System.out.println("c2는 "+c2.kind+c2.number+" 사이즈 : "+c2.width+", "+c2.height);
		
		System.out.println();
		
		c1.width=20;//c1객체에서 변경하지만
		c1.height=20;//모두 공유
			
		System.out.println("c1은 "+c1.kind+c1.number+" 사이즈 : "+c1.width+", "+c1.height);//클래스변수를 쓸때는 객체보다는 클래스를 붙여서 쓰는 편이 좋다
		System.out.println("c2는 "+c2.kind+c2.number+" 사이즈 : "+c2.width+", "+c2.height);
		System.out.println("c2는 "+c2.kind+c2.number+" 사이즈 : "+Card.width+", "+Card.height);
		
		
		
		
	}//end of main
}

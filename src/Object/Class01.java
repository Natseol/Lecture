package Object;

import java.util.Scanner;

//다른 패키지의 클래스를 사용하고자 할 때
//import ReferenceType.ReferenceClass01;

class TV{

	String color;
	boolean power;
	int channel;//인스턴스 변수, heap영역에 생성, 객체의 생명주기와 같다
	
	void power()//void : 반환값이 없다
	{
		power = !power;		
	}
	
	void Channel1Up()
	{		
		channel++;
	}
	
	void Channel1Down()
	{		
		channel--;
	}	
}


//클래스는 대문자로 시작한다.
//public은 해당파일에서 하나만 쓸 수있다
//public이 붙은 클래스이름과 파일이름이 동일해야 한다
public class Class01 {

	int a = 3; //인스턴스 변수
	
	static int num = 3; //클래스 변수
	
	//메서드: 클래스가 지니고 있는 기능
	//사람을 예로 들면 밥먹기, 공부하기...
	//int sum(int a, int b); // 메서드
	
	Class01(){
		
	}//생성자, 생성자도 메서드
	
	Class01(int a, int b){
		
	}//생성자 오버로딩
	
	class Test{		
		
	}//inner Class
	
	
	public static void main(String[] args) {
		
		TV tv1; 	//인스턴스를 참조하기 위한 변수 선언, stack영역
		tv1 = new TV();//인스턴스 생성, heap영역
		tv1.channel=11;//tv의 인스턴스 변수인 channel값을 11로 한다.
		tv1.Channel1Down();//tv 인스턴스 메서드 Channel1Down()호출
		System.out.println(tv1.channel);
		
		TV tv2= new TV();
		tv2.channel=12;
		tv2.Channel1Down();
		System.out.println(tv2.channel);//tv1과 다른 인스턴스
		
		tv2=tv1;
		tv1.channel=7;
		System.out.println("tv1의 채널 : "+tv1.channel);
		System.out.println("tv2의 채널 : "+tv2.channel);

//		TV[] tvArr = new TV[3];//객체의 주소들이 저장, 초기화되어 null로 생성됨
//		
//		tvArr[0] = new TV();
//		tvArr[1] = new TV();
//		tvArr[2] = new TV();//객체를 생성하여 배열의 각요소에 저장
				
//		TV[] tvArr = {new TV(), new TV(), new TV(),};
		
//		TV[] tvArr = new TV[100];
//		for (int i = 0; i < tvArr.length; i++) {
//			tvArr[i] = new TV();
//		}
		
		TV[] tvArr = new TV[3];
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i]=new TV();
			tvArr[i].channel = i+10;			
			System.out.printf("tvArr[%d},channel=%d\n",i,tvArr[i].channel);
		}
				
		System.out.println();
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].Channel1Up();//tv[i]메서드를 호출
			System.out.printf("tvArr[%d},channel=%d\n",i,tvArr[i].channel);
		}
		
		
		
		
		
		
		
		
		
	}//end of main
}

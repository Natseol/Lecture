package c230905;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		
		//컬렉션
		//동일한 데이터 타입을 묶어 관리하는 자료구조
		//데이터 저장 공간의 크기가 동적으로 변한다.
		
		//1.List
		//배열이랑 비슷
		//자바에서 인터페이스로 구현되어있음
		//ArrayList, Vector, LinkedList등과 같은 클래스가 List인터페이스를 구현한다.
		
		//1) ArrayList
		//List인터페이스를 구현한 클래스 중 하나
		//동적배열로 구현되어 크기를 동적으로 조절가능
		//요소에 빠르게 접근가능, 추가하거나 제거할 떄 자동으로 크기를 조절
		
		//List는 인터페이스로써 리스트 동작을 정의
		
		//* ArrayList랑 Array의 차이 *
		//Array: 요소가 잘 변하지 않을 경우
		//ArrayList
		
		String[] arrStrings = new String[] {"가","나","다","라","마"};
		
		arrStrings[1]=null;
		arrStrings[2]=null;
		
		for(int i=0; i<arrStrings.length;i++) {
			System.out.println(arrStrings[i]);
		}
		System.out.println();
		
		List<String> arrList = new ArrayList<>();
		
		System.out.println(arrList.size());
		
		arrList.add("가");
		arrList.add("나");
		arrList.add("다");
		arrList.add("라");
		arrList.add("마");
		arrList.add("바");
		arrList.add("사");		
				
		System.out.println("추가후:"+arrList.size());
		
		for (String i:arrList) {
			System.out.println(i);
		}
		arrList.remove("바");
		arrList.remove("다");
		
		System.out.println("==========");
		System.out.println("삭제후:"+arrList.size());
		for (String i:arrList) {
			System.out.println(i);
		}
		
		System.out.println();
		arrList.add("경일");
		for (String i:arrList) {
			System.out.println(i);
		}

		int index = 2;
		String element = arrList.get(index);
		System.out.println("인덱스:"+index+" 요소:"+element);
		
		String target = "경일";
		boolean contains = arrList.contains(target);
		
		if (contains) {
			System.out.println(target+"있음");
		}
		else {
			System.out.println("없음");
		}
		
		//add : 요소추가, 기본적으로 맨 뒤이지만 인덱스를 지정하면 해당 인덱스로 추가
		//remove : 삭제, 인덱스를 넣고 삭제도 가능
		//clear : 모든 데이터 삭제
		
		//get : 인덱스의 데이터를 리턴
		//indexof : 첫번쨰 위치 리턴
		//lastIndexof : 마지막 위치 리턴
		//contains : 요소가 있는지 없는지 boolean으로 리턴
		
		//size : 길이
		//isEmpty : 비어있는지 확인
		//trimToSize :
		
		//sort : 정렬
		//reverse : 반전
		
		List<String>myList = new ArrayList<>();
		//권장, List인터페이스를 상속받는 다른 클래스로 변경이 가능(유연)
		//ArrayList<String>myList1=new ArrayList<>();
		
		
		
		
		
		
		
	}
}

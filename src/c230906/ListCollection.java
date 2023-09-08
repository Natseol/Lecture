package c230906;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//LinkedList
//노드와 포인트로 구성되어있고 포인터는 서로를 가리키고 있다
//하나의 노드에는 다음 노드를 가리키는 포인터가 있다
//데이터를 중간에 삽입,삭제할 때 용이하다
//인덱스가 없어서 순차적으로 탐색해야 한다(서칭이 느림)
//single, double와 있다
//
//1. single
//[node, pointer]=>[node, pointer]=>[node, pointer]
//2. double(자바에서는 내부적으로 double로 되어있음)
//[pointer,node, pointer]<=>[pointer,node, pointer]<>=[pointer,node, pointer]


public class ListCollection {

	public static void main(String[] args) {
		
		List<String> linkedList=new LinkedList<>();
		
		linkedList.add("사과");
		linkedList.add("애플");
		linkedList.add("apple");
		
		System.out.println("링크드리스트 순회");
		
		for (String fruit : linkedList) {
			System.out.println(fruit);
		}
		linkedList.add(1,"체리");
		linkedList.remove("apple");
		
		System.out.println();
		String elem=linkedList.get(1);
		System.out.println("1번"+elem);

		System.out.println("크기"+linkedList.size());
		
		boolean isApple=linkedList.contains("사과");
		System.out.println(isApple);
		System.out.println();
		Object[] array=linkedList.toArray();
		for (Object object : array) {
			System.out.println(object.toString());
		}
		System.out.println();
		linkedList.clear();
		System.out.println("비어있음?"+linkedList.isEmpty());

		
		
		
		
	}
}

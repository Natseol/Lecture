package c230905;

import java.util.ArrayList;
import java.util.List;

public class Stk<T> {

	List<T> arrList = new ArrayList<>();
	
	public void push(T t) {
		arrList.add(t);
	}
	
	public T pop() {
		if (!arrList.isEmpty()) {
			T t = arrList.get(arrList.size()-1);
			arrList.remove(arrList.size()-1);
			return t;
		}
		return null;
	}
	
	public T peek() {
		if (!arrList.isEmpty()) {
			return arrList.get(arrList.size()-1);
		}
		return null;
	}
	
	public void clear() {
		arrList.clear();
	}
	
	public T abc(T t) {
		return t;
	}
	
	
	public static void main(String[] args) {
		
		Stk<Integer> stk = new Stk<>();
		
		stk.push(1);
		stk.push(2);
		stk.push(3);
		
		for (int i : stk.arrList) {
			System.out.println(i);
		}
		
		System.out.println();		
		System.out.println(stk.peek());		
		System.out.println(stk.pop());		
		System.out.println(stk.peek());
		
		stk.pop();
		stk.pop();
		stk.pop();
		
		System.out.println();
		System.out.println(stk.peek());
		
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.clear();
		
		System.out.println();
		System.out.println("클리어 후: ");
		for (int i : stk.arrList) {
			System.out.println(i);
		}
		System.out.println();
			
		
	}
}

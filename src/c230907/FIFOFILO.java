package c230907;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FIFOFILO {
	//First In First Out : Queue
	//First In Last Out : Stack
	
	public static void main(String[] args) {
	Queue<Integer> q = new LinkedList<>();
	
	q.offer(1);
	q.offer(3);
	q.offer(5);
	q.offer(7);
	q.offer(9);
	
	System.out.println(q.isEmpty());
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q);
	
	Stack<Integer> s = new Stack<>();
	
	s.push(1);
	s.push(3);
	s.push(5);
	s.push(7);
	s.push(9);
	
	System.out.println(s.isEmpty());
	System.out.println(s);
	System.out.println(s.pop());
	System.out.println(s);
		
	}
}

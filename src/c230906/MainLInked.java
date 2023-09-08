package c230906;

import java.util.LinkedList;

class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data=data;
		this.next=null;
	}

	public void setNext(Node<T> t) {
		next = t;
	}

	public Node<T> getNext() {
		return next;
	}

	public T getData() {
		return data;
	}
}

class SingleLinkedList<T> {
	LinkedList<Node <T>> linkedList = new LinkedList<>();

	public void add(int num, T t) {
		Node<T> node = new Node<>(t);
		linkedList.add(num,node);
		int index = linkedList.indexOf(node);
		if (index>0) {
			linkedList.get(index-1).setNext(node);
		}
		if (index!=linkedList.size()-1) {
			linkedList.get(index).setNext(linkedList.get(index+1));
		}
	}

	public T get(int index) {
		return linkedList.get(index).data;
	}


	public int size() {
		return linkedList.size();
	}

	public void remove(T t) {
		int index = 0;
		for (int i = 0; i < linkedList.size(); i++) {
			if (t.equals(linkedList.get(i).getData())) {
				index = i;
			}
		}
		if (t.equals(linkedList.get(index).getData())) {
			if(index!=0){
				linkedList.get(index-1).setNext(null);
				if(linkedList.get(index).getNext()!=null){
					linkedList.get(index-1).setNext(linkedList.get(index+1));
				}				
			}
			linkedList.remove(index);
		}
	}

	public Node<T> getNext(int index) {
		return linkedList.get(index).getNext();
	}
	
	public void printData() {
		for (int i = 0 ; i < linkedList.size(); i++) {
			System.out.println("Data: "+linkedList.get(i).getData());
		}
		System.out.println();
	}
	
	public void printNextData() {
		for (int i = 0 ; i < linkedList.size()-1; i++) {
			System.out.println(linkedList.get(i).getData()+" Next: "+linkedList.get(i).getNext().getData());
		}
		System.out.println();
	}
	
}

public class MainLInked {

	public static void main(String[] args) {

		SingleLinkedList<String> sll = new SingleLinkedList<>();
		
		sll.add(0,"가");
		sll.add(1,"나");
		sll.add(2,"다");
		sll.add(3,"라");
		sll.printData();
		sll.printNextData();

		sll.remove("나");
		System.out.println();
		sll.printData();
		sll.printNextData();
		
		sll.add(1, "나");
		System.out.println();
		sll.printData();
		sll.printNextData();
		
	}

}

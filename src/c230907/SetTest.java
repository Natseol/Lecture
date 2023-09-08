package c230907;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		//중복체크
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(1);
		set.add(3);
		set.add(1);
		set.add(1);
		set.add(5);
		set.remove(5);
		set.add(6);
		System.out.println(set.size());
		
		//주소
		Iterator<Integer> iterator = set.iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		set.clear();
		System.out.println(set.size());
		
	}
}

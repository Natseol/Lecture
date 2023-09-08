package c230907;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.NavigableSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(6);
		treeSet.add(6);
		treeSet.add(9);
		treeSet.add(2);
		treeSet.add(5);
		System.out.println(treeSet.size());
		System.out.println();
		
		for(Integer i : treeSet) {//오름차순으로 저장됨
			System.out.println(i);
		}
		
		System.out.println("처음은 "+treeSet.first());
		System.out.println("마지막은 "+treeSet.last());
		System.out.println("6 미만은 "+treeSet.lower(6));
		System.out.println("6 초과는 "+treeSet.higher(6));
		System.out.println("6 이하는 "+treeSet.floor(6));
		System.out.println("6 이상은 "+treeSet.ceiling(6));
		
		System.out.println();
		NavigableSet<Integer> descendingTreeSet = treeSet.descendingSet();//내림차순
		for (Integer i : descendingTreeSet) {
			System.out.println(i);
		}
		System.out.println();
		NavigableSet<Integer> rangeTreeSet = treeSet.tailSet(6, true);//true는 같은값까지 가져감
		for (Integer i : rangeTreeSet) {
			System.out.println(i);
		}
		
		System.out.println();
		NavigableSet<Integer> rangeTreeSet2 = treeSet.headSet(2, true);//true는 같은값까지 가져감
		for (Integer i : rangeTreeSet2) {
			System.out.println(i);
		}
		
		System.out.println();
		NavigableSet<Integer> rangeTreeSet3 = treeSet.subSet(2, true, 6, false);//true는 같은값까지 가져감
		for (Integer i : rangeTreeSet3) {
			System.out.println(i);
		}
				
	}

}

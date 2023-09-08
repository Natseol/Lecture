package c230907;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		//Key(이름)을 넣고, Key가 중복인지 체크
		Map<String, Integer> map = new HashMap<>();
		
		map.put("일", 1);
		map.put("이", 2);
		map.put("삼", 3);
		map.put("사", 1);
		map.put("오", 5);
		System.out.println(map.size());
		
		System.out.println(map.get("이"));
		map.put("이", 22);
		System.out.println(map.get("이"));
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
	}
}

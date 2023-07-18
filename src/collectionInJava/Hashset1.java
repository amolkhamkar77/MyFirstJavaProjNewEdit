package collectionInJava;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("Amol");
		h.add(100);
		h.add('D');
		h.add(100);
		h.add(null);
		h.add(null);
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h.contains("Amol"));
		h.clear();
		System.out.println(h);
	}

}


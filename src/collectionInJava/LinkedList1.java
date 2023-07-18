package collectionInJava;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
	
		ll.add(500);
		ll.add("abcd");
		ll.add('W');
		ll.add(1030);
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		
		System.out.println(ll.size());
		System.out.println(ll.get(2));
		System.out.println(ll.contains("abcd"));
		ll.set(1, "XYZ");
		System.out.println(ll);
		ll.remove(4);
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		ll.clear();
		System.out.println(ll);
	}

}

package collectionInJava;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Iterator {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add("Amol");
		v.add("Rahul");
		v.add("Jitu");
		v.add("Sama");
		v.add("Kiran");
		v.add("Vinod");
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.set(2, "Sunil"));
		System.out.println(v);
		System.out.println(v.isEmpty());
		System.out.println(v.contains("Sama"));
		
		System.out.println("Print Vector using Iterator Cursor----------");
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Print Vector using ListIterator Cursor----------");
		ListIterator ite =v.listIterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		System.out.println("Print Vector using For loop----------");
		
		for(int i=0; i<=v.size()-1; i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("Print Vector using For each loop----------");
		
		for(Object S1:v)
		{
			System.out.println(S1);
		}
	}

}

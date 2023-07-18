package collectionInJava;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Iterator {

	public static void main(String[] args) {
		
		TreeSet Tset = new TreeSet();
	//TreeSet<Integer> Tset = new TreeSet<Integer>();	//it used when all values in Integer format
		Tset.add("ABC");
		Tset.add("ABC");  // not allow dupliccate element
		Tset.add("BCD");
		Tset.add("CDE");
		Tset.add("DEF");
		Tset.add("EFG");
		Tset.add("FGH");
		Tset.add("AAA");
		System.out.println("--Print info in TreeSet Using Iterator Cursor--");
		Iterator itr = Tset.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		System.out.println("--Print info in TreeSet Using foreach Cursor--");
		for(Object s1:Tset)
		{
		System.out.println(s1);
		}
	}
	
}

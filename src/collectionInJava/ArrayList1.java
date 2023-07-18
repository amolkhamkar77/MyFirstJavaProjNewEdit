package collectionInJava;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		//ArrayList<String> al = new ArrayList<String>(); // used when all values in string formate
	al.add(100);    //index 0
	al.add("abc");  //index 1
	al.add('D');    //index 2
	al.add(100);    //index 3
	al.add(null);
	al.add(null);
	System.out.println(al); // it will print all added values
	
	System.out.println(al.size()); //To get the size of Arraylist
	
	System.out.println(al.get(3)); // it will print index 3 value
	
	al.set(1, "XYZ"); // set a value or replace a value at particular index
	System.out.println(al);
	
	al.remove(4); // it will remove the particular index value
	System.out.println(al);
	
	System.out.println(al.contains("XYZ"));
	
	System.out.println(al.isEmpty());
	
	al.clear();
	System.out.println(al);
	
	
	
	}

}

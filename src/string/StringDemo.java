package string;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1 ="AMol khamkar";
		String s2 ="amol khamkar";
		String s3 ="Quality Analyst ";
		String s4 ="amol khamkar melody";
		String s5 = ""; // dont include space, if u include space it will count it
		
		char c = s1.charAt(1);
		System.out.println(c);
		
		System.out.println(s1.charAt(3));
		
		System.out.println(s1.endsWith("kar"));
		System.out.println(s1.startsWith("AMo"));
		System.out.println(s1.startsWith("amo")); // Lower case letters are not matched with upper case letters
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s2)); // it will ignore the upper case and lower case just match the words
		
		System.out.println(s1.length()); // length of the sentence with spaces include
		System.out.println(s3.length());
		
		System.out.println(s1.isEmpty());
		System.out.println(s5.isEmpty());
		System.out.println(s5.isBlank()); // it will not count space. just check code is blank or not
		
		System.out.println(s1.toLowerCase()); // convert upper case to Lower case
		System.out.println(s4.toUpperCase()); // convert Lower to Upper case
		
		System.out.println(s4.indexOf("m")); //index position of first m
		System.out.println(s4.lastIndexOf("m")); // index position of last m
		System.out.println(s4.lastIndexOf(s5)); // it will print last index of the whole string statement
		
		System.out.println(s3.concat(s4)); // it will join two sentences
		
		System.out.println(s3.substring(10)); // it will print all letters after index position 10
		System.out.println(s3.substring(5, 10));// letters between 5 and 10 index. .. exclude them
		
		System.out.println(s1.replace("AMol", "DADA")); // it will replace the words
		
		
	}

}

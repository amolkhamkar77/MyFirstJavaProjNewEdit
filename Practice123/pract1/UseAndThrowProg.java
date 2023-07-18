package pract1;



public class UseAndThrowProg {
 public static void main(String[] args) {
	String name ="eyy56yye";
	String rev="";
	for(int i=name.length()-1; i>=0;  i--)
	{
		//if(rev==name.charAt(i))
		
			rev=rev+name.charAt(i);
		
	}
	System.out.println(rev);
	
	if(name.equals(rev))
	{
		System.out.println("string is palimdrom");
	}
	else
	{
		System.out.println("string is not palimdrom");
	}
	
}
}
package logicalPrograms;

public class Reverse_Number_ByConvert {

	public static void main(String[] args) {
		int OrgNum = 1234;
		String org = Integer.toString(OrgNum);
		String rev=""; // No space given inside inverted commas
		for(int i=org.length()-1; i>=0; i--)
		{
		rev = rev+org.charAt(i);
		}
		int revNum = Integer.parseInt(rev);
		System.out.println(revNum);
		}
}

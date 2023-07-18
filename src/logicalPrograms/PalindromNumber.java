package logicalPrograms;

public class PalindromNumber {

	public static void main(String[] args) {
		int num=121;  
		int temp;      // Number from left side and from right side are equal that number is known as palindrom number
		int rev=0;
		int pal =num;  //pal= palindrom 
		while(num>0)
		{
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		if(rev==pal)
		{
			System.out.println(pal+" Is a Palindrom Number");
		}
		else
		{
			System.out.println(pal+" Is not a Palindrom Number");
		}
	}

}

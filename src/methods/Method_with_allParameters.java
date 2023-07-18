package methods;

public class Method_with_allParameters {

	public static void main(String[] args) {
		studentInfo("swati",200,'A',65.5f);
		System.out.println("-----------");
		studentInfo("amol",250,'B',68.5f);
		}
		public static void studentInfo(String sname,int sRollNum,char sgrade, float sper)
		{
		System.out.println(sname);
		System.out.println(sRollNum);
		System.out.println(sgrade);
		System.out.println(sper);
		}
		
}

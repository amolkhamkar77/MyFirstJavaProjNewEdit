package logicalPrograms;

	public class ArmStrongNo1 {
		public static void main(String[] args) {
			//Armstrong number is a number that is equal to the sum of cubes of its
			//digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers
			int num =371; // 1,2,3,4,5,6,7,8,9,153,370,371,407,1634,8208,9474,54748...etc are armstrong num
			int temp;
			int rev=0;
			int arms=num;
			
			while (num>0) {
				temp = num%10;   //371%10=reminder 1,7, 3
				num= num/10; // 371/10=37,3
				rev= rev + temp*temp*temp; // for four digit number use temp*temp*temp*temp
			//rev= 0+1=1, 1+343=344, 344+27=371
			}
			if(rev==arms) {
				System.out.println("Its an Armstrong No");
			}
			else {
				System.out.println(" Its Not Armstrong No");
			}
		}
	}

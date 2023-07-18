package logicalPrograms;


	public class PalindromString {
		// Palindrome : a word, phrase, or sequence that reads the same backwards as
		//forwards, e.g. madam or nurses run, eve, eye, ana, anna
		public static void main(String[] args) {
			
			String a="madam"; // given word is mirror image
			String rev="";
			
			for(int i=a.length()-1; i>=0; i--) {
				rev = rev + a.charAt(i);	
			}
			System.out.println(rev);
			
			if(a.equalsIgnoreCase(rev)) {
			
				System.out.println("Given String is pallindrom");
			}
			else 
			{
				System.out.println("given string is not pallindrom");
			}
		}
	}


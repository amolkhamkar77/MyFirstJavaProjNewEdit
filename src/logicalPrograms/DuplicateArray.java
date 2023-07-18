package logicalPrograms;

	public class DuplicateArray {
		public static void main(String[] args) {
			
			int ar [] = new int [] {1, 2, 2, 2, 4, 7, 8, 8, 3};   // it will used for two times repeated number
		      
		    //Searches for duplicate element  
		    System.out.println("Duplicate elements in given array: ");
		    for(int i = 0; i<ar.length; i++) {  
		    	
		        for(int j = i + 1; j < ar.length; j++) { 
		        	
		            if(ar[i] == ar[j])  
		            	
		            System.out.print(ar[j]+", ");   
		        }  
		    }
		}
		}

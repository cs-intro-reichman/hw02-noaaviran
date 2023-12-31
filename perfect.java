public class perfect {
	public static void main(String args []) {
		 int n = Integer.parseInt (args[0]); 
		 int sum= 0;
         String perfect = n + " is a perfect number since " + n + " = 1";
		 
		 
		 for (int i = 2; i < n ; i++)  { 
			if (n % i== 0) {
			sum = sum + i;
			perfect = perfect + " + "+ i;
			}	
		  } 
		  
		  if (sum + 1 == n) {
			  System.out.println (perfect); 
		  } else { 
		      System.out.println (n + "is not a perfect number"); 
		  }
		 
		 }   
		 
	}


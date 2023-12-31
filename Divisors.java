public class Divisors {
	public static void main(String args []) {
		 int x = Integer.parseInt (args[0]);
		 int i = 1;  
		 
		 while (i <= x)  { 
		 if (x % i== 0) {
			 System.out.println (i); 
		  }
		  i= i+1;
		 }   
		
	}
}
		
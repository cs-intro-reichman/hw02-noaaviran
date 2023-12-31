public class DamkaBoard {
	public static void main(String args []) {
		 int n = Integer.parseInt (args[0]); 
         String dot = "* ";
		 String dot2= " *";
		 
		 for (int i = 1; i <= n ; i++)  {
			for (int j = 1; j<= n; j++) {
				if (i % 2 ==1) {
				System.out.print(dot); 
				} else { 
				System.out.print(dot2);
				}
			}	
			System.out.println();
		  } 
		 
		 }   
		 
	}


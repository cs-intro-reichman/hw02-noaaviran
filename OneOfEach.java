public class OneOfEach {
	public static void main(String args []) {
		 int chance;
		
		boolean girl= true;
		boolean boy= true;
		int sum=0;
		
		 while (girl || boy) {
			chance =(int)( Math.random()* 2);
			  if (chance == 1) {
			  System.out.print("g ");
			  girl= false;
			  sum++;
			  }
			  else { 
				  System.out.print("b ");
				  boy= false;
                  sum++;				  
			  }
		 }
		 
		 System.out.println ();
		 System.out.println("you made it. . . and now you have " + sum + " children");
            		  

	
		  } 
		 
		    
		 
	}


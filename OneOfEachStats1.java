public class OneOfEachStats1 {
	public static void main(String args []) {
		int T = Integer.parseInt (args[0]);
		int kids=0;
		int total=0 ;
		int twoKids=0;
		int threeKids=0;
		int fourOrMore=0;
		int count=0;
		

		for (int i=0; i<T; i++) {
	    int chance;
		boolean girl= true;
		boolean boy= true;
		
		int numOfKids=0;
		 while (girl || boy) {
			 kids = 0 ;
			 chance =(int)( Math.random()* 2); double chance = generator.nextDouble();
			  if (chance == 1) {
			  girl= false;
			  kids++;
			  }
			  else { 
				  
				  boy= false;
                  kids++;					  
			  }
			  total ++;
			numOfKids++;
		 }
		switch(numOfKids) {
			case 2:
				twoKids++;
				break;
			case 3:
				threeKids++;
				break;
			default:
				fourOrMore++;
				break;
			}
		}
		 int check= Math.max(Math.max(twoKids, threeKids), fourOrMore);
		 double avarage = (double) total / T;
	     System.out.println("Avrage: " +avarage+ "children to get at least one of each gender.");
		 System.out.println("Number of families with 2 children: "+ twoKids);
		 System.out.println("Number of families with 3 children: " + threeKids);
		 System.out.println("Number of families with 4 children: "+ fourOrMore);
		 System.out.println("The most common number is " + check + ".");
		 
		 
		 
	}
}
		
		
		
		


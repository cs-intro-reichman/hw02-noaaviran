public class Reverse {
	public static void main(String args []) {
		 String s = (args[0]);
		 int lastletter = (s.length ()-1);
		 int middle = (s.length () / 2);
		
          while ( lastletter >= 0) {			  
		 System.out.print( s.charAt(lastletter));
		  lastletter = lastletter - 1; }
		 System.out.println(" " );
		 System.out.println("the middle letter is " + s.charAt( middle-1));


		  }
	
	}

		
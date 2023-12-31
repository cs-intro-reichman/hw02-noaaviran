public class Reverse {
	public static void main(String args []) {
		 String s = (args[0]);
		 int lastletter = (s.length ()-1);
		 int length= s.length(); 
		 int middle;
		 
		 if ( length % 2 == 0) {
			  middle = (s.length () / 2 -1);
		 } else {
			  middle = (s.length () / 2 );
		 }
		 
          while ( lastletter >= 0) {			  
		 System.out.print( s.charAt(lastletter));
		  lastletter = lastletter - 1; }
		 System.out.println();
		 System.out.println("The middle character is " + s.charAt( middle));


		  }
	
	}

		
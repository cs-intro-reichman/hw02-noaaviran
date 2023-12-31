public class InOrder {
	public static void main(String args []) {
		
		boolean stop = true; 
		int ran = 0;
		int lastnum = 0;
	
		
	  while (stop) {

         ran =(int)( Math.random()* 10);
	     
		 if(ran >= lastnum){
			 System.out.print( ran + " ");
			 lastnum = ran;
		 }
		 else{
			 stop = false;
		 }
		 
	  }
			
	
	}

}	
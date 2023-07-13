class WashMachineTester{

       public static void main(String test[]){
	  
	  System.out.println("main started");
	  
	  boolean connected=WashMachine.onOrOff();
	   System.out.println("The WashMachine is on"+connected);
	   WashMachine.increaseSpeed();
	    WashMachine.increaseSpeed();
	   WashMachine.decreaseSpeed();
	    WashMachine.decreaseSpeed();
	  boolean connected1=WashMachine.onOrOff();
	  System.out.println("The WashMachine is on"+connected1);
	  
	
	 
 
	  
	  System.out.println("main ended");
	  
	  
	  }





}
class MixerTester{

      public static void main(String test[]){
	  
	  System.out.println("main started");
	  
	  boolean slow=Mixer.slowOrFast();
	   System.out.println("The mixer is slow"+slow);
	   
	   Mixer.increaseSpeed();
	    Mixer.increaseSpeed();
		 Mixer.decreaseSpeed();
		  Mixer.decreaseSpeed();
	  boolean slow1=Mixer.slowOrFast();
	  System.out.println("The mixer is slow"+slow1);
      	  
	  System.out.println("main ended");
	  
	  
	  }


}
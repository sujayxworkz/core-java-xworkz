class Mixer{

  static String name="usha";
  
  static int currentSpeed;
  static int minSpeed;
  static int maxSpeed=4;
  static boolean isSlow;
  
public static boolean slowOrFast(){

    if(isSlow==true){
	isSlow=false;
	System.out.println("The mixer is speed...good");
	
	}

    else if(isSlow==false){
	isSlow=true;
	System.out.println("The mixer is slow...bad");
	}

 return isSlow;
}
     
	 
	 public static void increaseSpeed(){
		 
		 if(currentSpeed<maxSpeed){
			 currentSpeed=currentSpeed+1;
			 System.out.println("The current speed is"+ currentSpeed);
			  
		 }
		 else{
			 System.out.println("maximum speed is reached");
			 
		 }
		 
	 }
	 
	 
	  public static void decreaseSpeed(){
		  
		  		 if(currentSpeed>minSpeed){
			 currentSpeed=currentSpeed-1;
			 System.out.println("The current speed is"+ currentSpeed);  
	  }
	    else{
			
				 System.out.println("minimum speed is reached");
		}
	 
}

}


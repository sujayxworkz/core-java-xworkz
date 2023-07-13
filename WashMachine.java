class WashMachine{


       static String name="onida";
	   static int currentSpeed=10;
	     static int minSpeed;
		   static int maxSpeed=20;
		   static boolean isConnected;

        public static boolean onOrOff(){
		
	if(isConnected==false){
	isConnected=true;
	System.out.println("The washmachine is on....ha ha");
	

	}	
	else if(isConnected==true){
	isConnected=false;
	System.out.println("The washmachine is off....ooh");
	
	}	
		return isConnected;
		
		
		}
		
		// increase speed

		public static void increaseSpeed(){
		 System.out.println("invoking increaseSpeed");
      System.out.println("parameter"+1);
		if (isConnected==true){
		if(currentSpeed<maxSpeed){
		currentSpeed=currentSpeed+1;
		System.out.println("current speed is"+ currentSpeed);
		}
else{
	System.out.println("maxSpeed reached");
 }
}
else{
	System.out.println("gube first machine connect mado le");
 }
 	  System.out.println("end of increaseSpeed");
}
   // decrease volume
   
   	public static void decreaseSpeed(){
		 System.out.println("invoking decreaseSpeed");
      System.out.println("parameter"+2);
		if (isConnected==true){
		if(currentSpeed>minSpeed){
		currentSpeed=currentSpeed-1;
		 System.out.println("current Speed is"+ currentSpeed);
		}
else{
	System.out.println("minSpeed reached");
 }
}
else{
	System.out.println("machine is turned off");
}	
System.out.println("end of decreaseSpeed");
}

}

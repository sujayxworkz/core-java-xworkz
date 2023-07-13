class Speaker{

    static String name="boult";
	
	static int minVolume;
	static int currentVolume;
	static int maxVolume=10;
	static boolean isConnected;
	
//method
public static void main(String test[]){
System.out.println("main started");
Speaker.onOrOff();
Speaker.onOrOff();
Speaker.onOrOff();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
System.out.println("main ended");

}

	
   public static boolean onOrOff(){
   System.out.println("invoking onOrOff");
      System.out.println("parameter"+0);
   if(isConnected==false){
	   isConnected=true;
System.out.println("The speaker is on...Enjoy");	   
   }
   
   else if(isConnected==true){
	   isConnected=false;
	   System.out.println("The speaker is off...Thankyou");
   }
   return isConnected;
   
}

    // increase volume
	public static void increaseVolume(){
		  System.out.println("invoking increaseVolume");
      System.out.println("parameter"+1);
		if (isConnected==true){
		if(currentVolume<maxVolume){
		currentVolume=currentVolume+1;
		System.out.println("current volume is"+ currentVolume);
		}
else{
	System.out.println("maxVolume reached");
 }
}
else{
	System.out.println("gube first speaker connect mado le");
 }
 	  System.out.println("end of increaseVolume");
}
   // decrease volume
   
   	public static void decreaseVolume(){
		  System.out.println("invoking decreaseVolume");
      System.out.println("parameter"+2);
		if (isConnected==true){
		if(currentVolume>minVolume){
		currentVolume=currentVolume-1;
		 System.out.println("current Volume is"+ currentVolume);
		}
else{
	System.out.println("minVolume reached");
 }
}
else{
	System.out.println("speaker is turned off");
}	
System.out.println("end of decreaseVolume");
}
}
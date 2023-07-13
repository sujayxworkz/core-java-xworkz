
class Oven{


	static String name="ifb";
	static int minTemperature;
	static int currentTemperature=20;
	static int maxTemperature=220;
	static boolean isTurnedOn;
	
	public static boolean onOrOff(){
	
		System.out.println("Invoking onorOff()");
		System.out.println("parameter =" + 0);
			if(isTurnedOn==false){
				isTurnedOn=true;
				System.out.println(" Oven turned on ..");
			}else if(isTurnedOn==true){
				isTurnedOn=false;
				System.out.println("Oven turned off..");
			}
			
			return isTurnedOn;
	}
	
	public static void increaseTemperature(){
	
		
		if (isTurnedOn==true){
			
			if(currentTemperature<maxTemperature){
				currentTemperature=currentTemperature+1;
				System.out.println("the current Temperature is"+ currentTemperature);
			
			
			}else{
			
				System.out.println("max Temperature reached");
		}
		
		}else{
			
			System.out.println("Oven is off");
		
		
		}
	}
	public static void decreaseTemperature(){
		if(isTurnedOn==true){
			
			if(currentTemperature>minTemperature){
				currentTemperature=currentTemperature-1;
				System.out.println("the current Temperature is " + currentTemperature);
			}else{
				System.out.println("min Temperature reached");
			}
		}else {
			System.out.println("Oven is off");
		}
	}

}
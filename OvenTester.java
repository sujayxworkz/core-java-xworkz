class OvenTester{
public static void main(String args[]){
boolean TurnedOn=Oven.onOrOff();
System.out.println("is Oven on"+TurnedOn);
boolean TurnedOn1=Oven.onOrOff();
System.out.println("is Oven on"+TurnedOn1);
Oven.increaseTemperature();
Oven.increaseTemperature();
Oven.increaseTemperature();
Oven.increaseTemperature();
Oven.increaseTemperature();
boolean TurnedOn2=Oven.onOrOff();
System.out.println("is Oven on"+TurnedOn2);
Oven.decreaseTemperature();
Oven.decreaseTemperature();
Oven.decreaseTemperature();
Oven.decreaseTemperature();
Oven.decreaseTemperature();
Oven.decreaseTemperature();
Oven.decreaseTemperature();
Oven.decreaseTemperature();
Oven.decreaseTemperature();
Oven.decreaseTemperature();
   }
 }
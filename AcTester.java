class AcTester{
public static void main(String args[]){
boolean connected=Ac.onOrOff();
System.out.println("is Ac on"+connected);
boolean connected1=Ac.onOrOff();
System.out.println("is Ac on"+connected1);
Ac.increaseTemperature();
Ac.increaseTemperature();
Ac.increaseTemperature();
Ac.increaseTemperature();
Ac.increaseTemperature();
boolean connected2=Ac.onOrOff();
System.out.println("is Ac on"+connected2);
Ac.decreaseTemperature();
Ac.decreaseTemperature();
Ac.decreaseTemperature();
Ac.decreaseTemperature();
Ac.decreaseTemperature();
Ac.decreaseTemperature();
Ac.decreaseTemperature();
Ac.decreaseTemperature();
Ac.decreaseTemperature();
Ac.decreaseTemperature();
   }
 }
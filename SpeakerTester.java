class SpeakerTester{


public static void main(String test[]){
System.out.println("main started");

boolean connected=Speaker.onOrOff();
System.out.println("is speaker on"+connected);
boolean connected1=Speaker.onOrOff();
System.out.println("is speaker on"+connected1);

System.out.println("main ended");

}

}
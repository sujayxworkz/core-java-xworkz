class RocketTester {
    public static void main(String[] args) {
        Rocket rocket1 = new Rocket();
        rocket1.manufacturer = "SpaceX";
        rocket1.color = "White";
        rocket1.price = 60000000.0;
        rocket1.payloadCapacity = 22000;
        rocket1.launch();
    
		
		System.out.println("Manufacturer: " + rocket1.manufacturer);
        System.out.println("Color: " + rocket1.color);
        System.out.println("Price: " + rocket1.price);
        System.out.println("Payload Capacity: " + rocket1.payloadCapacity + " kg");

        Rocket rocket2 = new Rocket();
        rocket2.manufacturer = "Blue Origin";
        rocket2.color = "Blue";
        rocket2.price = 50000000.0;
        rocket2.payloadCapacity = 15000;
        rocket2.launch();
		
        System.out.println("Manufacturer: " + rocket2.manufacturer);
        System.out.println("Color: " + rocket2.color);
        System.out.println("Price: " + rocket2.price);
        System.out.println("Payload Capacity: " + rocket2.payloadCapacity + " kg");

        Rocket rocket3 = new Rocket();
        rocket3.manufacturer = "NASA";
        rocket3.color = "Red";
        rocket3.price = 80000000.0;
        rocket3.payloadCapacity = 30000;
        rocket3.launch();
        
		System.out.println("Manufacturer: " + rocket3.manufacturer);
        System.out.println("Color: " + rocket3.color);
        System.out.println("Price: " + rocket3.price);
        System.out.println("Payload Capacity: " + rocket3.payloadCapacity + " kg");

        Rocket rocket4 = new Rocket();
        rocket4.manufacturer = "Roscosmos";
        rocket4.color = "Silver";
        rocket4.price = 40000000.0;
        rocket4.payloadCapacity = 18000;
        rocket4.launch();
      
	  System.out.println("Manufacturer: " + rocket4.manufacturer);
        System.out.println("Color: " + rocket4.color);
        System.out.println("Price: " + rocket4.price);
        System.out.println("Payload Capacity: " + rocket4.payloadCapacity + " kg");
		
		Rocket rocket5 = new Rocket();
rocket5.manufacturer = "Blue Origin";
rocket5.color = "Yellow";
rocket5.price = 55000000.0;
rocket5.payloadCapacity = 22000;
rocket5.launch();
System.out.println("Manufacturer: " + rocket5.manufacturer);
System.out.println("Color: " + rocket5.color);
System.out.println("Price: " + rocket5.price);
System.out.println("Payload Capacity: " + rocket5.payloadCapacity + " kg");

Rocket rocket6 = new Rocket();
rocket6.manufacturer = "CNSA";
rocket6.color = "Green";
rocket6.price = 42000000.0;
rocket6.payloadCapacity = 19000;
rocket6.launch();
System.out.println("Manufacturer: " + rocket6.manufacturer);
System.out.println("Color: " + rocket6.color);
System.out.println("Price: " + rocket6.price);
System.out.println("Payload Capacity: " + rocket6.payloadCapacity + " kg");

Rocket rocket7 = new Rocket();
rocket7.manufacturer = "Boeing";
rocket7.color = "Silver";
rocket7.price = 48000000.0;
rocket7.payloadCapacity = 21000;
rocket7.launch();
System.out.println("Manufacturer: " + rocket7.manufacturer);
System.out.println("Color: " + rocket7.color);
System.out.println("Price: " + rocket7.price);
System.out.println("Payload Capacity: " + rocket7.payloadCapacity + " kg");

Rocket rocket8 = new Rocket();
rocket8.manufacturer = "Arianespace";
rocket8.color = "Gold";
rocket8.price = 52000000.0;
rocket8.payloadCapacity = 23000;
rocket8.launch();
System.out.println("Manufacturer: " + rocket8.manufacturer);
System.out.println("Color: " + rocket8.color);
System.out.println("Price: " + rocket8.price);
System.out.println("Payload Capacity: " + rocket8.payloadCapacity + " kg");

Rocket rocket9 = new Rocket();
rocket9.manufacturer = "JAXA";
rocket9.color = "Purple";
rocket9.price = 40000000.0;
rocket9.payloadCapacity = 18000;
rocket9.launch();
System.out.println("Manufacturer: " + rocket9.manufacturer);
System.out.println("Color: " + rocket9.color);
System.out.println("Price: " + rocket9.price);
System.out.println("Payload Capacity: " + rocket9.payloadCapacity + " kg");

Rocket rocket10 = new Rocket();
rocket10.manufacturer = "Virgin Galactic";
rocket10.color = "Pink";
rocket10.price = 35000000.0;
rocket10.payloadCapacity = 17000;
rocket10.launch();
System.out.println("Manufacturer: " + rocket10.manufacturer);
System.out.println("Color: " + rocket10.color);
System.out.println("Price: " + rocket10.price);
System.out.println("Payload Capacity: " + rocket10.payloadCapacity + " kg");

		
		
    }
}
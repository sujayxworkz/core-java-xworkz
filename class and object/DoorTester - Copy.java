class DoorTester {
    public static void main(String[] args) {
        Door door1 = new Door();
        door1.material = "Wood";
        door1.color = "Brown";
        door1.height = 80.5;
        door1.width = 36.0;
      
        door1.displayDetails();
		
		
        System.out.println("Material: " + door1.material);
        System.out.println("Color: " + door1.color);
        System.out.println("Height: " + door1.height + " inches");
        System.out.println("Width: " + door1.width + " inches");

        Door door2 = new Door();
        door2.material = "Steel";
        door2.color = "White";
        door2.height = 78.0;
        door2.width = 32.5;
      
        door2.displayDetails();
		
		System.out.println("Material: " + door2.material);
        System.out.println("Color: " + door2.color);
        System.out.println("Height: " + door2.height + " inches");
        System.out.println("Width: " + door2.width + " inches");

        Door door3 = new Door();
        door3.material = "Fiberglass";
        door3.color = "Black";
        door3.height = 84.0;
        door3.width = 38.5;
        
        door3.displayDetails();
		
		System.out.println("Material: " + door3.material);
        System.out.println("Color: " + door3.color);
        System.out.println("Height: " + door3.height + " inches");
        System.out.println("Width: " + door3.width + " inches");

        Door door4 = new Door();
        door4.material = "Aluminum";
        door4.color = "Silver";
        door4.height = 82.0;
        door4.width = 34.0;
       
        door4.displayDetails();
		
		System.out.println("Material: " + door4.material);
        System.out.println("Color: " + door4.color);
        System.out.println("Height: " + door4.height + " inches");
        System.out.println("Width: " + door4.width + " inches");
    }
}

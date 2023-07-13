class Airplane {
    static String manufacturer ;
    static String model;
    static int seatingCapacity;
    static int maxSpeed;
    static boolean isCommercial ;

    public static void main(String[] args) {
		manufacturer = "Boeing";
		model = "747";
		seatingCapacity = 416;
		 maxSpeed = 614;
		 isCommercial = true;
		 
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Max Speed: " + maxSpeed + " mph");
        System.out.println("Is Commercial: " + isCommercial);
    }
}

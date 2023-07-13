class Camera {
    static String brand ;
    static String model ;
    static int megapixels ;
    static boolean hasWifi ;
    static String sensorType ;

    public static void main(String[] args) {
		
		 String brand = "Canon";
     String model = "EOS Rebel T7i";
     int megapixels = 24;
     boolean hasWifi = true;
     String sensorType = "APS-C";
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Megapixels: " + megapixels);
        System.out.println("Has Wi-Fi: " + hasWifi);
        System.out.println("Sensor Type: " + sensorType);
    }
}

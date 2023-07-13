class CoffeeMachine {
    static String brand ;
    static boolean isAutomatic ;
    static int waterTankCapacity;
    static boolean hasMilkFrother;
    static String color ;

    public static void main(String[] args) {
		 String brand = "Keurig";
     boolean isAutomatic = true;
     int waterTankCapacity = 60;
     boolean hasMilkFrother = false;
     String color = "Black";
        System.out.println("Brand: " + brand);
        System.out.println("Is Automatic: " + isAutomatic);
        System.out.println("Water Tank Capacity: " + waterTankCapacity + " ounces");
        System.out.println("Has Milk Frother: " + hasMilkFrother);
        System.out.println("Color: " + color);
    }
}

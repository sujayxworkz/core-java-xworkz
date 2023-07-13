class KFCTester {
	public static void main(String args[]){
		/*double priceOfFood=KFC.search("Chicken Strips");
		System.out.println(priceOfFood);
		 priceOfFood=KFC.search("Veg Biriyani");
		System.out.println(priceOfFood);
		 priceOfFood=KFC.search("Burger");
		System.out.println(priceOfFood);
		 priceOfFood=KFC.search("Chicken Biriyani");
		System.out.println(priceOfFood);
		 priceOfFood=KFC.search("Mutton Biriyani");
		System.out.println(priceOfFood);      */
		
		
		
		
		double priceOfFoodWithQuantity=KFC.search("Pizza",2);
		System.out.println("It is"+" "+priceOfFoodWithQuantity);
		
		 priceOfFoodWithQuantity=KFC.search("Veg Biriyani",4);
System.out.println("It is"+" "+priceOfFoodWithQuantity);

	 priceOfFoodWithQuantity=KFC.search("Burger",5);
		System.out.println("It is"+" "+priceOfFoodWithQuantity);
		
		priceOfFoodWithQuantity=KFC.search("Chicken Biriyani",6);
		System.out.println("It is"+" "+priceOfFoodWithQuantity);
		
		 priceOfFoodWithQuantity=KFC.search("Mutton Biriyani",2);
		System.out.println("It is"+" "+priceOfFoodWithQuantity);
	}
}
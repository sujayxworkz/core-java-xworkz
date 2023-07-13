class McDonaldTester {
	public static void main(String args[]){
		int priceOfFood=McDonald.search("Peri Peri Chicken");
		System.out.println(priceOfFood);
		 priceOfFood=McDonald.search("Veg Biriyani");
		System.out.println(priceOfFood);
		 priceOfFood=McDonald.search("Burger");
		System.out.println(priceOfFood);
		 priceOfFood=McDonald.search("Chicken Biriyani");
		System.out.println(priceOfFood);
		 priceOfFood=McDonald.search("Mutton Biriyani");
		System.out.println(priceOfFood);
		
		
		
		
		int priceOfFoodWithQuantity=McDonald.search("Pizza",2);
		System.out.println(priceOfFoodWithQuantity);
		 priceOfFoodWithQuantity=McDonald.search("Veg Biriyani",4);
		System.out.println(priceOfFoodWithQuantity);
		 priceOfFoodWithQuantity=McDonald.search("Burger",5);
		System.out.println(priceOfFoodWithQuantity);
		 priceOfFoodWithQuantity=McDonald.search("Chicken Biriyani",6);
		System.out.println(priceOfFoodWithQuantity);
		 priceOfFoodWithQuantity=McDonald.search("Mutton Biriyani",2);
		System.out.println(priceOfFoodWithQuantity);
	}
}
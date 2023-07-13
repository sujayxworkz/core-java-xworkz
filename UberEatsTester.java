class UberEatsTester {
	public static void main(String args[]){
		double priceOfFood=UberEats.search("Yumburger");
		System.out.println(priceOfFood);
		 priceOfFood=UberEats.search("Veg Biriyani");
		System.out.println(priceOfFood);
		 priceOfFood=UberEats.search("Burger");
		System.out.println(priceOfFood);
		 priceOfFood=UberEats.search("Chicken Biriyani");
		System.out.println(priceOfFood);
		 priceOfFood=UberEats.search("Mutton Biriyani");
		System.out.println(priceOfFood);
		
		
		
		
		double priceOfFoodWithQuantity=UberEats.search("Pizza",2);
		System.out.println(priceOfFoodWithQuantity);
		 priceOfFoodWithQuantity=UberEats.search("Veg Biriyani",4);
		System.out.println(priceOfFoodWithQuantity);
		 priceOfFoodWithQuantity=UberEats.search("Burger",5);
		System.out.println(priceOfFoodWithQuantity);
		 priceOfFoodWithQuantity=UberEats.search("Chicken Biriyani",6);
		System.out.println(priceOfFoodWithQuantity);
		 priceOfFoodWithQuantity=UberEats.search("Mutton Biriyani",2);
		System.out.println(priceOfFoodWithQuantity);
	}
}
class DominosTester {
	/* public static void main(String args[]){
		double priceOfFood=Dominos.search("Farmhouse Pizza");
		System.out.println(priceOfFood);
		 priceOfFood=Dominos.search("Veg Biriyani");
		System.out.println(priceOfFood);
		 priceOfFood=Dominos.search("Burger");
		System.out.println(priceOfFood);
		 priceOfFood=Dominos.search("Chicken Biriyani");
		System.out.println(priceOfFood);
		 priceOfFood=Dominos.search("Mutton Biriyani");
		System.out.println(priceOfFood);                   */
		
		
		
		
		double priceOfFoodWithQuantity=Dominos.search("Pizza",2);
		System.out.println(priceOfFoodWithQuantity);
		 priceOfFoodWithQuantity=Dominos.search("Veg Biriyani",4);
		System.out.println(priceOfFoodWithQuantity);
		 priceOfFoodWithQuantity=Dominos.search("Burger",5);
		System.out.println(priceOfFoodWithQuantity);
		 priceOfFoodWithQuantity=Dominos.search("Chicken Biriyani",6);
		System.out.println(priceOfFoodWithQuantity);
		 priceOfFoodWithQuantity=Dominos.search("Mutton Biriyani",2);
		System.out.println(priceOfFoodWithQuantity);
	}
}
class Swiggytester{
	
	
	public static void main(String foodDelivery[]){
		
		String foodName = "Egg omlete";
		double foodpricewithQuantity = Swiggy.search(foodName,2);
        System.out.println("the searched food price with quantity is" +foodpricewithQuantity);
	}		
	
	
	
	
}
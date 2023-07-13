class GardenTester{
      
	        public static void main(String args[]){
			
			
			Garden.addFlower("rose");
		    Garden.addFlower("lotus");
			Garden.addFlower("lilly");
			Garden.addFlower("mogra");
			Garden.addFlower("champa");


			Garden.updateFlower("mogra","sunflower");
			Garden.getflowerName();

			int newLength=Garden.deleteFlower("lotus");
			System.out.println("The new length is"+newLength);
						Garden.getAllDeletedFlowers(newLength);        

			
			String theFlower = Garden.getFlowerByName("champa");
			System.out.println(theFlower);
			
			
			
			
			}



}
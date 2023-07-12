class IceCreameTester{

                   public static void main(String args[]){
				   
				   IceCreame.addFlavour("vanilla");
				      IceCreame.addFlavour("butterscotch");
					     IceCreame.addFlavour("strawberry");
						    IceCreame.addFlavour("chocolate");
						   IceCreame.addFlavour("pineapple");
						      IceCreame.addFlavour("orange");
				   
				   
		 IceCreame.updateFlavour("chocolate","mango");
				   IceCreame.getAllFlavours();

				   int newLength=IceCreame.deleteFlavour("strawberry");
				   System.out.println("The new length is "+newLength);
				   IceCreame.getallflavoursDeleted(newLength);
				   
				   
				   
				   String flavourName = IceCreame.getIceCreameByName("orange");
				   				   System.out.println(flavourName);

				   
				   
				   
				   
				   
				   
				   }


}
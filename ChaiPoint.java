class ChaiPoint{

static String location = "koramangala";
static String chaiAvailable[]= {"masala tea","ginger tea","lemon tea",};

public static void getAllchaiAvailable(){

          // for each
   /* System.out.println("the types of chai are");
	for(String chais : chaiAvailable){
	  System.out.println(chais);
	
	}*/
	
	   // for
	for(int i=0; i<chaiAvailable.length; i++){
		String reference = chaiAvailable[i];
		 System.out.println(reference);
	}
	
System.out.println("end of types of chai available");
}


}
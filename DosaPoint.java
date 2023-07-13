class DosaPoint{

   /*  static String location = "hebbal";
	 static String dosa1 = "onion dosa";  
	  static String dosa2 = "paneer dosa";
 static String dosa3 = "ghee dosa"; 
    static String dosa4 = "cheese dosa";  
   static String dosa5 = "aloo dosa";
   static String dosa6 = "ketchUp dosa";
static String dosa7 = "plane dosa";  
static String dosa8 = "set dosa";
static String dosa9 = "masala dosa"; 
static String dosa10 = "crunchy dosa";  
  static String dosa11 = "neer dosa";
	static String foodItems[]={dosa1,dosa2,"ghee dosa",dosa4,dosa5,dosa6,"neer dosa",dosa8,dosa9,dosa10,"neer dosa"};

   public static void fetchAllfoodItems(){
   
   for(int food=0; food<foodItems.length; food++){
     String reference = foodItems[food];
	 System.out.println(reference);
   
   
   }
    System.out.println("The food items are not available at this time");
   
   
   
   }
}                             */

static int index=0;
static String foodItems[]={null,null,null,null};
 public static void fetchAllfoodItems(){
   
   for(int food=0; food<foodItems.length; food++){
     String reference = foodItems[food];
	 System.out.println(reference);
   
   
   }
    System.out.println("The food items are not available at this time");
   
 }



public static boolean addDosa(String food){
	boolean isAdded=false;
	
	
	if(food!=null){
		foodItems[index]=food;
		index++;
		isAdded=true;
		
	}
		else{
			System.out.println("cannot add Dosa as it is null value");
		}
		 return isAdded;
	}
}

//  state-citynames , telecom-simcards, garden-flowers, chats-items, metro-stations, tourism-places,medicalstore-medicinenames                         

















class Drinks{
	
		// Arrays

  static String juices[]={"maa","oraco","pine","wateri"};
  static String flavours[]={"mango","orange","pineapple","watermelon"};
  static int prices[]={10,20,25,30};

  public static void main(String machi[]){
	  System.out.println("main started");
	  x();
	  y();
	  z();
	  
	  System.out.println("main ended");
   }
	public static void x(){  
   System.out.println("The juice are");
   for(String juice : juices){
	System.out.println(juice);   
	   
   }
	}
   public static void y(){
    System.out.println("The flavours are");
	for(String flavour : flavours){
		 System.out.println(flavour);
		
	}
   }
	public static void z(){
	 System.out.println("The prices are");
	 for(int price : prices){
		 System.out.println(price); 
		 
	 }	 
		
	 }
   
 
  }
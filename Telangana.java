class Telangana{

     static int index=0;
   static String cityName[]={null,null,null,null};
   
   public static void namesOfCity(){
	   for(int i=0;i<cityName.length;i++){
		  String reference = cityName[i];
		   System.out.println(reference);
		      
	   }
	    System.out.println("names of city are not available");
	   
   }
   
    public static boolean addCity(String city){
		 boolean isAdded=false;
		if(city!=null){
		cityName[index]=city;
           index++;		
			isAdded=true;
		}
		else{
			System.out.println("pending of adding city name ");
			
		}
	
		return isAdded;
	}
   
   public static boolean updatecityName(String existingName,String newName){
	   boolean isUpdated=false;
	     for(int city=0;city<cityName.length;city++){
			 if(cityName[city]==existingName){
			 cityName[city]=newName;
			 isUpdated=true;
			 
			 
		 }
		 }
	   
	   return isUpdated;
   }
   
     public static int deleteCity(String cityDelete){
		 int citi;
		 int noOfElements=cityName.length;
		 for( citi=0;citi<cityName.length;citi++){
			 if(cityName[citi]==cityDelete){
				 break;
				 
			 }
			 
		 }
		 if(citi<noOfElements){
			 noOfElements = noOfElements-1;
			 for(int newciti=citi;newciti<noOfElements;newciti++){
				 cityName[newciti]=cityName[newciti+1];
				 
			 }
		 }
		   System.out.println(noOfElements);
		   return noOfElements;
		 
	 }
   
   
     public static void getAllDeletedCities(int newLength){
		 for(int citi=0;citi<newLength;citi++){
			 System.out.println(cityName[citi]);
		 }
		 
	 }
   
     public static String getCityByName(String thecity){
		 String cName=null;
		 for(String name : cityName){
		if(name == thecity){
			cName=name;
		}	 
			 
		 }
		return cName; 
	 }
   
   
}
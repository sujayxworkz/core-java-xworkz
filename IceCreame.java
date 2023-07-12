class IceCreame{

        static int index=0;
		static String flavours[]={null,null,null,null,null,null};
		
		public static void getAllFlavours(){
		
		  for(int i=0; i<flavours.length;i++){
		    String reference = flavours[i];
		  System.out.println(reference);
		  
		  
		  }
		       
		  System.out.println("The flavours not available");
		}

		
		public static boolean addFlavour(String flavour){
		
		   boolean isAdded=false;
		   if(null!=flavour){
		    flavours[index]=flavour;
		     index++;
		isAdded=true;
		
		
		}
		else{
					  System.out.println("The flavour not added still");

		}
		
		return isAdded;
		}	

		 public static boolean updateFlavour(String oldflavour, String newflavour){
			  boolean isUpdated=false;
			 for(int i=3;i<flavours.length;i++){
				if(flavours[i].equals(oldflavour)){
					flavours[i]=newflavour;
					isUpdated=true;
					
				} 
				 
				 
			 }
			 return isUpdated;
			 
			 
		 }
		
		public static int deleteFlavour(String deleteflavour){
			boolean isDeleted=false;
			int flv;
			int noOfElements = flavours.length;
			 for( flv=0;flv<flavours.length;flv++){
			 if(flavours[flv]==deleteflavour){
				 			 		System.out.println("flavour to be deleted");

		       break;
			 }
			 
			
			 }
			 if(flv<noOfElements){
		noOfElements=noOfElements-1;
		for(int newflv=flv;newflv<noOfElements;newflv++){
			
			flavours[newflv]= flavours[newflv+1];
			
		}
			 }
		  			 		System.out.println(noOfElements);
							return noOfElements;

		}
		
		 public static void getallflavoursDeleted(int newLength){
			 
			 for(int flv=0;flv<newLength;flv++){
				 System.out.println(flavours[flv]);
				 
			 }
			 
						 
		 }
		 // return specific item name
		 public static String getIceCreameByName(String flavourName){
			 String fName=null;
			 for(String name : flavours){
				 if(name==flavourName){
					 fName=name;
		 System.out.println("flavour is found");
 
				 } 
				 
			 }
			 
			  return fName;			

				 
		 }
		
		

}
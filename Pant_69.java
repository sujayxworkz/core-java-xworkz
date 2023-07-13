class Pant_69{
	
static int index=0;
static String Pants[]={null,null,null,null,null};

public static void getPants(){
	System.out.println("The pants are");

      for( String wear : Pants){
		System.out.println(wear);
		
	  }
	
}

   public static boolean addPant(String pant ){
	   boolean isAdded=false;
	   if(null!=pant){
		   Pants[index]=pant;
			   index++;
			   isAdded=true;
			   
		   }
		  
	   return isAdded;
	   
	   
   }

      public static boolean updatePant(String oldPant,String newPant){
		  boolean isUpdated=false;
		  for(int i=0;i<Pants.length;i++){
			  if(Pants[i]==oldPant){
				  Pants[i]=newPant;
				  isUpdated=true;
				  System.out.println("The updated pant is");
			  }
			  
		  }
		  return isUpdated;
		  
	  }

           public static int deletePant(String pantDeletion){
			   
				int pnt;
				int noOfElements=Pants.length;
				for( pnt=0;pnt<Pants.length;pnt++){
				if(Pants[pnt]==pantDeletion){
					break;
					
				}
				}
			   
			    if(pnt<noOfElements){
			 noOfElements=noOfElements-1;
			 for(int newpnt=pnt;newpnt<noOfElements;newpnt++ ){
				 
				 Pants[newpnt] = Pants[newpnt+1];
			 }
		 }
	    System.out.println(noOfElements);
		return noOfElements;
			   
		   }
	    
	    public static void getthePantDeleted(int newLength){
			for(int pnt=0;pnt<newLength;pnt++){
				System.out.println(Pants[pnt]);
			}
			
		}
		public static String getPantByName(String thePant){
			String pName=null;
			for(String name : Pants){
			if(name == thePant){
				pName=name;
			}
				
			}
			return pName;
		}

}
class Garden{

    static int index=0;
	static String flowerName[]={null,null,null,null,null,null};
	
	public static void getflowerName(){
		
		for(int i=0;i<flowerName.length;i++){
			String reference = flowerName[i];
			System.out.println(reference);
			
			
		}
		
					System.out.println("The flowers are not available");

		
	}

	      public static boolean addFlower(String flower){
			  
			  boolean isAdded=false;
			  if(null!=flower){
				flowerName[index]=flower;  
				index++;  
				 isAdded=true; 
				  
				  
			  }
			  else{
				  	System.out.println("The flower has to be addede");
				  
			  }
			  
			  
			  return isAdded;
			  
			  
		  }
	
	  public static boolean updateFlower(String presentFlower, String changedFlower){
		boolean  isUpdated=false;
		  for(int flower=2;flower<flowerName.length;flower++){
			  if(flowerName[flower]==presentFlower){
				  flowerName[flower]=changedFlower;
				  isUpdated=true;
				  
			  }
			  
			  
		  }
		  
		    return isUpdated;
		  
	  }
	
	
	    public static int deleteFlower(String deleteflower){
			 boolean isDeleted=false;
			 int flw;
			 int noOfElements=flowerName.length;
			 for( flw=0;flw<flowerName.length;flw++){
				if(flowerName[flw]==deleteflower){
					System.out.println("Flower to be deleted");
					break;
					
				} 
				  
			 }
			    if(flw<noOfElements){
				noOfElements=noOfElements-1;
				for(int newflw=flw;newflw<noOfElements;newflw++){
					flowerName[newflw]=flowerName[newflw+1];
					
					
				}
				   
					
				}
									System.out.println(noOfElements);
									return noOfElements;

			
			
		}
	        
	              
	        public static void getAllDeletedFlowers(int newLength){
				for(int flw=0;flw<newLength;flw++){
					System.out.println(flowerName[flw]);
				}
				
			}
	
	public static String getFlowerByName(String theFlower){
		String fName=null;
		for(String name : flowerName){
		if(name==theFlower){
			fName=name;
			System.out.println("flower is found");
		}	
			
		}
		
		return fName;
	}

	
	

}
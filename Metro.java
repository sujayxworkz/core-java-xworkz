class Metro{

     static int index=0;
	 static String metroStations[]={null,null,null,null,null,null,null};


      public static void viewmetroStations(){
		   for(int i=0;i<metroStations.length;i++){
			   String reference = metroStations[i];
			   System.out.println(reference);
			  	   
		   }
		   System.out.println("The metro stations are are not displayeded");
		   
		   
	   }


	   public static boolean addmetroStation(String metroStation){
		     boolean isAdded=false;
		   if(null!=metroStation){
			   metroStations[index]=metroStation;
			   isAdded=true;
			   index++;
			   
		   }
	       else{
			        System.out.println("The metro stations are received");
		   }
		   return isAdded;
	   }
	 
	        public static boolean updateStation(String existingStation,String updatedStation){
				boolean isUpdated=false;
				for(int station=4;station<metroStations.length;station++){
					if(metroStations[station].equals(existingStation)){
						metroStations[station]=updatedStation;
						isUpdated=true;
						
					}
					
									
				}
				
				
				return isUpdated;
				
				
			}
			
			public static int deleteStations(String deleteStation){
				int stn;
				int noOfElements=metroStations.length;
				
				for(stn=0;stn<metroStations.length;stn++){
				if(metroStations[stn]==deleteStation){
				break;
				}	
					
				}
				
				if(stn<metroStations.length){
					noOfElements=noOfElements-1;
				for(int newstn=stn;newstn<noOfElements;newstn++){
					metroStations[newstn] = metroStations[newstn+1]	;				
				}
				}
				System.out.println(noOfElements);
				return noOfElements;
				
			}
			
			public static void getAllDeletedStations(int newLength){
				for(int stn=0;stn<newLength;stn++){
					System.out.println(metroStations[stn]);
					
				}
				
			}
	        public static String getStationsByName(String stationName){
				String sName=null;
				for(String name : metroStations){
				if(name ==stationName){
					sName=name;
					System.out.println("The metro station is");
				}
				}
				return sName;
			}
			
		 
	   }
	   
	


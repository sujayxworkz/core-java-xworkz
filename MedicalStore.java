class MedicalStore{



       static int index=0;
           static String medicineNames[]={null,null,null,null,null,null,null,null,null};

            public static void getmedicineNames(){
				
				 for(int i=0;i<medicineNames.length;i++){
					String reference =  medicineNames[i];
					 System.out.println(reference);
					 	 
				 }
				   
									 System.out.println("medicines received");

			}

			
			public static boolean addMedicine(String medicine){
				boolean isAdded=false;
				if(null!=medicine){
					medicineNames[index]=medicine;
					index++;
					isAdded=true;
					
					
				}
				else{
					 System.out.println("medicine not added");
					
				}	
				
				return isAdded;
			}
			
			
	public static boolean updateMedicineName(String existingMedicineName, String updatedMedicineName){
		  boolean isupdated=false;
		    for(int medicine=0;medicine<medicineNames.length;medicine++){
				if(medicineNames[medicine].equals(existingMedicineName)){
					medicineNames[medicine]=updatedMedicineName;
					isupdated=true;
					
										 System.out.println("medicine updated");

					
				}
				

				
			}
		
		
										return isupdated;

		
		
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
						
}
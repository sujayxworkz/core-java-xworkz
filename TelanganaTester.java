class TelanganaTester{

            public static void main(String args[]){
				
				Telangana.addCity("hyderabad");
				Telangana.addCity("khammam");
				Telangana.addCity("warangal");
				Telangana.addCity("karimnagar");
			
				
				Telangana.updatecityName("hyderabad","nampally");
				Telangana.namesOfCity();

				
				int newLength=Telangana.deleteCity("warangal");
							System.out.println("The new length is"+newLength);
						Telangana.getAllDeletedCities(newLength);

			
				String thecity = Telangana.getCityByName("karimnagar");
				System.out.println(thecity);
				
			}

}
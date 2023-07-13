class MetroTester{

              public static void main(String args[]){
			  
			  Metro.addmetroStation("mejestic");
			   Metro.addmetroStation("vijay nagar");
			    Metro.addmetroStation("kengeri");
				 Metro.addmetroStation("peenya");
				  Metro.addmetroStation("silkcity");
				   Metro.addmetroStation("khammam");
				    Metro.addmetroStation("adilabad");
			  
			  
			  
			 Metro.updateStation("silkcity","tech park");
			  Metro.viewmetroStations();

			  int newLength = Metro.deleteStations("khammam");
			   System.out.println("The new length is"+ newLength);
			  Metro.getAllDeletedStations(newLength);
			  
			  String stationName=Metro.getStationsByName("peenya");
			  System.out.println(stationName);
			  
			  }








}
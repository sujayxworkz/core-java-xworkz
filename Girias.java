class Girias{

    static String electronicDevices[]={"refrigerator","washingmachine","televisiin","grinder","LED","microwave"};
	static double prices[]={10000,15000,13000,11000,14000};
	static int idNumbers[]={241,242,243,244,245};
public static void main(String macha[]){
	
	System.out.println("main started");
	
	getelectronicDevices();
	getprices();
	getidNumbers();	
   System.out.println("main ended");
	}
	
	/*for
	for(dec & init of var;condition;increment/decrement statement){
		
		
	
	
    for(int devsIndex=0;devsIndex<electronicDevices.length;devsIndex++){
	
	System.out.println(electronicDevices[devsIndex]);
	
	}*/
	
	public static void getelectronicDevices(){
	System.out.println("the electronicDevices are");
// foreach	
	for(String electronicDevice : electronicDevices){
		
	System.out.println(electronicDevice);	
		
	}	
	}
	public static void getprices(){
	System.out.println("the prices are");
	for(double price : prices){
		System.out.println(price);	
		
	}	
	}	
	public static void getidNumbers(){
	System.out.println("the idNumbers are");
	for(int idNumber : idNumbers){
	System.out.println(idNumber);		
			
		
	}
	}

	
}
	

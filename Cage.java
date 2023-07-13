class Cage{
  static String cageName="bone";
  static String cageOpened;
  static String cageClosed;
  static boolean isClosed;
  
    public static boolean openOrClose(){
	
	if(isClosed==true){
	isClosed=false;
	System.out.println("cage is open...haha");
	}
	
	else if(isClosed==false){
	isClosed=true;
	System.out.println("cage is closed..oh shit");
	}
	 return isClosed;
	}

}
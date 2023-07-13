class BankAcnt{


      String bankName="SBI";
	 
	  static double maxAmount=800;
	  static double minAmount;
	  static double Amount=500;
	  static boolean isCredited;
	   static boolean isDebited;
	  
	  
	 public static boolean credit (double Amount){
	 
	 if(isCredited=true){
	    
		if (Amount<maxAmount){
		 Amount=Amount+1;
	 System.out.println("The amt credited is"+ Amount);
	 
	 }
	 else{
	 System.out.println("The amt is not credited");
	 }
	System.out.println("End of credited");
	 }
	 return isCredited;
	 }

 public static boolean debit(double Amount){
       if(isDebited=true){
	     
		 if(Amount>minAmount){
		 Amount=Amount-1;
	   System.out.println("The amt debited is"+ Amount);
	   
	   }
     else{
	  System.out.println("The amt is not debited");
	 
	 }
	System.out.println("End of debit");
	   }
      return isDebited;
 }


}
class IndianRupeeTester{

 public static void main(String args[]){
 
   IndianRupee rupee = new IndianRupee();
   
   rupee.setRupeeId(214);
   rupee.setSerialNumber(319784241L);
   rupee.setNoOfLanguages(15);
   rupee.setRupeeName("fifty rupees");
   rupee.setColour("green");
   rupee.setBackSidePicture("stone chariot");
   rupee.setLocation("hampi");

System.out.println(rupee.getRupeeId()+" "+rupee.getSerialNumber()+" "+rupee.getNoOfLanguages()+" "+rupee.getRupeeName()+" "+rupee.getColour()+" "+rupee.getBackSidePicture()+rupee.getLocation());   
   
 
 
 }


}
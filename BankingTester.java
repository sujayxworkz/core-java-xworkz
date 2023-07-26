class BankingTester{


  public static void main(String args[]){
  
  Banking banking = new Banking();
  
  banking.setBankId(314);
  banking.setBankName("canara");
  banking.setBranch("mudhol");
  banking.setTimings("10 AM to 5 PM");
  banking.setIfscCode("CNRB00256484");
  banking.setBranchManager("mahesh");
  banking.setNoOfLocks(700);
  banking.setNoOfEmployees(37);
  banking.setMiscCode("CNRB2555481478");
  banking.setHelpLineNumber(5124521478L);
  
  System.out.println(banking.getBankId()+" "+banking.getBankName()+" "+banking.getBranch()+" "+banking.getTimings()+" "+banking.getIfscCode()+" "+banking.getBranchManager()+" "+banking.getNoOfLocks()+" "+banking.getNoOfEmployees()+" "+banking.getMiscCode()+" "+banking.getHelpLineNumber());
  
  }


}
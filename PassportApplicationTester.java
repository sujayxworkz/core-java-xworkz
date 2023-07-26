class PassportApplicationTester{

     public static void main(String args[]){
	 
	 PassportApplication passport = new PassportApplication();
	 
	 passport.setApplicationType("passport");
	 passport.setAddressProof("Aadhar");
	 passport.setDob("21-05-2009");
	 passport.setIdType("pancard");
	 passport.setNoOfPhotos(14);
	 passport.setApplicantCategory("male");
	 
System.out.println(passport.getApplicationType()+" "+passport.getAddressProof()+" "+passport.getDob()+" "+passport.getIdType()+" "+passport.getNoOfPhotos()+" "+passport.getApplicantCategory());

	 
	 
	 }


}
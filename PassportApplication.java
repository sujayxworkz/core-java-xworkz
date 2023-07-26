class PassportApplication{

 private String applicationType;
 private String addressProof;
 private String dob;
 private String idType;
 private int noOfPhotos;
 private String applicantCategory;
 
 
 public void setApplicationType(String applicationType){
	 this.applicationType = applicationType;
 }
 public String getApplicationType(){
	 return applicationType;
 }
 public void setAddressProof(String addressProof){
	 this.addressProof = addressProof;
 }
 public String getAddressProof(){
	 return addressProof;
 }
 public void setDob(String dob){
	 this.dob = dob;
 }
 public String getDob(){
	 return dob;
 }
 public void setIdType(String idType){
	 this.idType = idType;
 }
 public String getIdType(){
	 return idType;
 }
 public void setNoOfPhotos(int noOfPhotos){
	 this.noOfPhotos = noOfPhotos;
 }
 public int getNoOfPhotos(){
	 return noOfPhotos;
 }
 public void setApplicantCategory(String applicantCategory){
	 this.applicantCategory = applicantCategory;
 }
 public String getApplicantCategory(){
	 return applicantCategory;
 }
 
 


}
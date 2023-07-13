/*class Multiplication{

   public static void main(String multiply[]){
   
      multiply(6,4);
	 multiply(25,25);
	  multiply(1,2);
	 multiply(2,2);
	    multiply(1,3);
  
   }
   
           public static void multiply(int x , int y){
			System.out.println(x*y);
			}


}*/

class Multiplication {
	public static void main(String aqrgs[]){
		int mul=mul(2,3,4);
		System.out.println(mul);
		int mul1=mul(22,32,25);
		System.out.println(mul1);
		int mul2=mul(24,3,25);
		System.out.println(mul2);
		int mul3=mul(52,33,54);
		System.out.println(mul3);
		int mul4=mul(82,23,40);
		System.out.println(mul4);
	}
	public static int mul(int x, int y){
		return (x*y);
	}
	public static int mul(int x, int y,int z){
		return (x*y*z);
	}
}
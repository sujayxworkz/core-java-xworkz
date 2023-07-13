/*class Division{

   public static void main(String div[]){
   
     div(6,3);
	div(36,6);
	div(5,2);
	div(3,2);
	div(4,2);
  
   }
   
           public static void div(int x , int y){
			System.out.println(x/y);
			}


}*/



class Division{
	public static void main(String aqrgs[]){
		double div=div(2,6,9);
		System.out.println(div);
		double div1=div(3,5,6);
		System.out.println(div1);
		double div2=div(1,5,8);
		System.out.println(div2);
		double div3=div(3,6,8);
		System.out.println(div3);
		double div4=div(2,5,9);
		System.out.println(div4);
	}
	public static double div(double x, double y, double z){
		return (x/y);
	}
}
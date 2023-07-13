/*class Substraction{

   public static void main(String substract[]){
   
      substract(6,4);
	substract(36,25);
	substract(5,2);
	substract(3,2);
	   substract(1,0);
  
   }
   
           public static void substract(int x , int y){
			System.out.println(x-y);
			}


}*/

class Substraction{
	public static void main(String args[]){
		int sub=sub(9,4,2);
		System.out.println(sub);
		int sub1=sub(29,54,562);
		System.out.println(sub1);
		int sub2=sub(9,4);
		System.out.println(sub2);
		int sub3=sub(239,4,22);
		System.out.println(sub3);
		int sub4=sub(92,44,222);
		System.out.println(sub4);
		
	}
	public static int sub(int x,int y){
		return (x-y);
    }
	public static int sub(int x,int y,int z){
		return (x-y-z);
    }
}
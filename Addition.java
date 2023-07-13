//methods

/*class Addition{

   public static void main(String add[]){
   // invoke logic
   
      add(56,45);
	  add(25,45);
	  add(1,2);
	   add(2,2);
	    add(1,3);
  
   }
   
           public static void add(int x , int y){
			System.out.println(x+y);
			}


}*/

class Addition{
	public static void main(String args[]){
		int total=add(2,3,9);
		System.out.println(total);
		int total1=add(2,3);
		System.out.println(total1);
		int total2=add(424,732);
		System.out.println(total2);
		int total3=add(267,332,943);
		System.out.println(total3);
		int total4=add(297,397,249);
		System.out.println(total4);
		
	}
	public static int add(int z, int u){
		return z+u;
	}
	public static int add(int z, int u,int x){
		return z+u+x;
	}
}
class Factorial{

        static int fact;
		 public static int factorialOfNumber(int num){
		    fact=1;
			for(int i=1;i<=num;i++){
				fact=fact*i;
				
			}
		 
		 return fact;
		 
		 }
		 
}
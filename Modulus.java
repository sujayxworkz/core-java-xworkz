class Modulus {
	public static void main(String aqrgs[]){
		int mod=mod(2,3,4);
		System.out.println(mod);
		int mod1=mod(52,37);
		System.out.println(mod1);
		int mod2=mod(42,38,40);
		System.out.println(mod2);
		int mod3=mod(92,3,64);
		System.out.println(mod3);
		int mod4=mod(22,38);
		System.out.println(mod4);
	}
	public static int mod(int x, int y){
		return (x%y);
	}
	public static int mod(int x, int y,int z){
		return (x%y%z);
	}
}
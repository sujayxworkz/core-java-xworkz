class CageTester{

   public static void main(String test[]){
   System.out.println("main started");
   
   boolean closed=Cage.openOrClose();
   System.out.println("is cage closed"+ closed);
   boolean closed1=Cage.openOrClose();
    System.out.println("is cage closed"+ closed1);

   System.out.println("main ended");
   }

}
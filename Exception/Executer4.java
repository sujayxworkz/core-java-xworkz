package agency;

public class Executer4 {

    public static void main(String[] args) {

        try {
            System.out.println("main started");
            Executer4 ex = null;

            System.out.println(ex.toString());

        }catch(NullPointerException n){
            System.out.println("The null pointer exception is thrown");
            System.out.println("main ended");
        }
    }

}

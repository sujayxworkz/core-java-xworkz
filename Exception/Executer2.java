package agency;

public class Executer2 {


    public static void main(String[] args) {

        try {
            System.out.println("main started");
            int index;

            String names[] = new String[2];

            names[0] = "sujay";
            names[1] = "varun";
            names[2] = "kabir";

            for (index = 0; index < names.length; index++) {
                System.out.println(names[index]);
            }


        } catch(ArrayIndexOutOfBoundsException i){
            System.out.println("Array index size is exceeded");
            System.out.println("main ended");
            }


    }

}

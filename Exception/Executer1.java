package agency;

import lombok.ToString;

@ToString
public class Executer1 {


    public static void main(String[] args) {
        try {
            System.out.println("main started");

            int x = 10;
            int y = 0;

            System.out.println(x / y);

        }catch(ArithmeticException a) {
          System.out.println("Infinity is not present in java");
            System.out.println("main ended");
        }
        }



}

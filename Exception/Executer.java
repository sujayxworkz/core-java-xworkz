package agency;

import lombok.Getter;
import lombok.Setter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Executer {


    public static void main(String[] args) {
        System.out.println("main started");

        try {
            String name = null;
            Scanner sc = new Scanner(System.in);
            Executer executer = new Executer();
            System.out.println("Enter boy name");
            System.out.println(sc.nextInt());

        }catch(InputMismatchException m){
            System.out.println("Input mismatched exception");
            System.out.println("main ended");
        }

    }

}

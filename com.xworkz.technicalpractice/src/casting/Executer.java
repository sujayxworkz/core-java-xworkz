package casting;

public class Executer {



    public static void main(String[] args) {


        byte ty= 11;
        short s = ty;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        // implicit casting
        System.out.println(ty);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);

        // explicit casting
        double d1 = 25;
        float f1 = (float)d1;
        long l1 = (long)f1;
        int i1 = (int) l1;
        short s1 = (short) i1;
        byte ty1 = (byte) s1;

        System.out.println(d1);
        System.out.println(f1);
        System.out.println(l1);
        System.out.println(i1);
        System.out.println(s1);
        System.out.println(ty1);

    }
}

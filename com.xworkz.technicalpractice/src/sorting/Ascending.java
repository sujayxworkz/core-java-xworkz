package sorting;

public class Ascending {

    static int numbers[] = {6, 1, 5, 7, 9, 2};
    static int swap;

    public static void main(String[] args) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    swap = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = swap;
                }
            }
        }
        System.out.println("The sorted array is..");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}

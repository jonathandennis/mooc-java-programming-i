
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
            i++;
        }
        System.out.println();
    }
}

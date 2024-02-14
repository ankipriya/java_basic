import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        int size;
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Second largest: " + a[size - 2]);

    }
}

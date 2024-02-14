import java.util.Scanner;

public class Source {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=scanner.nextInt();
        int[] number=new int[size];
        int small=0;
        int big=0;
        for(int i=0;i<size;i++) {
            number[i] = scanner.nextInt();
        }
        small=number[0];
        for(int i=0;i<size;i++) {
            if(small>number[i]){
                small=number[i];
            }
            if(big<number[i]){
                big=number[i];
            }

        }
        System.out.println("the smallest element is "+small);
        System.out.println("the biggest number is"+big);
    }
}

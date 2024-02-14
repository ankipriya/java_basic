import java.util.Scanner;

public class Source {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int a=scanner.nextInt();
        int element[]=new int[a];
        int sum=0;
        System.out.println("Enter the elements of the array");
        for(int i=0;i<a;i++){
            element[i]=scanner.nextInt();
        }
        for(int i=0;i<a;i++){
            sum=sum+element[i];
        }
        System.out.println("the sum of the elements is "+sum);

    }
}

import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int size;
        System.out.println("Entaer the size of fibonacci series");
        size=s.nextInt();
        if(size>0) {
            int num[]=new int[size];
        num[0]=0;
        num[1]=1;
         System.out.print(num[0]);
            System.out.print(num[1]);
            for(int i=2;i<size;i++){
                num[i]=num[i-1]+num[i-2];
                System.out.print(num[i]);

            }

        }
    }
}

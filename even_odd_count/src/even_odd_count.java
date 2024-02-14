import java.util.Scanner;

public class even_odd_count {
    public static void main(String[]args){
        int size;
        int even=0;
        int odd=0;
        Scanner s=new Scanner(System.in);
        size=s.nextInt();
        int[] element=new int[size];
        for(int i=0;i<size;i++){
            element[i]=s.nextInt();
        }
        for(int check:element){
            if(check%2==0)
                even++;
            else
                odd++;

        }
        System.out.println("Even: "+even+",Odd: "+odd);


    }
}

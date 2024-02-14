import java.util.Scanner;

public class sum_of_even_elements {
    public  static void main(String[]args){
        int size;
        int sum=0;
        Scanner s=new Scanner(System.in);
        size=s.nextInt();
        int[] elements=new int[size];
        for(int i=0;i<size;i++){
            elements[i]=s.nextInt();
            if(elements[i]%2==0){
                sum+=elements[i];
            }
        }
        System.out.println("Sum of even elements: "+sum);

    }
}

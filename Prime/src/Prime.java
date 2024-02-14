import java.util.Scanner;

public class Prime {
    public static void main(String[]args) {
        int num;
        boolean isPrime=false;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number the check if it is prime or not");
        num = s.nextInt();
        if (num<=1){
            System.out.println(num+"is not a prime number");
        }
        else{
            for(int i=2;i<(num-1);i++){
                int r=num%i;
                if(r==0){
                    isPrime=true;
                }
                else{
                    isPrime=false;
                }

            }

            }
            if(isPrime==false){
                System.out.println(num+" is a prime number");
            }
            else {
                System.out.println(num+" is not a prime number");

            }
    }

}

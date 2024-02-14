import java.util.Scanner;

public class Source {
    public static void main(String[]args){
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year to check leap or not");
        year=scanner.nextInt();
        int modulo=year%4;
        if(modulo==0){
            System.out.println("The year is leap year");
        }
        else {
            System.out.println("The year is not a leap year");
        }
    }
}

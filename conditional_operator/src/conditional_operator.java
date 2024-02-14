import java.util.Scanner;

public class conditional_operator {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your mark");
        int mark=scanner.nextInt();
        if(mark>100){
            System.out.println("Enter a valied mark");
        }
        System.out.println("the mark obtained is "+mark);
        if(mark==100)
        {
            System.out.println("your grade is A");
        }
        if(mark<99 && mark>=80){
            System.out.println("your grade is B");
        }

        if (mark<80 && mark>=60){
            System.out.println("your grade is c");
        }
        if(mark<60){
            System.out.println("your grade is E");
        }

    }
}

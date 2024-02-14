import java.util.Scanner;

public class Source {
    public static void main(String[]args){
        double radius;
        final double pi=3.141;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius=scanner.nextDouble();
        double area=pi*radius*radius;
        System.out.println("the area of the circle is "+area);

    }
}

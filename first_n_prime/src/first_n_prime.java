import java.util.Scanner;

public class first_n_prime {
    public static void main(String args[])
    {
        int n;
        int status = 1;
        int num = 3;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (n >= 1)
        {
            System.out.print(2+", ");
        }

        for ( int i = 2 ; i <=n ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.print(num);
                if(i==n)
                    break;
                System.out.print(", ");
                i++;
            }
            status = 1;
            num++;
        }
    }


}

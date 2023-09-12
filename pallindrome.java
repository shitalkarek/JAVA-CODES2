import java.util.*;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();

        int m = n ;
        int rev = 0 ;

        while(n>0)
        {

            int r = n % 10 ;
            rev = rev * 10 + r ;
            n = n / 10 ;
        }

        if ( m == rev)
        {
            System.out.println(m +" its a pallindrome");
        }
        else
        {
            System.out.println(m+" its not a pallindrome");
        }

    }
}

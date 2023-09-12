import  java.util.*;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number to check its prime or not");
        int n = sc.nextInt();
        
        
        boolean prime = true;

        for(int i=2; i<n;i++)
        {
            if(n % i ==0)
            {
                prime = false;
                break;
            }
        }
        System.out.println(prime );
    }
}

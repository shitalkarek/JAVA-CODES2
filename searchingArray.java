import java.util.*;
public class searchingArray {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner (System.in);
        
        int a[]={2,4,6,8,10,12};
        int key;

        System.out.println("enter a key to search");
        key = sc.nextInt();

        for(int i=0; i<a.length; i++)
        {
            if (key == a[i])
            {
                System.out.println("key found at index no " +  i);
                System.exit(0);
            }
        }
        System.out.println("not found ");
    }
}

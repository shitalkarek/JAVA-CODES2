
public class rightRotationArray {

    public static void main(String[] args) {
        int a [] = { 1,2,3,4,5,6,7,8,9,10};
        int temp;

        //initial array  

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        temp=a[a.length-1];

        for(int i=a.length-1; i>0; i--)
        {
            a[i]=a[i-1];
        }
        a[0]=temp;


        //displaying

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }


    }
}
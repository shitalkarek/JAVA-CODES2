
public class two2Darray {

    public static void main(String[] args) {
        
        int a [] [];
        a=new int [3][4];

        for(int i=0 ; i<a.length; i++)
        {
            for (int j = 0 ; j<a[0].length;j++)
            {
                System.out.println(a[i][j]);
            }
            System.out.println("\n");
        }
    }
}
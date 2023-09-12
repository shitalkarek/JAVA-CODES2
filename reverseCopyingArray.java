public class reverseCopyingArray {
    public static void main(String[] args) {

        int a[] = { 2, 4, 6, 8, 10 };

        int b[] = new int[4];
        int i, j;

        for (i = a.length - 1, j = 0; i >= 0; i--, j++) {
            b[j] = a[i];
        }

        //displaying

        for(i=0;i<a.length;i++)
        {
            System.out.print(b[j]+",");
        }
    }
}

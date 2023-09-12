public class variableArguments {
    static void  show(int ... a)
    {
        for (int x :a)
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
         show(100);
        show( );
        show(12,23,45,67,89);
        show(new int[] = { 3,4,5,6});
    }
}

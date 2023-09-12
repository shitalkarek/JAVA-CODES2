public class returnTypeOfMethod {
    static void change(int a[],int index,int value)
    {
        a[index]=value;
    }


    public static void main(String[] args) {
        int a[]={2,4,6,9,10};
        change (a,1,10);

        for(int x : a)
        {
            System.out.print(x+",");
        }
    }
}

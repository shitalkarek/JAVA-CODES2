public class passingObjectsAsParameters {
    
    static void update (int a[])
    {
        a[1]=10;
    }


    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        update(a);
        System.out.println(a[1]);
        
    }
}

public class parameterPassing {
    static int add(int x,int y)
    {
        int z = x + y ;
        return z;
    }


    public static void main(String[] args) {
        int a =10 , b = 10 ;
        int c = add(a,b);
        System.out.println(c);
    }
}



/*  here,
 * add & main are seperate method.
 * MAIN = its a caller its called the method
 * ADD = its a called method that is called by the main
 * x & y = formal parameters
 * a & b = actual parameters
 * paramerters = take inputs for methods
 * int = return type for a method
 */
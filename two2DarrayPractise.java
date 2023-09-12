public class two2DarrayPractise {
    public static void main(String[] args) {
        int a [] []= new int[5][5];
        int b [] []={ {1,2,3}, {2,4,6}, {1,3,5}};

        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}

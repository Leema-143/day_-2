public class star3
{
    public static void main(String[]args)
    {
        int i,j,k,n=3;
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.println("*");
            }
            for(j=(n-i);j>=2;j--)
            {
                System.out.println(" ");
            }
            for(k=i;k>=0;k--)
            {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
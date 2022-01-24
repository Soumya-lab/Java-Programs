import java.util.Scanner;
public class Pattern1 
{
    public static void main(String args[])
    {
        int i,j,n;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            Sytem.out.println();
        }
    }
    
}

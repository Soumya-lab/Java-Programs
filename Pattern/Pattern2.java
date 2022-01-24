/*
111
222
333
*/
import java.util.Scanner;
public class Pattern2 {
    public static void main(String args[])
    {
        int i,j;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n= in.nextInt();
        for(i= 1;i<=n;i++)
        {
            for(j= 1;j<=n;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

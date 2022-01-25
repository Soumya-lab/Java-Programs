/*
       *
      ***
     *****
    *******
   *********
  ***********
 *************
  ***********
   *********
    *******
     *****
      ***
       *
*/
import java.util.Scanner;
public class Pattern37 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,j,k,l,n;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for(l=i-1;l>=1;l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=n-1;i++)
        {
            for(j=1;j<=i+1;j++)
            {
                System.out.print(" ");
            }
            for(k=n-1;k>=i;k--)
            {
                System.out.print("*");
            }
            for(l=n-2;l>=i;l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

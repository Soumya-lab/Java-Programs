/*
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
*/

import java.util.Scanner;
public class Pattern30 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,j,k,n;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=5;i++)
        {
            for(j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=n-1;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=n-1;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

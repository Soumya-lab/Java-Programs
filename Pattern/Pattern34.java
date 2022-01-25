/*
 *********
  *******
   *****
    ***
     *
*/

import java.util.Scanner;
public class Pattern34 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,j,k,l,n;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(k=n;k>=i;k--)
            {
                System.out.print("*");
            }
            for(l=n-1;l>=i;l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
     *
    ***
   *****
  *******
 *********
 */

import java.util.Scanner;
public class Pattern32 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,j,k,l,n;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for(l=1;l<=i-1;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

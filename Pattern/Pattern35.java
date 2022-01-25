/*
     1
    121
   12321
  1234321
 123454321
 */

import java.util.Scanner;
public class Pattern35 {
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
                System.out.print(k);
            }
            for(l=i-1;l>=1;l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}

/*
1234
 234
  34
   4
   */

import java.util.Scanner;
public class Pattern24 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,j,k,n;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(k=i;k<=n;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

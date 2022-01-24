/*
     1
    22
   333
  4444
 55555
*/

import java.util.Scanner;
public class Pattern23 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,i,j,k;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

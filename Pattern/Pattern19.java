/*
     *
    **
   ***
  ****
 *****
*/

import java.util.Scanner;
public class Pattern19 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,i,j,k;
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
            System.out.println();
        }
    }
}

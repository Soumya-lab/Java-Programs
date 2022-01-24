/*
 11111
  2222
   333
    44
     5
*/

import java.util.Scanner;
public class Pattern22 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,i,j,k;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=n;k>=i;k--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }    
}

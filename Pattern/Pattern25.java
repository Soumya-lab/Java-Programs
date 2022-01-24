/*
    1
   23
  456
 78910
 */

import java.util.Scanner;
public class Pattern25 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,i,j,k;
        int c=1;
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
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}

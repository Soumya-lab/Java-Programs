/*
*****
****
***
**
*
*/

import java.util.Scanner;
public class Pattern20 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

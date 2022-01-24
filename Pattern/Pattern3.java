/*
1111
222
33
4
*/

import java.util.Scanner;
public class Pattern3 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the Number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

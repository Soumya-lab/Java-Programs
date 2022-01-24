/*
4 3 2 1 
4 3 2 1
4 3 2 1
4 3 2 1
*/

import java.util.Scanner;
public class Pattern5 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

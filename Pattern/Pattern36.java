/*
*****
*   *
*   *
*****
*/

import java.util.Scanner;
public class Pattern36 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }
}

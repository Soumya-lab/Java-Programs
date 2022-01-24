/*
1 2 3 
4 5 6
7 8 9
*/

import java.util.Scanner;
public class Pattern6 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,i,j,c=0;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                c++;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}

/*
A B C D 
A B C D
A B C D
A B C D
*/

import java.util.Scanner;
public class Pattern13 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            char c= 65;
            for(j=1;j<=n;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}

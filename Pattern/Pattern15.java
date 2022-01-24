/*
A B C D 
B C D E
C D E F
D E F G
*/

import java.util.Scanner;
public class Pattern15 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            char c=(char)('A'+i-1);
            for(j=1;j<=n;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}

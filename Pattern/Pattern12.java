/*
A A A A 
B B B B
C C C C
D D D D
*/

import java.util.Scanner;
public class Pattern12 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        char c= 65;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(c+" ");
            }
            c++;
            System.out.println();
        }
    }    
}

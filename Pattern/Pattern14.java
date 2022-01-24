/*
A B C D 
E F G H
I J K L
M N O P
*/

import java.util.Scanner;
public class Pattern14 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,i,j;
        char c= 65;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }    
}

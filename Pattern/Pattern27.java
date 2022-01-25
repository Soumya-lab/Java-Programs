/*
1 
2 6
3 7 10
4 8 11 13
5 9 12 14 15
*/

import java.util.Scanner;
public class Pattern27 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            int c=i;
            for(j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                c= c+n-j;
            }
            System.out.println();
        }
    }
}

/*
1 2 3 
6 5 4
7 8 9
12 11 10
13 14 15
*/

import java.util.Scanner;
public class Pattern28 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,j,n,c=0;
        System.out.println("Enter the number of rows: ");
        n= in.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                for(j=1;j<=3;j++)
                {
                    c= c+1;
                    System.out.print(c+" ");
                }
            }
            else
            {
                int temp= c+1;
                for(j=c+3;j>=temp;j--)
                {
                    c= c+1;
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}

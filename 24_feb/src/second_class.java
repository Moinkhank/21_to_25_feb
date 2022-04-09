//PYRAMID PATTERN

import java.util.*;
public class second_class {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        int i,j,k=0,row=sc.nextInt();

        for (i=1;i<=row;i++)
        {

            for(j=1;j<=row-i;j++)
                System.out.print(" ");

            while(k!=(2*i-1))
            {
                System.out.print("*");
                k++;
            }
            k=0;
            System.out.println();
        }
    }
}

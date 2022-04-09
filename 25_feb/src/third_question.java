//WAP TO PRINT PANT,S STYLE STAR PATTERN

import java.util.*;
public class third_question {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Rows : ");
        //Taking total rows as input from user
        int r,s, c, rows = scan.nextInt();
        for(r = 0; r<rows; r++)
        {
            for(c = rows ; c>r; c--)
                //Inner loop that prints first half stars
                System.out.print("* ");
            for(s = 1; s<=4*r;s++)
                //Inner loop that prints space in between
                System.out.print(" ");
            for(c = r+1 ; c<=rows; c++)
                //Inner loop that prints second half stars
                System.out.print("* ");
            //Prints a new line
            System.out.println();
        }
    }
}

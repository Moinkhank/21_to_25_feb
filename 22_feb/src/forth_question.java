//WAP To calculate the sum of no till n and n is taken from user .using while loop

import java.util.*;
public class forth_question {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum = 0 ;
       while(n>0)
       {
           sum += n;
           n--;
       }
        System.out.println(sum);
    }
}

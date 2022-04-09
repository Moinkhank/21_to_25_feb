//wap to check no is even or odd

import java.util.*;
public class third_question {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("enter your no");
        int no  =sc.nextInt();
        print_hello(no);



    }
    public static void print_hello(int no)
    {
       if(no%2==0)
       {
           System.out.println("even no");
       }
       else
       {
           System.out.println("odd no");
       }
    }
}

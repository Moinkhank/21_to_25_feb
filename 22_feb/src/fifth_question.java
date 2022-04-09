// Using while loop to calculate factorial of a number

import java.util.*;
public class fifth_question {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt(), fact =1;
        while(value > 0)
        {
            fact *= value;
            value --;
        }
        System.out.println(fact);
    }
}

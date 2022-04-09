// WAP apply do while loop to calculate factorial of a number


public class second_question {
    public static void main(String[] args) {

        int num = 6,fact=1,i=1;
        do{
            fact = fact*i;
            i++;

        }while(i<=num);
        System.out.println(fact);
    }
}

//check if a given number is divisible by 2 and 8 but not 12


public class third_question {
    public static void main(String[] args) {

        int no = 16;
        if(no%2==0 && no%8==0 && no%12 !=0)
        {
            System.out.println(no);
        }
        else
        {
            System.out.println("wrong number");
        }
    }
}

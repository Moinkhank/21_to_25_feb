//find if a given number is power of 2


public class second_question {
    public static void main(String[] args) {

       boolean t = false;
        int n = 32,power = 0,temp=0;
        while(temp<n)
        {
            temp = (int)(Math.pow(2,power));
            power ++ ;
            if(temp ==n)
            {
                t = true;
            }
        }
        System.out.println(t);
    }
}

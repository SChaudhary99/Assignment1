public class Ex6 {

    public static void main (String[]args){
        int reverseNum=0;
        int number = 1234567;
        while(number!=0){
            reverseNum = (reverseNum*10) + (number%10);

            number = number/10;

        }
        System.out.println(reverseNum);
    }
}

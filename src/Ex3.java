import java.util.Scanner;

public class Ex3 {

    public static void main(String[]args){

        Scanner scanner= new Scanner(System.in);
        System.out.print("Please enter an Integer: ");
        int input = scanner.nextInt();
        int reverseNum=0;
        while(input!=0){
            reverseNum = (reverseNum*10) + (input%10);

            input = input/10;

        }
        System.out.println(reverseNum);



    }
}

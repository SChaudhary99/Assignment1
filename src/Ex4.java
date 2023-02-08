import java.util.Scanner;

public class Ex4 {
    public static void main(String[]args){

        Scanner scanner =new Scanner(System.in);
        int x = 0;
        int input;
        int sumEven=0;
        int sumOdd=0;
        while(x<10){
            System.out.print("Please enter a number: ");
            input=scanner.nextInt();
            if (input%2==0){
                sumEven=input+sumEven;
            }
            else{
                sumOdd=input+sumOdd;
            }
            x++;


        }
        System.out.println("Total sum of Even Numbers is: " + sumEven);
        System.out.println("Total sum of Odd Number is: "+ sumOdd);


    }
}

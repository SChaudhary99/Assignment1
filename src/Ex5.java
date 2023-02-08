import java.util.Scanner;

public class Ex5 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        int input;
        int totalSum = 0;

            System.out.print("Please Enter a Number: ");
            input = scanner.nextInt();
            totalSum = input;

        while (input>=0){
            System.out.print("The programme will continue till you enter a negative value Please enter a number: ");
            input= scanner.nextInt();
            totalSum = input + totalSum;
        }
        System.out.print("Total sum of entered numbers is: "+totalSum);

    }
}

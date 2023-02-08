import java.util.Scanner;

public class Ex2 {

    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Please enter the number for which you want Factorial result: ");
        int input = scanner.nextInt();
        int x = 0;
        int y=1;
        while(input>0){
            y = y*input;
            input--;
             x += 1;
        }
        System.out.println("The Factorial of "+ x +" is : "+y);

    }
}

public class Ex1 {
    public static void main(String[] args) {
        int x=0;
        int y=0;

        while (x<10){
            y= y + ++x;


        }
        System.out.print("The total sum of first 10 Natural number is: ");
        System.out.println(y);
    }
}
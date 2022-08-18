import java.util.Scanner;

public class Exa5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Value Of x->");
        int x=input.nextInt();
        System.out.println("Enter The Value Of Y->");
        int y=input.nextInt();
        x=x*y;
        y=x/y;
        x=x/y;
        System.out.println("The number x is");
        System.out.println(x);
        System.out.println("The   number y is");
        System.out.println(y);
    }
}

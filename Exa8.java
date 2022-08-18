import java.util.Scanner;

public class Exa8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter The number x->");
        int x=input.nextInt();

        System.out.println("Enter The number y->");
        int y=input.nextInt();
        double n;
        n=y*y;
        System.out.println(n);
        n=y*y*y;

        System.out.println(n);
        n= Math.pow(x,y);

        System.out.println(n);
    }
}

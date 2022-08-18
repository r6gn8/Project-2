import java.util.Scanner;

public class Exa4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The number x ->");
        int x=input.nextInt();
        System.out.println("Enter The number y ->");
        int y=input.nextInt();
        System.out.println("Enter The number z ");
        int z=input.nextInt();
        int n;
        n=(x+y+z)/3;
        System.out.println(n);
    }
}

import java.util.Scanner;

public class Exa3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Length is");
        int len=input.nextInt();
        System.out.println("Enter The Width is");
        int wid=input.nextInt();
        int area=len*wid;
        System.out.println("The Area is"+area);
    }
}

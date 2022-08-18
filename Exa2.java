import java.util.Scanner;

public class Exa2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double radius,area;
        System.out.println("Enter The radius");
        radius=input.nextDouble();
        area=radius*radius*3.14;
        System.out.println("The area is "+area);
    }
}

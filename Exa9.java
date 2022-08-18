import java.util.Scanner;

public class Exa9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Value X->");
        int x=input.nextInt();

        System.out.println("Enter Second Value Y->");
        int y=input.nextInt();

        int n,max,min,distance,difference;
        n=x+y;
        System.out.println(n);
        difference=x-y;
        System.out.println(difference);
        n=x*y;
        System.out.println(n);
        n=(x+y)/2;
        System.out.println(n);
        distance=difference;
        if(distance>0){System.out.println(difference);}
        if(distance<0){System.out.println(-1*difference);}
        max=x;
        if(y>max)max=y;
        System.out.println(max);
        min=x;
        if(y<min)min=y;
        System.out.println(min);
    }
}

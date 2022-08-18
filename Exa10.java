public class Exa10 {
    public static void main(String[] args) {
        int x=20, y=25, n,max,min,distance,difference;
        double b;
        n=x+y;
        System.out.println(n);
        difference=x-y;
        System.out.println(difference);
        n=x*y;
        System.out.println(n);
        b=(x+y)/2;
        System.out.println(b);
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

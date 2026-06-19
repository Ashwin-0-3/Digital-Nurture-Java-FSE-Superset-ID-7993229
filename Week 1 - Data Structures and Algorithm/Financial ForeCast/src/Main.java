import java.text.DecimalFormat;

public class Main {
    public static double func(double a,double b,int c)
    {
        if(c==0)
            return a;
        return func(a,b,c-1)*(1+b);
    }
    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("0.00");
        double amt=100;
        double r=0.05;
        int y=5;
        System.out.println("The final Amount received $"+dc.format(func(amt,r,y)));
    }
}
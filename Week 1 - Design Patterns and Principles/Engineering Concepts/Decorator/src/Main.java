public class Main {
    public static void main(String[] args) {
        Coffee c = new Hot();
        System.out.println(c.type()+" "+c.amt());
        c=new MilkDec(c);
        System.out.println(c.type()+" "+c.amt());

    }
}
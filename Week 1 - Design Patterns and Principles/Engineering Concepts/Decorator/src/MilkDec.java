public class MilkDec implements Decorator{
    Coffee a;
    public MilkDec( Coffee a)
    {
        this.a=a;
    }
    public String type()
    {
        return a.type()+"Milk";
    }
    public int amt()
    {
        return a.amt()+10;
    }
}

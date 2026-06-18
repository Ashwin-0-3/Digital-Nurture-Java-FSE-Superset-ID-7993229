public class IndianCar implements Car{
    private String a,b,c;
public IndianCar(String a,String b,String c)
{
    this.a=a;
    this.b=b;
    this.c=c;
}
    public String brand(){
    return a;
    }
    public String model()
    {
return b;
    }
    public String color()
    {
        return c;
    }
}

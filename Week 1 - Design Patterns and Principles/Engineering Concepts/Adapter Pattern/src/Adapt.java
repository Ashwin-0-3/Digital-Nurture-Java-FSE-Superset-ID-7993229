public class Adapt implements Car{
    ForeignCar fg;
    public Adapt(ForeignCar fg)
    {
        this.fg=fg;
    }
    public String brand()
    {
        return fg.x;
    }
    public String model()
    {
        return fg.y;
    }
    public String color()
    {
        return fg.z;
    }
}

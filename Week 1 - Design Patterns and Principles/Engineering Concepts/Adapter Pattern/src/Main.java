import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Car>arr=new ArrayList<>();
        Car c1 = new IndianCar("BMW","Q7","Black");
        Car c2 = new Adapt(new ForeignCar("RR","Topend","White"));
        arr.add(c1);
        arr.add(c2);
        for(Car i:arr)
        {
            System.out.println(i.brand()+" "+i.model()+" "+i.color());
        }
    }
}
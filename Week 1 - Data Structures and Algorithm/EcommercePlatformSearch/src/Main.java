import java.util.*;
public class Main {
    public static void main(String[] args) {
        Product[] pro={new Product(1,"X","Ball"),
        new Product(2,"Y","Bat"),
        new Product(4,"Z","Stump"),
        new Product(3,"A","Light")};
        Product p1=Search.linear(pro,4);
        System.out.println((p1==null)?"Element Not Found":p1);
        Arrays.sort(pro,Comparator.comparing(p->p.id));
        Product p2=Search.binary(pro,2);
        Product p3=Search.binary(pro,5);
        System.out.println((p2==null)?"Element Not Found":p2);
        System.out.println((p3==null)?"Element Not Found":p3);
    }
}
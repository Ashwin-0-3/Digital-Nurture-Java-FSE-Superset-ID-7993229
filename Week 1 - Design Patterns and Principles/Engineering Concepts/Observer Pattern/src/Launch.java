import java.util.*;
public class Launch implements Product{
    String p;
    public Launch(String p)
    {
        this.p=p;
    }
    List<User>arr=new ArrayList<>();
    public void sub( User r)
    {
        arr.add(r);
    }
    public void unsub(User r)
    {
        arr.remove(r);
    }
    public void notif()
    {
        for(User i:arr)
        {
            i.launch(p);
        }
    }
}

public class Amazon implements User{
    String a;
    public Amazon(String a)
    {
        this.a=a;
    }
    public void launch(String p)
    {
        System.out.println("Hey "+a+" the product "+p+" has been launched today!");
    }
}

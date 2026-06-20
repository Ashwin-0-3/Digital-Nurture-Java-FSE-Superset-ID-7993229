public class Service {
    private static ExternalApi e;
    public Service(ExternalApi e)
    {
        this.e=e;
    }
    public static String getData()
    {
        return e.fetchData();
    }
}

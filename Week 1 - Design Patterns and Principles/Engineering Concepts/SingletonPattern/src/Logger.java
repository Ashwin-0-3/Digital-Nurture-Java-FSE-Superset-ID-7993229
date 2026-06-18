public class Logger {
    private static Logger log=null;
    private Logger()
    {
        System.out.println("Private Logger is called");
    }
    public static Logger func()
    {
        if(log==null)
            log=new Logger();
        return log;
    }
}

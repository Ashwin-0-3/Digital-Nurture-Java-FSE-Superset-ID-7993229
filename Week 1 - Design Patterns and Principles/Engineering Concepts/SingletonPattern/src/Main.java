public class Main {
    public static void main(String[] args) {
        Logger log1 = Logger.func();
        Logger log2 = Logger.func();
        System.out.println(log1==log2);
    }
}
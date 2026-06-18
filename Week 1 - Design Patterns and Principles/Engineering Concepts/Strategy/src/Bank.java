public class Bank implements  PaymentStrategy{
    public void type() {
        System.out.println("Bank");
    }
    public void amt(int t) {
        System.out.println("Amount : "+t);
    }
}

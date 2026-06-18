public class Main {
    public static void main(String[] args) {
        PaymentSys p= new PaymentSys(new Bank(),100);
        PaymentSys t= new PaymentSys(new Card(),100);
    }
}
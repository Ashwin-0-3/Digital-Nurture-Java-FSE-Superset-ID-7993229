public class Card implements PaymentStrategy{
    public void type() {
        System.out.println("Card");
    }
    public void amt(int t) {
        System.out.println("Amount : "+(t+((t*10)/100)));
    }
}

public class PaymentSys {
    PaymentStrategy p;
    int t;
    public PaymentSys(PaymentStrategy p,int t)
    {
        this.p=p;
        this.t=t;
        p.type();
        p.amt(t);
    }
}

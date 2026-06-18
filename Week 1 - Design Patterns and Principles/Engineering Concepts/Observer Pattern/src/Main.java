public class Main {
    public static void main(String[] args) {
        User u1=new Amazon("Ash");
        User u2=new Amazon("Bhuvi");
        User u3=new Amazon("Catherine");
        User u4=new Amazon("Frauq");
        Product p = new Launch("Iphone 18");
        p.sub(u1);
        p.sub(u2);
        p.sub(u3);
        p.sub(u4);
        p.unsub(u2);
        p.notif();
    }
}
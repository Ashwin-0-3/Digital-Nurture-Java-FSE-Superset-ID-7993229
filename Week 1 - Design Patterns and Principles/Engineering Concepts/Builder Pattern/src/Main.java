public class Main {
    public static void main(String[] args) {
        Computer b = new Computer.Builder("Intel","32GB").setStorage(90).buildd();
        b.display();
    }
}
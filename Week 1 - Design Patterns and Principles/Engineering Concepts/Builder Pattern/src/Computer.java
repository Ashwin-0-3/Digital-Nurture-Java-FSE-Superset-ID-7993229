public class Computer {
    private String cpu;
    private String ram;
    private int st;
    private String cl;

    private Computer(Builder bl) {
        this.cpu = bl.cpu;
        this.ram = bl.ram;
        this.cl = bl.cl;
        this.st = bl.st;
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private int st;
        private String cl="Black";

        public Builder(String a, String b) {
            this.cpu = a;
            this.ram = b;
        }

        public Builder setStorage(int a) {
            st = a;
            return this;
        }

        public Builder setcl(String u) {
            cl = u;
            return this;
        }

        public Computer buildd() {
            return new Computer(this);
        }
    }
    public void display()
    {
        System.out.println(cpu+" "+ram+" "+st+" "+cl);
    }
}

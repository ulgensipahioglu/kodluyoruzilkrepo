public class Program {
    String[] args;

    public Program(String[] args) {
            this.args = args;
    }

    public void run() {
        int n = Integer.parseInt(this.args[0]);
        System.out.println(Recursivefibonacci(n));
    }

    private int Recursivefibonacci(int n) {
        if (n <= 1){
            return n;
        }
        return Recursivefibonacci(n - 1) + Recursivefibonacci(n - 2);
    }
}

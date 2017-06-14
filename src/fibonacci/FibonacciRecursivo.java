package fibonacci;

public class FibonacciRecursivo {

    static long inicio = System.currentTimeMillis();

    static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.print(FibonacciRecursivo.fibo(i) + "\n");
        }
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo: " + tempo);

    }

}

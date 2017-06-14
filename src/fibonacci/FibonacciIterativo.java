package fibonacci;

public class FibonacciIterativo {

    static long inicio = System.currentTimeMillis();

    static long fibonacciIterativo(int n) {
        long F = 0;     // atual
        long ant = 0;   // anterior

        for (long i = 1; i <= n; i++) {
            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }
        }
        return F;
    }

    public static void main(String[] args) {
        for (long i = 0; i < 30; i++) {
            System.out.print(FibonacciIterativo.fibonacciIterativo((int) i) + "\n");
        }
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo: " + tempo);
    }
}

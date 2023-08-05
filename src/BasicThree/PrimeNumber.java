package basics.src.BasicThree;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean x;

        for (int i = 1; i < 100; i += 2) {
            x = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    x = false;
                }
            }
            if (x) {
                System.out.print(i + " ");
            }
        }
    }
}

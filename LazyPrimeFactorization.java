package IsPrime;

import java.util.Scanner;

public class LazyPrimeFactorization implements Runnable {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter number IsPrime Find: ");
        int number = scanner.nextInt();
        int count = 0;
        int i = 2;
        ShowPrime(number, count, i);
    }

    private void ShowPrime(int number, int count, int i) {
        while (count < number) {
            if (IsPrime(i)) {
                System.out.print("\nIsPrime: " + i);
                count++;
            }
            i++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean IsPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
            return true;
        }
        return true;
    }
}

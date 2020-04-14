package IsPrime;

import java.util.Scanner;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number IsPrime Find: ");
        int number = scanner.nextInt();
        int count = 0;
        int i = 2;
        while (count < number) {
            if (IsPrime(i)) {
                System.out.print("\nisPrime: " + i);
                count++;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            i++;
        }
    }

    public boolean IsPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
            return true;
        }
        return true;
    }
}

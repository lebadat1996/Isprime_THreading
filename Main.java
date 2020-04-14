package IsPrime;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lpf = new LazyPrimeFactorization();
        OptimizedPrimeFactorization opf =new OptimizedPrimeFactorization();
        Thread t1 =new Thread(opf);
        Thread t2 = new Thread(lpf);
        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        t2.start();
    }
}

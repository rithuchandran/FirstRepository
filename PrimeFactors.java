import java.util.ArrayList;

public class PrimeFactors {
    private ArrayList<Integer> factors = new ArrayList<Integer>();
    private ArrayList<Integer> primeFactors = new ArrayList<Integer>();

    void findFactor(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                factors.add(i);
        }
    }

     boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public void generate(int n) {
        this.findFactor(n);
        for (int i : factors) {
            if (isPrime(i))
                primeFactors.add(i);
        }
        System.out.println("Prime factors of " + n + " are:");
        System.out.println(this.primeFactors);
    }

    public static void main(String[] args) {
        PrimeFactors t = new PrimeFactors();
        int n = Integer.parseInt(args[0]);
        t.generate(n);
    }
}


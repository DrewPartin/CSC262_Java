public class Sieve {
    public void primeFinder() {
        boolean[] primes = new boolean[1000];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }
        for (int index = 2; index < 1000; index++) {
            if (primes[index] == true) {
                int temp = index;
                while (temp < 1000) {
                    if (primes[temp] == true) {
                        for (int i = temp * temp; i < 1000; i += temp) {
                            primes[i] = false;
                        }
                    }
                    temp++;
                }
            }
        }
        int line = 0;
        for (int i = 2; i < 1000; i++) {
            if (primes[i] == true) {
                line++;
                if (line > 20) {
                    System.out.println();
                    line = 1;
                }
                System.out.printf("%4d", i);
            }
        }
    }
}

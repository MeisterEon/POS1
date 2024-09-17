package net.htlgkr.adlesgrubers22054.pos2.primechecker;

public class EratosthenesPrimeSieve implements PrimeSieve{
    private Boolean[] primeNumberArray;

    public EratosthenesPrimeSieve(int limit) {
        primeNumberArray = new Boolean[limit];
        for (int i = 2; i < limit; i++) {
            primeNumberArray[i] = true;
        }

        for (int i = 2; i < Math.sqrt(limit); i++) {
            if (primeNumberArray[i]) {
                for (j = i * i; i < limit; i += i) {
                    primeNumberArray[j] = false;
                }
            }
        }
    }

    @Override
    public boolean isPrime(int p) {
        return primeNumberArray.contains(p);
    }

    @Override
    public void printPrimes() {
        for (Integer i : primeNumberArray) {
            System.out.println(i);
        }
    }
}

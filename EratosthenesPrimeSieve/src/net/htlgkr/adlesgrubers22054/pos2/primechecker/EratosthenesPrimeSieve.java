package net.htlgkr.adlesgrubers22054.pos2.primechecker;

import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve{
    private int limit;
    private List<Integer> numberList;

    public EratosthenesPrimeSieve(int limit) {
        this.limit = limit;

    }

    @Override
    public boolean isPrime(int p) {
        return false;
    }

    @Override
    public void printPrimes() {

    }
}

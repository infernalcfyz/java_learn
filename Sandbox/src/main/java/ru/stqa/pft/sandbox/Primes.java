package ru.stqa.pft.sandbox;

public class Primes {

    public static boolean isPrime (int n) {
        int m = (int) Math.sqrt(n);
        for (long i = 2; i < m; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return  true;
    }

    public static boolean isPrimeWhile (int n) {
        int i = 2;
        while (i < n && n % i != 0) {
            i++;
        }
        return  i == n;
    }

    public static boolean isPrime (long n) {
        int m = (int) Math.sqrt(n);
        for (long i = 2; i < m; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return  true;
    }

}

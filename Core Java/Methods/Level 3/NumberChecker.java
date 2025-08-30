public class NumberChecker {
    public static int countDigits(long n) {
        if (n == 0)
            return 1;
        int c = 0;
        n = Math.abs(n);
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public static int[] toDigits(long n) {
        n = Math.abs(n);
        int c = countDigits(n);
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            d[i] = (int) (n % 10);
            n /= 10;
        }
        return d;
    }

    public static boolean isDuck(int[] d) {
        for (int x : d)
            if (x == 0)
                return true;
        return false;
    }

    public static boolean isArmstrong(int[] d) {
        int p = d.length;
        long s = 0;
        for (int x : d)
            s += Math.pow(x, p);
        long val = 0;
        for (int x : d)
            val = val * 10 + x;
        return s == val;
    }

    public static int[] largestTwo(int[] d) {
        int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > a) {
                b = a;
                a = x;
            } else if (x > b && x != a) {
                b = x;
            }
        }
        return new int[] { a, b };
    }

    public static int[] smallestTwo(int[] d) {
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < a) {
                b = a;
                a = x;
            } else if (x < b && x != a) {
                b = x;
            }
        }
        return new int[] { a, b };
    }

    public static int sumDigits(int[] d) {
        int s = 0;
        for (int x : d)
            s += x;
        return s;
    }

    public static int sumSquares(int[] d) {
        int s = 0;
        for (int x : d)
            s += x * x;
        return s;
    }

    public static boolean isHarshad(long n) {
        int[] d = toDigits(n);
        int s = sumDigits(d);
        if (s == 0)
            return false;
        return Math.abs(n) % s == 0;
    }

    public static int[][] digitFreq(long n) {
        int[] f = new int[10];
        for (int x : toDigits(n))
            f[x]++;
        int[][] out = new int[10][2];
        for (int i = 0; i < 10; i++) {
            out[i][0] = i;
            out[i][1] = f[i];
        }
        return out;
    }

    public static int[] reverse(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++)
            r[i] = d[d.length - 1 - i];
        return r;
    }

    public static boolean arrEqual(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;
        return true;
    }

    public static boolean isPalindrome(long n) {
        int[] d = toDigits(n);
        return arrEqual(d, reverse(d));
    }

    public static boolean isPrime(long n) {
        if (n < 2)
            return false;
        if (n % 2 == 0)
            return n == 2;
        for (long i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }

    public static boolean isNeon(int n) {
        int sq = n * n;
        int s = 0;
        while (sq > 0) {
            s += sq % 10;
            sq /= 10;
        }
        return s == n;
    }

    public static boolean isSpy(long n) {
        int s = 0, p = 1;
        for (int x : toDigits(n)) {
            s += x;
            p *= x;
        }
        return s == p;
    }

    public static boolean isAutomorphic(long n) {
        long sq = n * n;
        String a = String.valueOf(sq), b = String.valueOf(n);
        return a.endsWith(b);
    }

    public static boolean isBuzz(long n) {
        return n % 7 == 0 || Math.abs(n) % 10 == 7;
    }

    public static int sumProperDivisors(int n) {
        if (n <= 1)
            return 0;
        int s = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                s += i;
                if (i != n / i)
                    s += n / i;
            }
        }
        return s;
    }

    public static boolean isPerfect(int n) {
        return sumProperDivisors(n) == n;
    }

    public static boolean isAbundant(int n) {
        return sumProperDivisors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return sumProperDivisors(n) < n;
    }

    public static boolean isStrong(int n) {
        int t = n, s = 0;
        while (t > 0) {
            int d = t % 10;
            int f = 1;
            for (int i = 2; i <= d; i++)
                f *= i;
            s += f;
            t /= 10;
        }
        return s == n;
    }
}

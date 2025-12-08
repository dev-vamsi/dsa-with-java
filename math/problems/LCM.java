package math.problems;

public class LCM {
    private static int getGCD(int a, int b) {
        if (b == 0)
            return a;
        return getGCD(b, a % b);
    }

    private static int getLCM(int a, int b) {
        if (a == 0 && b == 0)
            return 0;
        return (a * b) / getGCD(a, b);
    }

    public static void main(String[] args) {
        int gcd = getGCD(12, 15);
        System.out.println(gcd);

        int lcm = getLCM(12, 15);
        System.out.println(lcm);
    }
}

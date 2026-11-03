// Name: Priyanshi Sharma
// Roll No: BCS2025582
// Assignment 4, Question 1

class Main {
    static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    public static void main(String[] args) {
        System.out.println("5C2 = " + nCr(5, 2));
    }
}

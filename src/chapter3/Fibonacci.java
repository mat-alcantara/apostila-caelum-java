package chapter3;

class Fibonacci {
    private int n1 = 1;
    private int n2 = 1;

    public int calculaFibonacci(int element) {
        if (element == 1 || element == 2) {
            return 1;
        }

        int newValue = n1 + n2;
        n1 = n2;
        n2 = newValue;

        return newValue;
    }
}
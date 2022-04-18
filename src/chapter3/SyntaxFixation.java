package chapter3;

class SyntaxFixation {
    public static void main(String[] args) {
        int sum = 0;
        // Print all numbers from 150 to 300
        for (int i = 150; i <= 300; i += 1) {
            System.out.println(i);
        }

        // Print the sum of 1 to 1000
        for (int i = 1; i <= 1000; i += 1) {
            sum += i;
        }

        System.out.println(sum);

        // Print all multiples of 3
        for (int i = 3; i <= 100; i += 1) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        // Print all factorials from 1 to 10
        for(int i = 1; i <= 20; i += 1) {
            long fatSum = 1;

            for (int j = i; j > 0; j -= 1) {
                fatSum *= j;
            }

            System.out.println(fatSum);
        }
    }
}
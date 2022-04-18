package chapter3;

class labeledLoop {
    public static void main(String[] args) {
        labeledExample:

        for(; true;) { // Infinite loop
            for(int i = 0; true; i--) { // Infinite loop
                System.out.println(i);

                if (i == -10) {
                    break labeledExample;
                }
            }
        }
    }
}
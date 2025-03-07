package Exceptions;

class FinallyBlockExample {
    public static void main(String[] args) {
        try {
        } catch (ArithmeticException e) {
            System.out.println("Exception caught.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

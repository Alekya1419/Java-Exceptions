package Exceptions;

class ExceptionExample {
    static void throwException() throws ArithmeticException {
        throw new ArithmeticException("Custom Arithmetic Exception");
    }

    public static void main(String[] args) {
        throwException(); 
    }
}


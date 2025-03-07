package Exceptions;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) throws MyException {
        throw new MyException("This is a user-defined exception.");
    }
}


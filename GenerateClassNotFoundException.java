package Exceptions;

class GenerateClassNotFoundException {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.unknown.UnknownClass");
    }
}

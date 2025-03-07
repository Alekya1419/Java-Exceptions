package Exceptions;

class GenerateNullPointerException {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); 
    }
}


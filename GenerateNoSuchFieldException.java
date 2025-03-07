package Exceptions;
import java.lang.reflect.*;


class SampleClass {
    int value;
}

class GenerateNoSuchFieldException {
    public static void main(String[] args) throws NoSuchFieldException {
        SampleClass obj = new SampleClass();
        @SuppressWarnings("unused")
        Field field = obj.getClass().getDeclaredField("nonExistentField");
    }
}


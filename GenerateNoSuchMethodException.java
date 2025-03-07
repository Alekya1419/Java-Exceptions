package Exceptions;
import java.lang.reflect.*;

class Sample {
    public void display() {}
}

class GenerateNoSuchMethodException {
    public static void main(String[] args) throws NoSuchMethodException {
        Sample obj = new Sample();
        @SuppressWarnings("unused")
        Method method = obj.getClass().getDeclaredMethod("nonExistentMethod"); 
}
}

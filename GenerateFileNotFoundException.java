package Exceptions;
import java.io.*;

class GenerateFileNotFoundException {
    public static void main(String[] args) throws FileNotFoundException {
        @SuppressWarnings({ "resource", "unused" })
        FileReader file = new FileReader("nonexistent.txt");
    }
}

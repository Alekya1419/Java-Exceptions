package Exceptions;
import java.io.*;

class GenerateIOException {
    public static void main(String[] args) throws IOException {
        throw new IOException("Custom IO Exception");
    }
}


package org.io.files.bytes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

    public static void main(String[] args) {
        try (
             BufferedInputStream bis = new BufferedInputStream(new FileInputStream("output.txt"))) {

            // Read data from the buffered input stream
            int data;
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


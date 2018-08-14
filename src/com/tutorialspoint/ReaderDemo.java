package com.tutorialspoint;

import java.io.*;

public class ReaderDemo {
   public static void main(String[] args) {
      String s = "Hello World";

      // create a new StringReader
      Reader reader = new StringReader(s);

      try {
         // read the first five chars
         for (int i = 0; i < 5; i++) {
            char c = (char) reader.read();
            System.out.print("" + c);
         }

         // change line
         System.out.println();

         // close the stream
         System.out.println("Closing Stream...");
         reader.close();
         System.out.println("Stream Closed.");

      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}
// <!-- Write a program that reads a text file and counts the frequency of each word in the file.
//  The program should then print out a list of the words and their frequencies, sorted in descending order by frequency.
//   This project will help you understand data structures such as hash maps and priority queues. -->
import java.io.*;
import java.util.*;

class wordFrequency {
    public static void main(String args[]) {

        try {
            BufferedReader obj = new BufferedReader(new FileReader("D:\\Text.txt"));
            HashMap<String, Integer> hm = new HashMap<>();
            String read;
            while ((read = obj.readLine()) != null) {
                String[] a = read.split(" ");

                for (int i = 0; i < a.length; i++) {
                    if (hm.containsKey(a[i])) {
                        hm.put(a[i], hm.get(a[i]) + 1);
                    } else {
                        hm.put(a[i], 1);
                    }
                }
            }
            System.out.println(hm);
        } catch (Exception e) {

            System.out.println(" ERROR " + e);

        }
    }
}

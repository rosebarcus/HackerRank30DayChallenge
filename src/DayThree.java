import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class DayThree {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        String ans = "";

        if (N % 2 == 1) {
            ans = "Weird";
        } else {
            if (N >= 2 && N <=5)
                ans = "Not Weird";
            else if (N >= 6 && N <= 20)
                ans = "Weird";
            else if (N>20)
                ans = "Not Weird";
        }
        System.out.println(ans);
    }
}
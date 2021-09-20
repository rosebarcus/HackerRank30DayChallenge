import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class DayTen {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        char [] binary = Integer.toBinaryString(n).toCharArray();
        int tempCount = 0;
        int maxCount = 0;

        for(int i = 0; i < binary.length; i++){
            tempCount = (binary[i] == '0') ? 0 : tempCount + 1;
            if (tempCount > maxCount){
                maxCount = tempCount;
            }
        }
        System.out.println(maxCount);
    }
}


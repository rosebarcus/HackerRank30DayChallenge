import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DaySix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for(int i = 0; i < tests; i++){

            String S = sc.next();
            char [] charArr = S.toCharArray();
            int j = 0;
            int k = 1;

            while(j<charArr.length){
                System.out.print(charArr[j]);
                j = j+2;
            }
            System.out.print(" ");
            while (k < charArr.length) {
                System.out.print(charArr[k]);
                k = k +2;
            }
            System.out.println();
        }
    }
}
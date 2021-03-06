//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map <String, Integer> myMap = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (myMap.containsKey(s)){
                int phone = myMap.get(s);
                System.out.println(s + "=" + phone);
            } else System.out.println("Not found");
        }
        in.close();
    }
}
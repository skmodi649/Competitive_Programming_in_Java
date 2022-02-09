package Codechef_Starters_25_Div_3;
// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;


// Remember that the class name should be "Main" and should be "public".
public class POLIN {
    public static void main(String[] args) {
        // System.in and System.out are input and output streams, respectively.
        InputStream inputStream = System.in;

        InputReader in = new InputReader(inputStream);

        int t = in.nextInt();
        for (int a = 1; a <= t; a++) {
            int n = in.nextInt();
           HashMap<Integer , Integer> X = new HashMap<>();
           HashMap<Integer , Integer> Y = new HashMap<>();
            for(int i = 1 ; i <= n ; i++){
                int x = in.nextInt();
                int y = in.nextInt();
                if(!X.containsKey(x)){
                    X.put(x , X.getOrDefault(x , 0)+1);
                }
                if(!Y.containsKey(y)){
                    Y.put(y , Y.getOrDefault(y , 0)+1);
                }
            }
            System.out.println(X.size() + Y.size());
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}



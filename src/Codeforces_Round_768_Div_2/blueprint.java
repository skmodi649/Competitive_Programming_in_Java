package Codeforces_Round_768_Div_2;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class blueprint {
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(
                    new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    } else {
                        continue;
                    }
                }
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0,
                    BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }


    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subsetsHelper(list, new ArrayList<>(), nums, 0);
        return list;
    }
    private static void subsetsHelper(List<List<Integer>> list, List<Integer> resultList, int[] nums, int start){
        list.add(new ArrayList<>(resultList));
        for(int i = start; i < nums.length; i++){
            // add element
            resultList.add(nums[i]);
            // Explore
            subsetsHelper(list, resultList, nums, i + 1);
            // remove
            resultList.remove(resultList.size() - 1);
        }
    }



    public static void main(String[] args)
            throws IOException {
        Reader s = new Reader();
        int t = s.nextInt();
        if (t >= 1 && t <= 10) {
            for (int a = 1; a <= t; a++) {
                int N = s.nextInt();
                int X = s.nextInt();
                int Y = s.nextInt();
                int[] A = new int[N];
                int[] B = new int[N];
                String stra = "";
                String strb = "" , check1 = "" , check2 = "";
                for(int i = 0 ; i < N ; i++)
                    A[i] = s.nextInt();
                for(int j = 0 ; j < N ; j++)
                    B[j] = s.nextInt();

                // Generating the subarrays
                List<Integer> list = new ArrayList<>();
                for(int i = 0 ; i < N ; i++){
                    stra = stra + A[i];
                    list.add(A[i]);
                    check1 = check2 + (A[i] + X);
                    check2 = check2 + (A[i] + Y);
                    strb = strb + B[i];
                }
                if(strb.equals(check1) || strb.equals(check2)){
                    System.out.println("Yes");
                }
                else{
                    List<List<Integer>> subsets = subsets(A);
                    boolean res = false;
                    for (List<Integer> subset: subsets) {
                        List<Integer> index = new ArrayList<>();
                        for (Integer integer : subset) {
                            int adds = list.indexOf(integer);
                            if(!index.contains(adds))
                            index.add(list.indexOf(integer));
                        }
                        String gaya = "";
                        for(int i = 0 ; i < N ; i++){
                            if(index.contains(i))
                                gaya = gaya + (list.get(i) + X);
                            else
                                gaya = gaya + (list.get(i) + Y);
                        }
                        if(gaya.equals(strb)){
                            res = true;
                            break;
                        }
                    }
                    if(res)
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }
            }
        }
    }
}


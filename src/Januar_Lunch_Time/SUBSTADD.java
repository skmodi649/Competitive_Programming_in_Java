package Januar_Lunch_Time;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SUBSTADD {
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
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        if (t >= 1 && t <= 10) {
            for (int a = 1; a <= t; a++) {
                int N = Integer.parseInt(br.readLine());
                int X = Integer.parseInt(br.readLine());
                int Y = Integer.parseInt(br.readLine());
                int[] A = new int[N];
                int[] B = new int[N];
                String stra = "";
                String strb = "" , check1 = "" , check2 = "";
                for(int i = 0 ; i < N ; i++)
                    A[i] = Integer.parseInt(br.readLine());
                for(int j = 0 ; j < N ; j++)
                    B[j] = Integer.parseInt(br.readLine());

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

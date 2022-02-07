import java.util.*;
import java.lang.*;
class Main {
    public static int minSteps(ArrayList<Integer> a, int n)
    {

        // Stores the prefix sum of the array
        int []prefix_sum = new int[n];
        prefix_sum[0] = a.get(0);

        // Calculate the prefix sum array
        for(int i = 1; i < n; i++)
            prefix_sum[i] += prefix_sum[i - 1] + a.get(i);

        // Stores the maximum number of subarrays
        // into which the array can be split
        int mx = -1;

        // Iterate over all possible sums
        for(int subgroupsum : prefix_sum)
        {
            int sum = 0;
            int i = 0;
            int grp_count = 0;

            // Traverse the array
            while (i < n)
            {
                sum += a.get(i);

                // If the sum is equal to
                // the current prefix sum
                if (sum == subgroupsum)
                {

                    // Increment count
                    // of groups by 1
                    grp_count += 1;
                    sum = 0;
                }

                // Otherwise discard
                // this subgroup sum
                else if(sum > subgroupsum)
                {
                    grp_count = -1;
                    break;
                }
                i += 1;
            }

            // Update the maximum
            // this of subarrays
            if (grp_count > mx)
                mx = grp_count;
        }

        // Return the minimum
        // number of operations
        return n - mx;
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int a = 1; a <= t; a++) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                for(int i = 0 ; i < n ; i++){
                    if(arr[i] < 0){
                        arr[i] = 0;
                        arr[i+1] = arr[i]--;
                    }
                }
                for(int i = 0 ; i < n ; i++){
                    list.add(arr[i]);
                }
                System.out.println(minSteps(list , n));
            }
        }
        catch (Exception e){
            return;
        }
    }
}

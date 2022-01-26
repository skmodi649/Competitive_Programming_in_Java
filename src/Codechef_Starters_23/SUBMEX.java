package Codechef_Starters_23;

import java.util.Scanner;

public class SUBMEX {
    static int MAXN = 100001;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t >= 1 && t <= 1200) {
            for (int a = 1; a <= t; a++) {
                int N = sc.nextInt();
                int K = sc.nextInt();
                int X = sc.nextInt();
                int[] arr = new int[N];
                for(int i = 0 ; i < N ; i++){
                    arr[i] = i;
                }
                if(N == K){
                    int hash[] = new int[MAXN];
                    for (int i = 0; i < N; i++)
                    {
                        hash[i] = 0;
                    }

                    // Mark all values 1, if
                    // present
                    for (int i = 0; i < N; i++)
                    {
                        hash[arr[i]] = 1;
                    }

                    // Initialize variable to
                    // store MEX
                    int MexOfArr = 0 ;

                    // Find MEX of arr[]
                    for (int i = 1; i < MAXN; i++)
                    {
                        if (hash[i] == 0)
                        {
                            MexOfArr = i;
                            break;
                        }
                    }

                    // Stores MEX for all
                    // indices
                    int B[] = new int[N];

                    // Traverse the given array
                    for (int i = 0; i < N; i++)
                    {
                        // Update MEX
                        if (arr[i] < MexOfArr)
                            B[i] = arr[i];

                            // MEX default
                        else
                            B[i] = MexOfArr;
                    }

                    // Print the array B
                    for (int i = 0; i < N; i++)
                        System.out.print(B[i] + " ");
                }
                else{
                    int hash[] = new int[MAXN];
                    for (int i = 0; i < K; i++)
                    {
                        hash[i] = 0;
                    }

                    // Mark all values 1, if
                    // present
                    for (int i = 0; i < K; i++)
                    {
                        hash[arr[i]] = 1;
                    }

                    // Initialize variable to
                    // store MEX
                    int MexOfArr = 0 ;

                    // Find MEX of arr[]
                    for (int i = 1; i < MAXN; i++)
                    {
                        if (hash[i] == 0)
                        {
                            MexOfArr = i;
                            break;
                        }
                    }

                    // Stores MEX for all
                    // indices
                    int B[] = new int[K];

                    // Traverse the given array
                    for (int i = 0; i < K; i++)
                    {
                        // Update MEX
                        if (arr[i] < MexOfArr)
                            B[i] = arr[i];

                            // MEX default
                        else
                            B[i] = MexOfArr;
                    }

                    // Print the array B
                    for (int i = 0; i < K; i++)
                        System.out.print(B[i] + " ");
                }
                }
            }
        }
    }

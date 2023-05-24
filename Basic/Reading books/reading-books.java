//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String arr[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(arr[0]);
            long K = Long.parseLong(arr[1]);
            String a1[] = in.readLine().trim().split("\\s+");
            String a2[] = in.readLine().trim().split("\\s+");
            long A[] = new long[N];
            long B[] = new long[N];
            for(int i = 0;i < N;i++){
                A[i] = Long.parseLong(a1[i]);
                B[i] = Long.parseLong(a2[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxPoint(N, K, A, B));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static long maxPoint(int N, long K, long A[], long B[])
    {
        // code here
        long max=0;
        long times;
        long points;
        for(int i=0; i<N; i++){
            times= K/A[i];
            points=times*B[i];
            if(points>max){
                max=points;
            }
        }
        return max;
    }
}
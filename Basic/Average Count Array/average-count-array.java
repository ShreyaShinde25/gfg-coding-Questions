//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int X = Integer.parseInt(element[1]);
		    int arr [] = new int[N];
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<N;i++){
	            arr[i] = Integer.parseInt(elements[i]);    
	        }
	        
		    Solution obj = new Solution();
		    ArrayList<Integer> ans;
		    ans = obj.countArray(arr, N, X);
    	    for(int i: ans)
    	        System.out.print(i + " ");
    	    System.out.println();
    	
		}
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution{
    
   
    // Function for finding maximum and value pair
    public static ArrayList<Integer> countArray (int arr[], int n, int x) {
        int count=0;
        int avg=0;
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            avg= (arr[i]+x)/2;
            count=0;
            for (int j=0; j<n; j++){
                if(avg==arr[j]){
                    count++;
                }
            }
            a.add(count);
        }
        
        return a;

    }
    
    
}

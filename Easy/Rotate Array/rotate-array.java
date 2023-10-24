//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter out=new PrintWriter(System.out);
        //taking testcases
        int t = Integer.parseInt(br.readLine()); 
    	for(int i=0;i<t;i++)
    	{
            String str=br.readLine();
    		String[] starr=str.split(" ");
    		
    		//input n and d
    	    int n=Integer.parseInt(starr[0]);
    		int d= Integer.parseInt(starr[1]);
    		
            int[] arr=new int[n];
    		String str1=br.readLine();
    		String[] starr1=str1.split(" ");
    		
    		//inserting elements in the array
    		for(int j=0;j<n;j++)
    		{
    		  arr[j]= Integer.parseInt(starr1[j]);
    		}
    		
    		//calling rotateArr() function
            new Solution().rotateArr(arr, d, n);
    		StringBuffer sb=new StringBuffer();
    		
    		//printing the elements of the array
            for(int t1=0;t1<n;t1++)
                sb.append(arr[t1]+" ");
            out.println(sb);
         }
         out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {   int i=0;
        int j=n-1;
        int temp=0;
        d=d%n;
        // add your code here
        while(i<j){
             temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    int fh_i= 0;
    int fh_j=n-d-1;
    int sh_i=n-d;
    int sh_j=n-1;
    while(fh_i<fh_j){
         temp=arr[fh_i];
        arr[fh_i]=arr[fh_j];
        arr[fh_j]=temp;
        fh_i++;
        fh_j--;
    } 
    while(sh_i<sh_j){
         temp=arr[sh_i];
        arr[sh_i]=arr[sh_j];
        arr[sh_j]=temp;
        sh_i++;
        sh_j--;
    }
    }
}
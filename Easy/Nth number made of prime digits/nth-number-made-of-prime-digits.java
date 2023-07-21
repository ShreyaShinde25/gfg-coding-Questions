//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  Solution ob = new Solution();
		  System.out.println(ob.primeDigits(n));
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find nth number made of only prime digits.
    public static int primeDigits(int n)
    {
        int number=1;
        int count=0;
        int answer=0;
        int  d_check=0;
        while(count<n){
            number+=1;
            String s=String.valueOf(number);
            if (s.contains("1") || s.contains("0")){
                continue;
            }
            int num=number;
            boolean flag=true;
            while(num>0){  
              int d=num%10;
              d_check=0;
            for(int k=2; k<=d/2; k++){
                if(d%k==0){
                    flag=false;
                    d_check=0;
                    break;
                }
            }
            if(flag==true ){
                d_check=1;
            }
            num=num/10;
        }
        if(d_check==1){
            count++;
        }}
        return number;
    }
}

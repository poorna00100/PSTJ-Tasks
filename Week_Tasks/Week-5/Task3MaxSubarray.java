/*
 * INPUT:
 * 6
 * 2 -1 2 3 4 -5
 *
 * OUTPUT:
 * Maximum Subarray Sum: 10
 * Maximum Subsequence Sum: 11
 *
 * Find the maximum sum of a non-empty contiguous subarray
 * and the maximum sum of a non-empty subsequence.
 */
package Week5;
import java.util.*;
class Task3MaxSubarray{
    public int[] maxSubarray(int[] arr){
        int current=arr[0];
        int maxSub=arr[0];
        int maxSubsequence=arr[0];
        for(int i=1;i<arr.length;i++){
            current=Math.max(arr[i],current+arr[i]);
            maxSub=Math.max(maxSub,current);
            if(arr[i]>0){
                maxSubsequence+=arr[i];
            }
        }
        if(maxSubsequence<0){
            maxSubsequence=maxSub;
        }
        return new int[]{maxSub,maxSubsequence};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Task3MaxSubarray obj=new Task3MaxSubarray();
        int[] result=obj.maxSubarray(arr);
        System.out.println("Maximum Subarray Sum: "+result[0]);
        System.out.println("Maximum Subsequence Sum: "+result[1]);
        sc.close();
    }
}
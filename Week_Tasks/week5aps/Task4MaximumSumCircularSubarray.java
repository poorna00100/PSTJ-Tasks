/*
 * INPUT:
 * 3
 * 5 -3 5
 *
 * OUTPUT:
 * Maximum Circular Subarray Sum: 10
 *
 * Given a circular integer array, find the maximum possible
 * sum of a non-empty subarray.
 */
package Week5;
import java.util.*;
class Task4MaximumSumCircularSubarray{
    public int maxSubarraySumCircular(int[] nums){
        int total=0;
        int currentMax=nums[0];
        int maxSum=nums[0];
        int currentMin=nums[0];
        int minSum=nums[0];
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            if(i>0){
                currentMax=Math.max(nums[i],currentMax+nums[i]);
                maxSum=Math.max(maxSum,currentMax);
                currentMin=Math.min(nums[i],currentMin+nums[i]);
                minSum=Math.min(minSum,currentMin);
            }
        }
        if(maxSum<0){
            return maxSum;
        }
        return Math.max(maxSum,total-minSum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Task4MaximumSumCircularSubarray obj=new Task4MaximumSumCircularSubarray();
        int result=obj.maxSubarraySumCircular(nums);
        System.out.println("Maximum Circular Subarray Sum: "+result);
        sc.close();
    }
}
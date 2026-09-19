/*
 * INPUT:
 * 5
 * 3 30 34 5 9
 *
 * OUTPUT:
 * Largest Number: 9534330
 *
 * Given an array of non-negative integers, arrange them
 * to form the largest possible number.
 */
package Week3;
import java.util.*;
class Task7LargestNumber{
    public String largestNumber(int[] nums){
        String[] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        if(arr[0].equals("0")){
            return "0";
        }
        StringBuilder result=new StringBuilder();
        for(String s:arr){
            result.append(s);
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Task7LargestNumber obj=new Task7LargestNumber();
        String result=obj.largestNumber(nums);
        System.out.println("Largest Number: "+result);
        sc.close();
    }
}
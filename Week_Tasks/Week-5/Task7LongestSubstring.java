/*
 * INPUT:
 * abcabcbb
 *
 * OUTPUT:
 * Longest Substring Length: 3
 *
 * Given a string, find the length of the longest substring
 * that contains no repeated characters.
 */
package Week5;
import java.util.*;
class Task7LongestSubstring{
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();
        Task7LongestSubstring obj=new Task7LongestSubstring();
        int result=obj.lengthOfLongestSubstring(s);
        System.out.println("Longest Substring Length: "+result);
        sc.close();
    }
}
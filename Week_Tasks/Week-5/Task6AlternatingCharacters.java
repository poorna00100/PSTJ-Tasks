/*
 * INPUT:
 * 5
 * AAAA
 * BBBBB
 * ABABABAB
 * BABABA
 * AAABBB
 *
 * OUTPUT:
 * 3
 * 4
 * 0
 * 0
 * 4
 *
 * Given a string containing A and B, find the minimum number
 * of deletions required so that no two adjacent characters match.
 */
package Week5;
import java.util.*;
class Task6AlternatingCharacters{
    public int alternatingCharacters(String s){
        int count=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            Task6AlternatingCharacters obj=new Task6AlternatingCharacters();
            int result=obj.alternatingCharacters(s);
            System.out.println(result);
        }
        sc.close();
    }
}
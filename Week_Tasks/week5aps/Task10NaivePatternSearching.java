/*
 * INPUT:
 * geeksforgeeks
 * geeks
 *
 * OUTPUT:
 * Pattern found at index: 0
 * Pattern found at index: 8
 *
 * Given a text and a pattern, find all positions where
 * the pattern occurs in the text using the naive approach.
 */
package Week5;
import java.util.*;
class Task10NaivePatternSearching{
    public List<Integer> search(String text,String pattern){
        List<Integer> result=new ArrayList<>();
        int n=text.length();
        int m=pattern.length();
        for(int i=0;i<=n-m;i++){
            int j=0;
            while(j<m&&text.charAt(i+j)==pattern.charAt(j)){
                j++;
            }
            if(j==m){
                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();
        System.out.print("Enter pattern: ");
        String pattern=sc.nextLine();
        Task10NaivePatternSearching obj=new Task10NaivePatternSearching();
        List<Integer> result=obj.search(text,pattern);
        if(result.isEmpty()){
            System.out.println("Pattern not found");
        }else{
            for(int index:result){
                System.out.println("Pattern found at index: "+index);
            }
        }
        sc.close();
    }
}
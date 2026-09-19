/*
 * INPUT:
 * 4
 * mass as hero superhero
 *
 * OUTPUT:
 * Matching Strings: [as, hero]
 *
 * Given an array of strings, return every string that is
 * a substring of another string in the array.
 */
package Week5;
import java.util.*;
class Task9StringMatching{
    public List<String> stringMatching(String[] words){
        List<String> result=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j&&words[j].contains(words[i])){
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n=sc.nextInt();
        String[] words=new String[n];
        System.out.println("Enter words:");
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        Task9StringMatching obj=new Task9StringMatching();
        List<String> result=obj.stringMatching(words);
        System.out.println("Matching Strings: "+result);
        sc.close();
    }
}
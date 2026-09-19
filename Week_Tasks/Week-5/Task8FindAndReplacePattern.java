/*
 * INPUT:
 * 6
 * abc deq mee aqq dkd ccc
 * abb
 *
 * OUTPUT:
 * Matching Words: [mee, aqq]
 *
 * Given a list of words and a pattern, return the words
 * that match the same character pattern.
 */
package Week5;
import java.util.*;
class Task8FindAndReplacePattern{
    public List<String> findAndReplacePattern(String[] words,String pattern){
        List<String> result=new ArrayList<>();
        for(String word:words){
            if(matches(word,pattern)){
                result.add(word);
            }
        }
        return result;
    }
    public boolean matches(String word,String pattern){
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char w=word.charAt(i);
            char p=pattern.charAt(i);
            if(map1.containsKey(w)&&map1.get(w)!=p){
                return false;
            }
            if(map2.containsKey(p)&&map2.get(p)!=w){
                return false;
            }
            map1.put(w,p);
            map2.put(p,w);
        }
        return true;
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
        System.out.print("Enter pattern: ");
        String pattern=sc.next();
        Task8FindAndReplacePattern obj=new Task8FindAndReplacePattern();
        List<String> result=obj.findAndReplacePattern(words,pattern);
        System.out.println("Matching Words: "+result);
        sc.close();
    }
}
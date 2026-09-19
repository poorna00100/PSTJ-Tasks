/*
 * INPUT:
 * 5
 * Mary John Emma Alice Bob
 * 180 165 170 160 175
 *
 * OUTPUT:
 * Sorted People:
 * Mary
 * Bob
 * Emma
 * John
 * Alice
 *
 * Given names and heights, sort people from tallest to shortest.
 */
package Week3;
import java.util.*;
class Task9SortPeople{
    public String[] sortPeople(String[] names,int[] heights){
        Integer[] index=new Integer[names.length];
        for(int i=0;i<names.length;i++){
            index[i]=i;
        }
        Arrays.sort(index,(a,b)->Integer.compare(heights[b],heights[a]));
        String[] result=new String[names.length];
        for(int i=0;i<names.length;i++){
            result[i]=names[index[i]];
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int n=sc.nextInt();
        String[] names=new String[n];
        int[] heights=new int[n];
        System.out.println("Enter names:");
        for(int i=0;i<n;i++){
            names[i]=sc.next();
        }
        System.out.println("Enter heights:");
        for(int i=0;i<n;i++){
            heights[i]=sc.nextInt();
        }
        Task9SortPeople obj=new Task9SortPeople();
        String[] result=obj.sortPeople(names,heights);
        System.out.println("Sorted People:");
        for(String name:result){
            System.out.println(name);
        }
        sc.close();
    }
}
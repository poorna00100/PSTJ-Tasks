/*
 * INPUT:
 * 5
 * 1 2 1 3 2
 * 3 2
 *
 * OUTPUT:
 * Number of Ways: 2
 *
 * Lily wants to divide a chocolate bar into a contiguous segment.
 * The segment length must equal Ron's birth month m and
 * the segment sum must equal Ron's birth day d.
 */
package Week5;
import java.util.*;
class Task2BirthdayBar{
    public int birthday(List<Integer> s,int d,int m){
        int count=0;
        for(int i=0;i<=s.size()-m;i++){
            int sum=0;
            for(int j=i;j<i+m;j++){
                sum+=s.get(j);
            }
            if(sum==d){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of chocolate squares: ");
        int n=sc.nextInt();
        List<Integer> s=new ArrayList<>();
        System.out.println("Enter chocolate values:");
        for(int i=0;i<n;i++){
            s.add(sc.nextInt());
        }
        System.out.print("Enter birth day: ");
        int d=sc.nextInt();
        System.out.print("Enter birth month: ");
        int m=sc.nextInt();
        Task2BirthdayBar obj=new Task2BirthdayBar();
        int result=obj.birthday(s,d,m);
        System.out.println("Number of Ways: "+result);
        sc.close();
    }
}
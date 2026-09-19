/*
 * INPUT:
 * 5
 * 5 41 77 74 22 44
 * 1 2
 * 1 5
 *
 * OUTPUT:
 * 41
 * 44
 *
 * Create an ArrayList and access elements using queries.
 */
package Week3;
import java.util.*;
class Task6ArrayList{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<d;j++){
                row.add(sc.nextInt());
            }
            list.add(row);
        }
        System.out.print("Enter number of queries: ");
        int q=sc.nextInt();
        System.out.println("Query Results:");
        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>=1&&x<=list.size()&&y>=1&&y<=list.get(x-1).size()){
                System.out.println(list.get(x-1).get(y-1));
            }else{
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
/*
 * INPUT:
 * 3
 * Smith 20
 * Jones 15
 * Brown 20
 *
 * OUTPUT:
 * Brown 20
 * Smith 20
 * Jones 15
 *
 * Sort players according to their score.
 * If scores are equal, sort names alphabetically.
 */
package Week3;
import java.util.*;
class Task8Comparator{
    static class Player{
        String name;
        int score;
        Player(String name,int score){
            this.name=name;
            this.score=score;
        }
    }
    static class Checker implements Comparator<Player>{
        public int compare(Player a,Player b){
            if(a.score!=b.score){
                return Integer.compare(b.score,a.score);
            }
            return a.name.compareTo(b.name);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int n=sc.nextInt();
        Player[] players=new Player[n];
        System.out.println("Enter name and score:");
        for(int i=0;i<n;i++){
            String name=sc.next();
            int score=sc.nextInt();
            players[i]=new Player(name,score);
        }
        Arrays.sort(players,new Checker());
        System.out.println("Sorted Players:");
        for(Player player:players){
            System.out.println(player.name+" "+player.score);
        }
        sc.close();
    }
}
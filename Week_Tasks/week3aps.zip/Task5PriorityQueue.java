/*
 * INPUT:
 * 5
 * ENTER John 3.75 50
 * ENTER Mark 3.8 24
 * ENTER Shafa 3.7 35
 * SERVED
 * SERVED
 *
 * OUTPUT:
 * John
 * Shafa
 *
 * Demonstrate Java PriorityQueue using Student objects.
 */
package Week3;
import java.util.*;
class Task5PriorityQueue{
    static class Student{
        int id;
        String name;
        double cgpa;
        Student(int id,String name,double cgpa){
            this.id=id;
            this.name=name;
            this.cgpa=cgpa;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of events: ");
        int n=sc.nextInt();
        PriorityQueue<Student> pq=new PriorityQueue<>(
            (a,b)->{
                if(a.cgpa!=b.cgpa){
                    return Double.compare(b.cgpa,a.cgpa);
                }
                if(!a.name.equals(b.name)){
                    return a.name.compareTo(b.name);
                }
                return Integer.compare(a.id,b.id);
            }
        );
        System.out.println("Enter events:");
        for(int i=0;i<n;i++){
            String event=sc.next();
            if(event.equals("ENTER")){
                String name=sc.next();
                double cgpa=sc.nextDouble();
                int id=sc.nextInt();
                pq.add(new Student(id,name,cgpa));
            }else if(event.equals("SERVED")){
                if(!pq.isEmpty()){
                    pq.poll();
                }
            }
        }
        if(pq.isEmpty()){
            System.out.println("EMPTY");
        }else{
            ArrayList<Student> result=new ArrayList<>(pq);
            result.sort(
                (a,b)->{
                    if(a.cgpa!=b.cgpa){
                        return Double.compare(b.cgpa,a.cgpa);
                    }
                    if(!a.name.equals(b.name)){
                        return a.name.compareTo(b.name);
                    }
                    return Integer.compare(a.id,b.id);
                }
            );
            for(Student student:result){
                System.out.println(student.name);
            }
        }
        sc.close();
    }
}
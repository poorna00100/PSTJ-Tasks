/*
 * INPUT:
 *  -042
 *
 * OUTPUT:
 * Integer: -42
 *
 * Convert a string into a 32-bit signed integer.
 * Ignore leading spaces, handle + or -, read digits,
 * stop at the first non-digit, and handle overflow.
 */
package Week5;
import java.util.*;
class Task5StringToInteger{
    public int myAtoi(String s){
        int i=0;
        int sign=1;
        long result=0;
        while(i<s.length()&&s.charAt(i)==' '){
            i++;
        }
        if(i<s.length()&&(s.charAt(i)=='+'||s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        while(i<s.length()&&Character.isDigit(s.charAt(i))){
            result=result*10+(s.charAt(i)-'0');
            if(sign==1&&result>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign==-1&&-result<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(result*sign);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();
        Task5StringToInteger obj=new Task5StringToInteger();
        int result=obj.myAtoi(s);
        System.out.println("Integer: "+result);
        sc.close();
    }
}
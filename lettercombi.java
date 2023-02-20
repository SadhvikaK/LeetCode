/*Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"] */
import java.util.*;
class lettercombi{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Integer,String> hs=new HashMap<>();
        hs.put(2,"abc");
        hs.put(3,"def");
        hs.put(4,"ghi");
        hs.put(5,"jkl");
        hs.put(6,"mno");
        hs.put(7,"pqrs");
        hs.put(8,"tuv");
        hs.put(9,"wxyz");
    }
    public static void phone(String num){
            if(num.isEmpty()){
                System.out.print("");
            }
            char ch=num.charAt(0);
            String res=num.substring(1);
                

        }

    
}
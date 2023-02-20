import java.util.*;
public class stupid1 {
    static void Colours(String str){
        int ct=0;
        for(int i=1;i<str.length();i+=2){
            Set <Character> set=new HashSet<>();
            for(int j=i;j<str.length();j+=2){
                if(str.charAt(i)==str.charAt(j)){
                    set.add(str.charAt(j-1));
                }
            }
            if(set.size()==3){
                ct++;
            }
        }
        System.out.println(ct);
    }
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    Colours(str);
}
}

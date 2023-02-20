import java.util.*;
class romantoint{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> hs=new HashMap<>();
        hs.put('I',1);
        hs.put('V',5);
        hs.put('X',10);
        hs.put('L',50);
        hs.put('C',100);
        hs.put('D',500);
        hs.put('M',1000);
        int n=s.length();
        int num=hs.get(s.charAt(n-1));
        for(int i=n-2;i>=0;i--){
            if(hs.get(s.charAt(i))>=hs.get(s.charAt(i+1))){
                num+=hs.get(s.charAt(i));
            }
            else{
                num-=hs.get(s.charAt(i));
            }
    }
    System.out.println(num);
}
}
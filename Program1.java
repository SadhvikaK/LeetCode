import java.util.*;
class Program1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        HashSet<Character> hs=new HashSet<>();
        ArrayList<Integer> al=new ArrayList<>();
        int i=1;
        while(i<=num){
            if(i<=10){
            //String st=String.valueOf(i);
            al.add(i);
            i++;
            }
            else{
                String st=String.valueOf(i);
                for(int j=0;j<st.length();j++){
                    hs.add(st.charAt(j));
                }
                if(st.length()==hs.size()){
                    al.add(Integer.parseInt(st));
                }
                hs.clear();
                i++;
            }
        }
        System.out.println(al);
    }
}
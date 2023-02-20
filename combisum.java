/*Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
] */
import java.util.*;
class combisum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        for(int i=0;i<num;i++){
            al.add(sc.nextInt());
        }
        int target=sc.nextInt();
        for(int i=0;i<num;i++){
            if(target>al.get(i)){
                al1.add(al.get(i));
            }
        }
        Collections.sort(al1);
        int len=al1.size();
        int bef=len-2;
        int sum=0;
        int end=len-1;
        while(sum!=target){
            while(al.get(end)+al.get(bef)>target){
                bef--;
            }
            if(al.get(end)+al.get(bef)==target){
                al2.add(end);
                al2.get(bef);
            }
            end--;
        }       
        System.out.println(al2);
        }
}
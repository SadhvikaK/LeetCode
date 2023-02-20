/*Input:
S = { "the", "quick", "brown", "fox", 
     "quick"}
word1 = "the"
word2 = "fox"
Output: 3
Explanation: Minimum distance between the 
words "the" and "fox" is 3 */
import java.util.*;
class closest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<String> al=new ArrayList<>();
        ArrayList<Integer> al1=new ArrayList<>();
        for(int i=0;i<num;i++){
            al.add(sc.next());
        }
        String str1=sc.next();
        String str2=sc.next();
        for(int i=0;i<num;i++){
            if(al.get(i).contains(str1)){
                al1.add(i);
            }
        }
    }
}
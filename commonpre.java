import java.util.*;
class commonpre{
    public static String cpr(String s[],int l,int h){
        if(l==h){
            return s[l];
        }
        if(h>l){
            int mid=(l+h)/2;
            
        }
    }
    public static String cprUtil(String s1, String s2)
    {
        String res="";
        int n1=s1.length();
        int n2=s2.length();
        for(int i=0;i<n1-1;i++)
        {
            for(int j=0;j<n2-1;j++)
            {
                if(s1.charAt(i)!=s2.charAt(j))
                    break;
                else
                    res+=s1.charAt(i);    
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1[] = {"flower","flight","float","flow"};
        System.out.println(cpr(s1,0,s1.length-1));
    }
}
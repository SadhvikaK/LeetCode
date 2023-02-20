import java.util.*;
class binary{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
        int j=0;
        int sum=0;
        for(int i=str.length()-1;i>=0;i--){
            double res=Math.pow(2,j);
            int add=((int)res)*(str.charAt(i)-'0');
            sum+=add;
            j++;
        }
        int k=0;
        int sum1=0;
        for(int i=str1.length()-1;i>=0;i--){
            double res1=Math.pow(2,k);
            int add1=((int)res1)*(str1.charAt(i)-'0');
            sum1+=add1;
            k++;
        }
        int tot=sum+sum1;
        String app="";
        while(tot!=0){
            if(tot%2==0){
                app+=0;
            }
            else if(tot%2==1){
                app+=1;
            }
            tot=tot/2;
        }
        int len=app.length();
        while(len>0){
            System.out.print(app.charAt(len-1));
            len--;
        }
        System.out.println(tot);
    }
}
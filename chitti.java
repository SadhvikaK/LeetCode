import java.util.*;
class chitti{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int num=sc.nextInt();
        String[] arr=new String[num-1];
        StringBuilder st=new StringBuilder();
        int count=1;
        int j=0;
        while(num>1){
            for(int i=0;i<str.length()-1;i++){
                if(str.charAt(i)!=str.charAt(i+1)){
                    st.append(count);
                    count=1;
                    st.append(str.charAt(i));
                }
                else{
                    count++;
                    /*while(res.charAt(i)!=res.charAt(i+1)){
                        count++;
                        break;
                    }*/
                    //st.append(count);
                    //st.append(res.charAt(i));
                 } 
            }
            int ch=str.length()-1;
            if(str.charAt(ch)!=str.charAt(ch-1)){
                st.append(count);
                count=1;
                st.append(str.charAt(ch));
            }
            else{
                count++;
                st.append(count);
                st.append(str.charAt(ch));
            }
            num--;
            str=st.toString();

        }
        System.out.println(str);
        }
    }

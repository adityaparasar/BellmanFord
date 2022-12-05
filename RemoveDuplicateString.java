public class RemoveDuplicateString {
    public static void removeDuplicate(int n,boolean check[],String str,StringBuilder newstr){
        if(n==str.length()){
            System.out.println(newstr);
            return;
        }
        char curr=str.charAt(n);
        if(check[curr-'a']==true){
            removeDuplicate(n+1, check, str, newstr);
        }else{
            check[curr-'a']=true;
            removeDuplicate(n+1, check, str, newstr.append(curr));
        }
       }
    
       public static void main(String args[]){
        String str="appnnacollege";
        removeDuplicate(0, new boolean[25], str,new StringBuilder(""));
       }
}

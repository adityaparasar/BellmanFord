import java.util.*;
public class JavaBasic{
    public static boolean isValid(String str){
        Stack<Character> s= new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
              //opening case
            if(ch=='{'||ch=='['||ch=='('){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='{'&&ch=='}')
                ||(s.peek()=='['&&ch==']')
                ||(s.peek()=='('&&ch==')')){
                    s.pop();
                    
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isDublicate(String str){
        Stack<Character> s= new Stack<>();

        for(int i=0; i<str.length();i++){
            int count=0;
            char ch= str.charAt(i);
            //closing bracket
            if(ch==')'){
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{

                }
            }else{
                //opening bracket
                s.push(ch);
            }
        }
        return false;
    }
     public static void main(String args[]){
        String str= "({})[]";
        String str2= "((a+b))";
        System.out.println(isValid(str));
        System.err.println(isDublicate(str2));
     }
}
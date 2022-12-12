public class SubsetOfString{

       public static void subset(String str, String newstr, int i){
              if(i==str.length()){
                     if(newstr.length()==0){
                            System.out.println("null");
                     }else{
                            System.out.println(newstr);
                     }
                     return;
              }
              char curr= str.charAt(i);
              //for yes
              subset(str, newstr+curr, i+1);
              //for no
              subset(str, newstr, i+1);
              
       }
       public static void main(String args[]){
             String str= "abc";
             subset(str,"", 0);
       }
}
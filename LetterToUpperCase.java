
public class LetterToUpperCase {
    public static String lettertouppercase(String str){
        StringBuilder sr= new StringBuilder("");
        sr.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sr.append(str.charAt(i));
                i++;
                sr.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sr.append(str.charAt(i));
            }
        }return sr.toString();
    }
    public static void main (String args[]){
        String str="hello my name is aditya.";
        System.out.println(lettertouppercase(str));
    }
}


public class StringCompression {
    public static String StringCommpression(String str){
        StringBuilder sr= new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sr.append(str.charAt(i));
            if(count>1){
                sr.append(count.toString());
            }
        }
        return sr.toString();
    }
    public static void main(String args[]){
        String str= "aaabbccccd";
        System.out.println(StringCommpression(str));
    }
        
}

public class BInarStringProblem {
    public static void binaryString(int n,char lastdigit,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        binaryString(n-1, '0', str+'0');
        if(lastdigit=='0'){
            binaryString(n-1, '1', str+'1');
        }
       }
    
       public static void main(String args[]){
        binaryString(3, '0', "");
       }
}

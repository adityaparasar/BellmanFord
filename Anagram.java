import java.util.*;

public class Anagram {
    public static void Anagrams(String str1, String str2){
        //conver to lowe case
        str1= str1.toLowerCase();
        str2= str2.toLowerCase();

        if(str1.length()==str2.length()){
            //convert string to array
            char[] arr1= str1.toCharArray();
            char[] arr2= str2.toCharArray();
            //short the array
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            //array is equal or not equa
            boolean result= Arrays.equals(arr1,arr2);
            if(result){
                System.out.println(str1+ " and " +str2+" are anagrams of each other.");
            }else{
                System.out.println(str1+ " and " +str2+" pare not anagrams of each other.");
            }
        }else{
            System.out.println(str1+ " and " +str2+" are not anagrams of each other.");
        }


    }
   public static void main(String args[]){
    String str1= "race";
    String str2= "care";
    Anagrams(str1, str2);
   }
}
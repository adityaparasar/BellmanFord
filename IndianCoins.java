import java.util.*;
public class MinimumDiff {
    public static void main(String args[]){
        Integer coin[]= {1,2,5,10,20,50,100,500,2000};

        int amount= 590;
        Arrays.sort(coin, Comparator.reverseOrder());

        ArrayList<Integer> ans= new ArrayList<>();
        int count=0;

        for(int i=0; i<coin.length; i++){
            if(coin[i] <=amount){
                while(coin[i] <=amount){
                    amount-=coin[i];
                    ans.add(coin[i]);
                    count++;
                }
            }
        }

        System.out.println("Coins required is "+count);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+"+");
        }
    }

}

import java.util.ArrayList;

public class TWOpointer {
    public static boolean pairsum(ArrayList<Integer> list){
        for(int i=0; i<list.size(); i++){
            int lp=0;
            int rp= list.size()-1;
            int target= list.get(i);

            while(lp != rp){
                if(list.get(lp)+list.get(rp)== target){
                    return true;
                }

                if(list.get(lp)+list.get(rp)< target){
                    lp++;
                }else{
                    rp--;
                }

            }
        }
        return false;
    }

    public static void main (String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(13);

        System.out.println(pairsum(list));
    }
}

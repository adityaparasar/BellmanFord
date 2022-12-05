public class TowerOFHanoi {
    public static void towerOfHanoi(int n, char src,char dst,char helper){
        if(n==1){
            System.out.println("Move "+n+" from "+src+" to "+dst);
            return;
        }
        towerOfHanoi(n-1, src, helper, dst);
        System.out.println("move "+n+" from "+src+" to "+dst);
        towerOfHanoi(n-1, helper, dst, src);
    }

    public static void main(String args[]){
        towerOfHanoi(8, 'A', 'C', 'B');
    }
    
}

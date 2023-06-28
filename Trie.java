import java.util.concurrent.Flow.Subscription;

public class Trie {
    static class Node{
        Node children[]=new Node[26];
        boolean eow= false;

        Node(){
            for(int i=0; i<children.length; i++){
                children[i]= null;
            }
        }
    }

    public static Node root= new Node();

    public static void insert(String word){
        Node curr= root;
        for(int lvl=0; lvl<word.length(); lvl++){
            int idx= word.charAt(lvl)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]= new Node();
            }
            curr= curr.children[idx];
        }
        curr.eow= true;
    }

    public static boolean search(String word){
        Node curr= root;
        for(int lvl=0; lvl<word.length(); lvl++){
            int idx=word.charAt(lvl)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr= curr.children[idx];
            
        }
        return curr.eow==true;
    }

    public static boolean wordbreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1; i<=key.length(); i++){
            if(search(key.substring(0, i)) && wordbreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        String words[]= {"i","like","sam","samsung","mobile","ice"};
        for(int i=0; i<words.length; i++){
            insert(words[i]); 
        }
        String key="ilikesamsung";

        System.out.println(wordbreak(key));
    } 
    
}

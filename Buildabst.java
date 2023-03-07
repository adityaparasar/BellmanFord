import java.util.*;
public class Buildabst{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
        }
    }
    public static Node insert(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root, int val){
        if(root==null){
            return false;
        }

        if(root.data==val){
            return true;
        }

        if(root.data> val){
            return search(root.left, val);
        }else{
            return search(root.right, val);
        }
    }

    public static Node delete(Node root, int val){
        if(root.data<val){
            root.right=delete(root.right, val);
        }
        else if(root.data>val){
            root.left=delete(root.left, val);
        }
        else{
            //case 1
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }

            //case 3
            Node IS= findInorderSusscessor(root.right);
            root.data= IS.data;
            root.right= delete(root.right, IS.data);

        }
        return root;
    }

    public static Node findInorderSusscessor(Node root){
        while(root.left!= null){
            root= root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root==null){
            return;
        }

        if(root.data>= k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data<k1){
            printInRange(root.right, k1, k2);
        }else{
            printInRange(root.left, k1, k2);
        }
    }

    public static void printpath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }

        path.add(root.data);
        if(root.left==null && root.right==null){
            printpath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
        
    }
    
    public static void main(String args[]){
        int value[]= {5,7,3,2,1,4};
        Node root=null;

        for(int i=0; i<value.length;i++){
            root=insert(root, value[i]);
        }
        inorder(root);
        System.out.println();

        

        printInRange(root, 3, 7);

        // printRoot2Leaf(root, new ArrayList<>());
    }
}

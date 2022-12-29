import java.util.*;
public class BinaryTreesB {
    static class Node{
        int data;
        Node Right;
        Node Left;

        Node(int data){
            this.data= data;
            this.Left= null;
            this.Right= null;
        }
    }

    static class BinaryTree{
        static int idx= -1;
        public static Node buildTree(int nodes[]){
            idx++;;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode= new Node(nodes[idx]);
            newnode.Left= buildTree(nodes);
            newnode.Right= buildTree(nodes);

            return newnode;
        }

    }
    
    public static void main(String args[]){
        int nodes[]= {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.buildTree(nodes);
        System.out.println(root.data);

    }

}

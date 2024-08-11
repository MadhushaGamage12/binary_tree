package sortingMethod;

public class BinaryTreeInsert   {  
    public static void main(String[] args)   {  
        new BinaryTreeInsert().run();  
    }  
    static class Node    {  
        Node left;  // Left child node
        Node right;  // Right child node
        int value;  // Value stored in the node
        public Node(int value)    {  
            this.value = value;  
        }  
    }  
    public void run()   {  
    	 // Create the root node of the tree with an initial value of 25
        Node rootnode = new Node(25);  
        System.out.println("Building the tree with root value = " + rootnode.value);  
        System.out.println("-------------------------");  
        insert(rootnode, 10);  
        insert(rootnode, 15);  
        insert(rootnode, 12);  
        insert(rootnode, 23);  
        insert(rootnode, 79);  
        insert(rootnode, 89);
        insert(rootnode, 69);  
        insert(rootnode, 99);  
        insert(rootnode, 100);  
    } 
   
    public void insert(Node node, int value)   
    {  
        if (value < node.value)   
        {  
            if (node.left != null)   
            {  
                insert(node.left, value);  
            } else   
            {  
                System.out.println("  Inserted " + value + " to left of Node " + node.value);  
                node.left = new Node(value);  
            }  
        }   
        else if (value > node.value)   
        {  
            if (node.right != null)   
            {  
                insert(node.right, value);  
            } else   
            {  
                System.out.println("  Inserted " + value + " to right of Node " + node.value);  
                node.right = new Node(value);  
            }  
        }  
    }  
}  

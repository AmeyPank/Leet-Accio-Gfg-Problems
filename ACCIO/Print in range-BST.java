import java.util.*;
class Node {
    int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree
{
    Node constructBST(int[]arr,int start,int end,Node root)
    {
        if(start>end)
            return null;
        int mid=(start+end)/2;

        if(root==null)
            root=new Node(arr[mid]);

        root.left=constructBST(arr,start,mid-1, root.left);
        root.right=constructBST(arr,mid+1,end, root.right);

        return root;

    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt(); 
        }
        int a=sc.nextInt();
        int b=sc.nextInt();

        Arrays.sort(arr);
        Node root=null;
        BinarySearchTree bst=new BinarySearchTree();
        root=bst.constructBST(arr,0,n-1,root);
            
        Accio A = new Accio();
        A.solve(root,a,b);
        
    }
}

class Accio
{
    public static void solve(Node node,int a,int b)
    {
        // your code here
		if(node == null){
			return;
		}
		if(a < node.data && b < node.data){
			solve(node.left, a, b);
		}else if(a >node.data && b> node.data){
			solve(node.right, a, b);
		}else{
			solve(node.left, a, b);
			System.out.println(node.data);
			solve(node.right, a, b);
		}
    }
}
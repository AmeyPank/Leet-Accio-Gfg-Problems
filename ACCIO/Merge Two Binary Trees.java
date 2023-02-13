public class Merge Two Binary Trees {
    
}
import java.io.*;
import java.util.*;
import java.math.*;

class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
class Solution{
    void inorder(Node root,ArrayList<Integer>list){
        if(root==null)return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public List<Integer> merge(Node root1,Node root2){
       ArrayList<Integer>list1=new ArrayList<>();
         ArrayList<Integer>list2=new ArrayList<>();
         inorder(root1,list1);
         inorder(root2,list2);
         List<Integer>list=new ArrayList<>();
         while(list1.size()>0&&list2.size()>0){
             if(list1.get(0)<list2.get(0)){list.add(list1.get(0));list1.remove(0);}
             else {list.add(list2.get(0));list2.remove(0);}
         }
         while(list1.size()>0){
             list.add(list1.get(0));list1.remove(0);
         }
         while(list2.size()>0){
             list.add(list2.get(0));list2.remove(0);
         }
         return list;
    }
}
public class Main{
    public static Node buildTree(String str){
        if(str.length() == 0 || str.equals("N"))
        return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        int i = 1;
        while(!q.isEmpty() && i < s.length){
            Node currNode = q.remove();
            String currVal = s[i];
            if(!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                q.add(currNode.left);
            }
            i++;
            if(i >= s.length)
                break;
            currVal = s[i];
            if(!currVal.equals("N")){
                currNode.right = new Node(Integer.parseInt(currVal));
                q.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Node root1 = buildTree(s);

        s = br.readLine();
        Node root2 = buildTree(s);

        Solution T = new Solution();
        List<Integer> ans = T.merge(root1,root2);
        for(int i=0;i<ans.size();i++)
            System.out.print(ans.get(i) + " ");
        System.out.println();
    }
}
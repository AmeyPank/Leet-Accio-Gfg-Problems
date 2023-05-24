import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node left;
	Node right;
	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}


class Main {
	static Node buildTree(String str) {
		// System.out.print(str);
		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}
		String ip[] = str.split(" ");
		Node root = new Node(Integer.parseInt(ip[0]));
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		int i = 1;
		while (queue.size() > 0 && i < ip.length) {
			Node currNode = queue.peek();
			queue.remove();
			String currVal = ip[i];
			if (!currVal.equals("N")) {
				currNode.left = new Node(Integer.parseInt(currVal));
				queue.add(currNode.left);
			}
			i++;
			if (i >= ip.length)
				break;
			currVal = ip[i];
			if (!currVal.equals("N")) {
				currNode.right = new Node(Integer.parseInt(currVal));
				queue.add(currNode.right);
			}
			i++;
		}
		return root;
	}

	static void printLevelOrder(Node root)
	{
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {

			/* poll() removes the present head.
			For more information on poll() visit
			http://www.tutorialspoint.com/java/
			util/linkedlist_poll.htm */
			Node tempNode = queue.poll();
			System.out.print(tempNode.data + " ");

			/*Enqueue left child */
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}

			/*Enqueue right child */
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}


	public static void main (String[] args) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		//System.out.print(s);
		Node root = buildTree(s);
		int k;
		k = sc.nextInt();
		Solution tree = new Solution();
		int answer = tree.maxDiff(root,k);
		System.out.println(answer);
	}
}


class Solution {
    static int minDiff = Integer.MAX_VALUE;
    static int minDiffNode = -1;

    static int maxDiff(Node root, int k) {
        if (root == null)
            return -1;

        findMinDiff(root, k);

        return minDiffNode;
    }

    static void findMinDiff(Node root, int k) {
        if (root == null)
            return;

        int diff = Math.abs(root.data - k);

        if (diff < minDiff) {
            minDiff = diff;
            minDiffNode = root.data;
        }

        if (k < root.data)
            findMinDiff(root.left, k);
        else
            findMinDiff(root.right, k);
    }
}
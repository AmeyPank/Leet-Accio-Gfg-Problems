// Approach:
// The simplest approach here will be we use a data structure that will give us the minimum the array and we can insert and delete from it. So we will keep checking till our minimum element is less then k.If our minimum element is less then take the first minimum and second minimum and apply the operation on it and delete them and reinsert them.

// Algorithm:

// To write the above algorithm:

// Iterate over the array and push all elements in the priority_queue which is keeping element in ascending order i.e. top element is the minimum.
// Compare the top element of the priority_queue if its less then k then take the second minimum and if second minimum is not present then print -1 otherwise apply the operation on them and remove them from priority_queue and add them after applying the given operation
// If the top element is not less then k then break the loop
// When the loop is complete print the number of times the loop run if the top element of priority queue Is not less then k

// Time Complexity

// O(NlogN).

// Space Complexity

// O(N)

// Below is the implementation of above idea:

// 1. Java:


import java.io.*;
import java.util.*;
 
public class Main{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            pq.add(input.nextInt());
        }
        int cnt = 0;
        while(pq.size() >= 2 && pq.peek() < k){
            int x = pq.poll();
            int y = pq.poll();
            pq.add(x + 2 * y);
            cnt++;
        }
        if(pq.peek() >= k){
            System.out.println(cnt);
        }else{
            System.out.println(-1);
        }
    }
}
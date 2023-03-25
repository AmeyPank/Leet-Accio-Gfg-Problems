import java.util.*;

class Solution {
    public static void printMinString(String [] arr){
       //Write your code here
		String shortestString = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < shortestString.length()) {
                shortestString = arr[i];
            }
        }

        System.out.println(shortestString);
        
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String sentence[]=new String[n];
        for(int i=0;i<n;i++)sentence[i]=sc.nextLine();
        Solution Obj= new Solution();
        Obj.printMinString(sentence);
    }
}

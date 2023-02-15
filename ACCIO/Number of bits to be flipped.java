import java.io.*;
import java.util.*;

class Solution {
    public static int numberOfFlipps(int A,int B)
    {
        //Write code here and return output
		int flipped= A^B;
		int count = 0;
		while(flipped!=0){
			
			 int rsb = (flipped & -flipped);
			flipped -= rsb;

			count++;
		}
		return count;
    }
}
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);    
        int A=sc.nextInt();
        int B=sc.nextInt();       
        Solution Ac= new Solution();        
        int ans=Ac.numberOfFlipps(A,B);
        System.out.println(ans);
    }
}
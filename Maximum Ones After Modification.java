import java.util.*;

class Accio {
    public int longestOnes(int[] A, int B) {
        //Your code goes here
        int j = -1;
        int ans =  0;
        int count = 0;
        
        for(int i = 0; i <A.length;i++){
            if(A[i]==0){
                count++;
            }
            while(count > B){
                j++;
                if(A[j] == 0){
                    count--;
                }
            }
            int len = i - j;
            if(len > ans){
                ans = len;
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++)
            A[i] = sc.nextInt();
        int B = sc.nextInt();
        Accio Obj = new Accio();
        System.out.println(Obj.longestOnes(A, B));
    }
}
import java.io.*;
import java.util.*;
class Main {
	static void toh(int N, int from, int to, int aux) {
        //Write code here
		if (N == 1) {
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            return;
        }
        toh(N-1, from, aux, to);
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        toh(N-1, aux, to, from);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        
        N = sc.nextInt();

        toh(N, 1, 3, 2);

        sc.close();
    }
}


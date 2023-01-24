import java.util.Scanner;

class Solution{
    public static int bunnyEars2(int bunnies) {
        
 if (bunnies == 0) return 0;
  if (bunnies % 2 == 0) return 3 + bunnyEars2(bunnies-1);
  else return 2 + bunnyEars2(bunnies-1);

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(Solution.bunnyEars2(n));
    }
}
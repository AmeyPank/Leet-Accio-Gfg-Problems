import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class Main {

  public static void main(String[] args) throws IOException {
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();  
    int a = sc.nextInt();  
    int b = sc.nextInt();  
    int c = sc.nextInt();  
    PizzaBase answer = new PizzaBase(a,b,c);
    for(int i=0;i<n;i++)
    {
      int q = sc.nextInt(); 
      System.out.println(answer.checkBase(q));
    }
  }
}

class PizzaBase {
    private int bigBases;
    private int mediumBases;
    private int smallBases;

    public PizzaBase(int big, int medium, int small) {
        this.bigBases = big;
        this.mediumBases = medium;
        this.smallBases = small;
    }

    public boolean checkBase(int pizzaSize) {
        if (pizzaSize == 1) {
            if (bigBases > 0) {
                bigBases--;
                return true;
            }
        } else if (pizzaSize == 2) {
            if (mediumBases > 0) {
                mediumBases--;
                return true;
            }
        } else if (pizzaSize == 3) {
            if (smallBases > 0) {
                smallBases--;
                return true;
            }
        }
        return false;
    }
}


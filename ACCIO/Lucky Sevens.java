import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    input = input.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s+", "");
    String[] strArray = input.split(",");
    int[] arr = new int[strArray.length];
    for (int i = 0; i < strArray.length; i++) {
      arr[i] = Integer.parseInt(strArray[i]);
    }
    boolean result = lucky_sevens(arr);
    System.out.println(result);
  }

  public static boolean lucky_sevens(int[] array) {
    for (int i = 0; i < array.length - 2; i++) {
      if (array[i] + array[i+1] + array[i+2] == 7) {
        return true;
      }
    }
    return false;
  }
}

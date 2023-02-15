import java.util.*;

public class Main {

    public static String removeparentheses(String S, int n) {
		//Your code here
		        List<Integer> indices = new ArrayList<Integer>();
        Stack<Character> stack = new Stack<Character>();
        int length = S.length();
        int begin = 0;
        for (int i = 0; i < length; i++) {
            char c = S.charAt(i);
            if (c == '(')
                stack.push(c);
            else {
                stack.pop();
                if (stack.isEmpty()) {
                    indices.add(begin);
                    indices.add(i);
                    begin = i + 1;
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            if (!indices.contains(i))
                sb.append(S.charAt(i));
        }
        return sb.toString();

	}

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s = sc.next();
		System.out.println(removeparentheses(s, n));
    }
}

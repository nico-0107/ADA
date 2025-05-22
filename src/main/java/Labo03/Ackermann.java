
package Labo03;

import java.util.Stack;
public class Ackermann {
    public static int ackermann(int m, int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(m);

        while (!stack.isEmpty()) {
            m = stack.pop();
            if (m == 0) {
                n = n + 1;
            } else if (n == 0) {
                stack.push(m - 1);
                n = 1;
            } else {
                stack.push(m - 1);
                stack.push(m);
                n = n - 1;
            }
        }

        return n;
    }
}

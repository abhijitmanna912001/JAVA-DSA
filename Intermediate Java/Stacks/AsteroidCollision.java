// https://leetcode.com/problems/asteroid-collision/description/
// https://www.geeksforgeeks.org/problems/asteroid-collision/1
// Solved both GFG and Leetcode question using below logic

import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {

    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (stack.isEmpty() || asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                while (!stack.isEmpty()) {
                    int top = stack.peek();
                    if (top < 0) {
                        stack.push(asteroids[i]);
                        break;
                    }

                    int modVal = Math.abs(asteroids[i]);
                    if (modVal == top) {
                        stack.pop();
                        break;
                    } else if (modVal < top) {
                        break;
                    } else {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }

        int len = stack.size();
        int ansArr[] = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            ansArr[i] = stack.pop();
        }

        return ansArr;
    }
}

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int x : asteroids) {

            boolean destroyed = false;

            // Collision occurs only when stack top > 0 and x < 0
            while (!stack.isEmpty() && stack.peek() > 0 && x < 0) {

                if (Math.abs(stack.peek()) < Math.abs(x)) {
                    stack.pop();         // top asteroid destroyed
                    continue;            // x may still collide again
                } 
                else if (Math.abs(stack.peek()) == Math.abs(x)) {
                    stack.pop();         // both destroy
                    destroyed = true;
                    break;
                } 
                else {
                    destroyed = true;    // x destroyed
                    break;
                }
            }

            if (!destroyed) {
                stack.push(x);
            }
        }

        // Convert stack to array (in correct order)
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }

        return res;
    }
}

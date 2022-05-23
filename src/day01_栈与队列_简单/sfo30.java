package day01_栈与队列_简单;

import java.util.Stack;

/*
* 自己没想出来，直接看了题解思路，然后自己实现代码
*   自己优化了些边界逻辑，还是需要判断下集合为空的
* */
class MinStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    /** initialize your data structure here. */
    public MinStack() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);

        if (stack2.isEmpty() || x <= stack2.peek()) {
            stack2.push(x);
        }
    }

    public void pop() {
        if (stack1.isEmpty()){
            return;
        }
        
        if (stack2.isEmpty()){
            stack1.pop();
            return;
        }
        
        if (stack1.pop().equals(stack2.peek())) {
            stack2.pop();
        }
    }

    public int top() {
        if (stack1.isEmpty()) {
            return -1;
        }
        return stack1.peek();
    }

    public int min() {
        if (stack2.isEmpty()) {
            return -1;
        }
        return stack2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */

public class sfo30 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.pop();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        System.out.println(minStack.min());
//        minStack.pop();
//        System.out.println(minStack.top());
//        System.out.println(minStack.min());

        /*来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
    }
}

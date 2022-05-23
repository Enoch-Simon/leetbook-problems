package day01_栈与队列_简单;

import java.util.ArrayList;
import java.util.List;

/*
* 用两个栈实现队列，优化了下自己的拙解，但还是不够好，因为栈A和栈B完全可以使得队列首尾分离，栈A只负责入队，栈B只负责出队，没必要队列要完完整整地在一个栈中
* */
class CStack {
    private List<Integer> stackList;

    public CStack() {
        this.stackList = new ArrayList<>();
    }

    public void push(int value) {
        this.stackList.add(value);
    }

    public int pop() {
        if (stackList.size() == 0) {
            return -1;
        }
        return stackList.remove(stackList.size() - 1);
    }

    public int size() {
        return stackList.size();
    }
}

class CQueue {
    private CStack stack1;
    private CStack stack2;

    public CQueue() {
        this.stack1 = new CStack();
        this.stack2 = new CStack();
    }

    public void appendTail(int value) {
        if (stack1.size() == 0) {
            stack1.push(value);
            return;
        }

        int size1 = stack1.size();
        for (int i = 0; i < size1; i++) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        int size2 = stack2.size();
        for (int i = 0; i < size2; i++) {
            stack1.push(stack2.pop());
        }
    }

    public int deleteHead() {
        if (stack1.size() == 0 && stack2.size() == 0) {
            return -1;
        }

        if (stack1.size() == 0) {
            return stack2.pop();
        } else {
            return stack1.pop();
        }
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */

public class of09 {
    public static void main(String[] args) {
        /*
        * ["CQueue","appendTail","deleteHead","deleteHead"]
          [[],[3],[],[]]
        * */
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        
        
        /*
        * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
          [[],[],[5],[2],[],[]]
        * */
        System.out.println("-----------------Second---------------------");
        CQueue cQueue2 = new CQueue();
        System.out.println(cQueue2.deleteHead());
        cQueue2.appendTail(5);
        cQueue2.appendTail(2);
        System.out.println(cQueue2.deleteHead());
        System.out.println(cQueue2.deleteHead());
        
        /*
        * ["CQueue","deleteHead","appendTail","deleteHead","appendTail","appendTail","deleteHead","deleteHead","deleteHead","appendTail","deleteHead","appendTail","appendTail","appendTail","appendTail","appendTail","appendTail","deleteHead","deleteHead","deleteHead","deleteHead"]
          [[],[],[12],[],[10],[9],[],[],[],[20],[],[1],[8],[20],[1],[11],[2],[],[],[],[]]
        * */
        System.out.println("-----------------Third---------------------");
        CQueue cQueue3 = new CQueue();
        System.out.println(cQueue3.deleteHead());
        cQueue3.appendTail(12);
        System.out.println(cQueue3.deleteHead());
        cQueue3.appendTail(10);
        cQueue3.appendTail(9);
        System.out.println(cQueue3.deleteHead());
        System.out.println(cQueue3.deleteHead());
        System.out.println(cQueue3.deleteHead());
        cQueue3.appendTail(20);
        System.out.println(cQueue3.deleteHead());
        cQueue3.appendTail(1);
        cQueue3.appendTail(8);
        cQueue3.appendTail(20);
        cQueue3.appendTail(1);
        cQueue3.appendTail(11);
        cQueue3.appendTail(2);
        System.out.println(cQueue3.deleteHead());
        System.out.println(cQueue3.deleteHead());
        System.out.println(cQueue3.deleteHead());
        System.out.println(cQueue3.deleteHead());
    }
}

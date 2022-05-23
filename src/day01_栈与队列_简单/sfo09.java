package day01_栈与队列_简单;

import java.util.ArrayList;
import java.util.List;

class CQueue2 {
    private CStack stack1;
    private CStack stack2;

    public CQueue2() {
        this.stack1 = new CStack();
        this.stack2 = new CStack();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1.size() == 0 && stack2.size() == 0) {
            return -1;
        }

        int size1 = stack1.size();
        for (int i = 0; i < size1; i++) {
            stack2.push(stack1.pop());
        }
        int result = stack2.pop();
        int size2 = stack2.size();
        for (int i = 0; i < size2; i++) {
            stack1.push(stack2.pop());
        }
        return result;
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */

public class sfo09 {
    public static void main(String[] args) {
        /*
        * ["CQueue","appendTail","deleteHead","deleteHead"]
          [[],[3],[],[]]
        * */
//        CQueue cQueue = new CQueue();
//        cQueue.appendTail(3);
//        System.out.println(cQueue.deleteHead());
//        System.out.println(cQueue.deleteHead());
        
        
        /*
        * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
          [[],[],[5],[2],[],[]]
        * */
//        System.out.println("-----------------Second---------------------");
//        CQueue2 cQueue2 = new CQueue2();
//        System.out.println(cQueue2.deleteHead());
//        cQueue2.appendTail(5);
//        cQueue2.appendTail(2);
//        System.out.println(cQueue2.deleteHead());
//        System.out.println(cQueue2.deleteHead());
        
        /*
        * ["CQueue","deleteHead","appendTail","deleteHead","appendTail","appendTail","deleteHead","deleteHead","deleteHead","appendTail","deleteHead","appendTail","appendTail","appendTail","appendTail","appendTail","appendTail","deleteHead","deleteHead","deleteHead","deleteHead"]
          [[],[],[12],[],[10],[9],[],[],[],[20],[],[1],[8],[20],[1],[11],[2],[],[],[],[]]
        * */
        System.out.println("-----------------Third---------------------");
        CQueue2 cQueue3 = new CQueue2();
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

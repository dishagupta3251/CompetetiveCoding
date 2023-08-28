class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public MyStack() {
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }
    
    public void push(int x) {
        while(!queue1.isEmpty())
            queue2.offer(queue1.poll());
        queue1.offer(x);
        while(!queue2.isEmpty())
            queue1.offer(queue2.poll());
    }
    
    public int pop() {
       return queue1.poll();
    }
    
    public int top() {
        int t=queue1.peek();
        return t;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
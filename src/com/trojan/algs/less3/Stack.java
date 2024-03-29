package com.trojan.algs.less3;

public class Stack {
    private int maxSize;
    private int[] stack;
    private int head;

    public Stack(int size){
        this.maxSize = size;
        this.stack = new int[size];
        this.head = -1;
    }

    public boolean isEmpty(){
        return head == -1;
    }

    public boolean isFull(){
        return head == maxSize - 1;
    }

    public boolean push(int value){
        if(isFull()) return false;
            stack[++head] = value;
            return true;
    }

    public int pop(){
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return stack[head--];
    }

    public int peek(){
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return stack[head];
    }
}

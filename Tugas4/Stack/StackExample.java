package Strukturdatatugas.Tugas4.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(1); 
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); 
        System.out.println(stack.peek()); 

        System.out.println("Size: " + stack.size());
        System.out.println("Is empty? " + stack.isEmpty());
    }
}


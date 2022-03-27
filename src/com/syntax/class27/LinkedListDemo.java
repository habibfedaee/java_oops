package com.syntax.class27;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(1); nums.add(2); nums.addFirst(0);; nums.addLast(3);
        nums.add(1, 4);
        System.out.println(nums);

    }
}

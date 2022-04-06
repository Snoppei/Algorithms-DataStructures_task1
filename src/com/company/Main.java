package com.company;

public class Main {

    public static void main(String[] args) {
        ///////////////////////////////////////////////////////////////////////////////////////
        // пример показывающий, что стек пуст
        ///////////////////////////////////////////////////////////////////////////////////////
        System.out.println("////////////////////////////////////////////////////////////////////");
        System.out.println("Пример где стек пуст");
        StackGenerics stack = new StackGenerics<>();
        System.out.println("Empty stack status: " + stack.isEmpty());
        System.out.println("Full stack status: " + stack.isFull());

        System.out.println("////////////////////////////////////////////////////////////////////");
        ///////////////////////////////////////////////////////////////////////////////////////




        ///////////////////////////////////////////////////////////////////////////////////////
        // пример показывающий, что стек заполнен
        ///////////////////////////////////////////////////////////////////////////////////////
        System.out.println("////////////////////////////////////////////////////////////////////");
        System.out.println("Пример где стек заполнен, но еще не произошел шаг capacity*2");
        StackGenerics stack1 = new StackGenerics<>(3);
        stack1.push(6);
        stack1.push(5);
        stack1.push(8);
        System.out.println("Empty stack status: " + stack1.isEmpty());
        System.out.println("Full stack status: " + stack1.isFull());
        System.out.println("Извлечение значений из стека");
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println("Empty stack status: " + stack1.isEmpty());
        System.out.println("Full stack status: " + stack1.isFull());
        System.out.println("////////////////////////////////////////////////////////////////////");
    }
}

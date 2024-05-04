package Guias.TP5.Ej6;

import java.util.EmptyStackException;

public class ArrayStack <E> implements Stack<E> {
    private E[] elements;
    private int size=0;
    private int capacity=0;
    private static final int INITIAL_DIM = 10;
    @SuppressWarnings("unchecked")
    public ArrayStack() {
        resize();
    }
    @Override
    public void push(E o) {
        if (size==capacity){
            resize();
        }
        elements[size++]=o;
    }
    @SuppressWarnings("unchecked")
    private void resize(){
        capacity+=INITIAL_DIM;
        elements = (E[])new Object[capacity];
    }

    @Override
    public E peek() {
        return elements[size-1];
    }

    @Override
    public E pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        size--;
        return elements[size];
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for(int i = size-1; i >= 0; i--) {
            stringBuilder.append(elements[i]).append(",");
        }
        stringBuilder.setCharAt(stringBuilder.length() - 1,  ']');
        return stringBuilder.toString();
    }
}

package com.company.Heap;


public class MinHeap<T> {
    private T[] arr;

    public MinHeap() {
        arr = (T[])new Object[0];
    }

    public boolean empty() {
        return arr.length != 0;
    }

    public int size() {
        return arr.length;
    }

    public void insert(T val) {
        T[] temp = (T[])new Object[arr.length + 1];
        int counter = 0;
        for(int i = 0; i < arr.length; i++) {
            if(Integer.class == val.getClass() || Double.class == val.getClass() || Float.class == val.getClass()) {
                if ((Integer)val < (Integer)arr[i]) {
                    temp[counter] = val;
                    counter++;
                }
            }
            else {
                temp[counter] = val;
                counter++;
            }
            temp[counter] = arr[i];
            counter++;
        }
        arr = temp;
    }

    public T getMin() {
        return arr[0];
    }

    public T extractMin() {
        T temp = arr[0];
        T[] t = (T[])new Object[arr.length - 1];
        for(int i = 1; i < arr.length; i++) {
            t[i] = arr[i];
        }
        arr = t;
        return temp;
    }
}

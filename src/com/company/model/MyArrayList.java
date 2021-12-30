package model;

import service.List;

public class MyArrayList<T extends Comparable<T>> implements List<T> {

    private int size;
    private T[] objects;

    public T[] getObjects() {
        return objects;
    }

    public MyArrayList() {
        this.objects = (T[]) new Comparable[10];
        this.size = 0;
    }

    @Override
    public void add(T element) {
        if (size == objects.length) {
            expand();
        }
        this.objects[size] = element;
        size++;
    }

    private void expand() {
        T[] oldElements = this.objects;
        this.objects = (T[])new Comparable[oldElements.length + oldElements.length / 2];
        for (int i = 0; i < size; i++) {
            this.objects[i] = oldElements[i];
        }
    }

    @Override
    public void add(T element, int index) {
        if (index > size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if (size == objects.length) {
            expand();
        }
        for (int i = size; i > index; i--){
            this.objects[i] = this.objects[i-1];
        }
        this.objects[index] = element;
        size++;
    }

    @Override
    public T get(int index) {

        return null;
    }

    @Override
    public int getIndex(T object) {

        return 0;
    }

    @Override
    public void set(int index, T object) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void sort() {

    }
}

package model;

import service.List;

import java.util.Arrays;

public class MyArrayList<T extends Comparable<T>> implements List<T> {
    private int size;
    private T[] objects;

    public MyArrayList() {
        this.objects = (T[]) new Comparable[10];
        this.size = 0;
    }

    public MyArrayList(int startSize) {
        this.objects = (T[]) new Comparable[startSize];
        this.size = 0;
    }

    public T[] getObjects() {
        return objects;
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
        return objects[index - 1];
    }

    @Override
    public int getIndex(T object) throws RuntimeException {
        for (int i = 0; i < objects.length; i++) {
            if(objects[i] == object){
                return i;
            }
        }
        throw new RuntimeException("The object has not found");
    }

    @Override
    public void set(T object) {

    }

    @Override
    public void set(int index, T object) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void sort() {

    }
}

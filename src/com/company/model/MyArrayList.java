package model;

import service.List;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<T extends Comparable<T>> implements List<T> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private int sortValue;
    private int size;
    private T[] objects = (T[]) new Comparable[INIT_SIZE];



    public T[] getObjects() {
        return objects;
    }

    @Override
    public void add(T element) {
        if (size == objects.length - 1) {
            expand(size * 2);
        }
        this.objects[size] = element;
        size++;
    }

    @Override
    public void add(T element, int index) {
        if (index > size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if (size == objects.length - 1) {
            expand(size * 2);
        }
        for (int i = size; i > index; i--){
            this.objects[i] = this.objects[i-1];
        }
        this.objects[index] = element;
        size++;
    }

    private void expand(int newLength) {
        T[] newArray = (T[])new Comparable[newLength];
        System.arraycopy(newArray, 0, objects, 0, objects.length);
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
    public void delete(int index) {
        for (int i = index; i < size; i++)
            objects[i] = objects[i + 1];
        objects[size] = null;
        size--;
        if (objects.length > INIT_SIZE && size < objects.length / CUT_RATE)
            expand(size / 2);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void sort() {

    }

    public static void sortArray(){

    }
}

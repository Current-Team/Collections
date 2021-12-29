package service;

public interface List<T> {
    boolean add(T object);
    boolean add(int index, T object);
    T get(int index);
    T get(T object);
    void set(int index, T object);
    void delete(int index);
    int size();
    void sort();
}

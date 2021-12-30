package service;

public interface List<T> {
    void add(T element);
    void add(T element, int index);
    T get(int index);
    int getIndex(T object) throws RuntimeException;
    void set(T object);
    void set(int index, T object);
    void delete(int index);
    int size();
    void sort();
}

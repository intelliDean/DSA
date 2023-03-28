package my_custom_arraylist;

import java.util.*;

public class DeansList<T> {
    private Object[] arrays;
    private int default_size = 10;
    private int size = 0;

    public DeansList() {
        arrays = new Object[default_size];
    }
    // TODO: 06-Jan-23 Add a type T in the add method
    //todo look into wildcat

    @SafeVarargs
    public DeansList(T... objects) {
        if (objects.length > default_size) {
            default_size = objects.length * 2;
            size = objects.length;
            arrays = new Object[default_size];
            System.arraycopy(objects, 0, arrays, 0, size);
        } else {
            arrays = new Object[default_size];
            size = objects.length;
            System.arraycopy(objects, 0, arrays, 0, size);
        }
    }

    public Object[] getAll() {
        if (arrays != null) {
            Object[] temp = new Object[size];
            System.arraycopy(arrays, 0, temp, 0, size);
            return temp;
        } else {
            return new Object[]{};
        }
    }

    public int size() {
        return size;
    }

    public void add(T obj) {
        if (size == arrays.length) {
            Object[] temp = new Object[arrays.length * 2];
            System.arraycopy(arrays, 0, temp, 0, size);
            arrays = temp;
        }
        arrays[size++] = obj;
    }

    public Object get(int index) {
        for (int i = 0; i < size; i++) {
            if (index == i) {
                return arrays[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        Object[] temp = new Object[size];
        System.arraycopy(arrays, 0, temp, 0, size);
        return Arrays.toString(temp);
    }

    public void addAll(T[] otherList) {
        for (T t : otherList) {
            add(t);
        }
    }

    public void insert(int index, T obj) {
        if (size == 0) {
            add(obj);
        }
        if (size == arrays.length) {
            arrays = new Object[arrays.length + 1];
        }
        size++;
        for (int i = size; i >= index; i--) {
            arrays[i] = arrays[i - 1];
        }
        for (int i = 0; i <= size; i++) {
            if (index == i) {
                arrays[i] = obj;
                break;
            }
        }
    }

    public void removeByIndex(int index) {
        for (int i = 0; i < size; i++) {
            if (index == i) {
                for (int j = i; j < size; j++) {
                    arrays[j] = arrays[j + 1];
                }
                size--;
                break;
            }
        }
    }

    public void removeByValue(T obj) {
        for (int i = 0; i < size; i++) {
            if (arrays[i].equals(obj)) {
                for (int j = i; j < size; j++) {
                    arrays[j] = arrays[j+1];
                }
                size--;
                break;
            }
        }
    }

    public void removeAll() {
        size = 0;
    }
}

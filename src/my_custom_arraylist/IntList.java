package my_custom_arraylist;

import java.util.Arrays;

public class IntList {
    private int[] arrays;
    private int default_size = 10;
    private int size = 0;

    public IntList() {
        arrays = new int[default_size];
    }

    public IntList(int... numbers) {
        if (numbers.length > default_size) {
            default_size = numbers.length * 2;
            size = numbers.length;
            arrays = new int[default_size];
            System.arraycopy(numbers, 0, arrays, 0, numbers.length);
        } else {
            arrays = new int[default_size];
            size = numbers.length;
            System.arraycopy(numbers, 0, arrays, 0, numbers.length);
        }
    }

    public void addItem(int item) {
        if (size == arrays.length) {
            int[] temp = new int[arrays.length * 2];
            System.arraycopy(arrays, 0, temp, 0, arrays.length);
            arrays = temp;
        }
        arrays[size++] = item;
    }

    public int get(int i) {
        for (int j = 0; j < size; j++) {
            if (i == j) {
                return arrays[j];
            }
        }
        return Integer.MIN_VALUE;
    }

    public void insert(int index, int number) {
        if (arrays.length == size) {
            arrays = new int[arrays.length + 1];
        }
        size++;
        for (int i = size; i >= index; i--) {
            arrays[i] = arrays[i - 1];
        }
        for (int i = 0; i <= size; i++) {
            if (index == i) {
                arrays[i] = number;
                break;
            }
        }
    }

    public int[] getAll() {
        if (arrays != null) {
            int[] temp = new int[size];
            System.arraycopy(arrays, 0, temp, 0, size);
            return temp;
        } else {
            return new int[]{};
        }
    }

    @Override
    public String toString() {
        int[] temp = new int[size];
        System.arraycopy(arrays, 0, temp, 0, size);
        return Arrays.toString(temp);
    }

    public void remove(int value) {
        if (value > size) {
            for (int i = 0; i < size; i++) {
                if (arrays[i] == value) {
                    for (int j = i; j < size; j++) {
                        arrays[j] = arrays[j + 1];
                    }
                    size--;
                    break;
                }
            }
        } else {
            for (int i = 0; i <= value; i++) {
                if (value == i) {
                    for (int j = value; j < size; j++) {
                        arrays[j] = arrays[j + 1];
                    }
                    size--;
                    break;
                }
            }
        }
    }

    public void removeAll() {
        for (int i = 0; i < size; i++) {
            arrays[i] = 0;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public void sort() {
        boolean swapped;
        for (int i = 0; i < size; i++) {
            swapped = false;
            for (int j = 1; j < size; j++) { //for each pass, the length condition of J decreases by the number of I
                if (arrays[j] < arrays[j - 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j - 1];
                    arrays[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public void addAll(int[] otherArrays) {
        for (int otherArray : otherArrays) {
            addItem(otherArray);
        }
    }
}
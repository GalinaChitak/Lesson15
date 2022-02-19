package com.galinachitak;


import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] array = new int[0];

    @Override
    public void add(int value) {
        int[] resultArray = new int[array.length + 1];
        System.arraycopy(array, 0, resultArray, 0, resultArray.length - 1);
        resultArray[resultArray.length - 1] = value;
        array = resultArray;


    }


    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void set(int index, int value) {
        array[index] = value;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public int[] toArray() {
        int[] temp = new int[array.length];
        System.arraycopy(array, 0, temp, 0, temp.length);
        return temp;
    }

    @Override
    public int remove(int index) {
        int[] temp = new int[array.length - 1];
        System.arraycopy(array, 0, temp, 0, index);
        System.arraycopy(array, index + 1, temp, index, temp.length - index);
        array = temp;

        return index;
    }

    public int addElement(int value) {
        int[] temp = new int[array.length + 1];
        int middleIndex = array[0] + (((array.length - 1) - array[0]) / 2);
        System.arraycopy(array, 0, temp, 0, middleIndex);
        temp[middleIndex] = value;
        System.arraycopy(array, middleIndex, temp, middleIndex + 1, array.length - middleIndex);
        array = temp;
        return middleIndex;
    }



    @Override
    public String toString() {
        return "IntArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}

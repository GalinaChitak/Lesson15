package com.galinachitak;

import java.util.Arrays;

public class Main {
    /*1) Есть интерфейс IntList:
    public interface IntList {
    void add(int value);
    int get(int index);
    void set(int index, int value);
    int size();
    int[] toArray();
    Реализовать класс IntArrayList который реализует этот интерфейс.
    В качестве демонстрации с его помощю реализовать сортировку пузырьком IntList.
    Логика метода add:
    создаем временный массив на 1 элемент больше чем arr, копируем в него все элементы из arr,
     на последнюю позицию записываем новый элемент и заменяем arr на временный массив.
     2*) Добавить в IntList методы которые позволяют вставить в средину и удалить по индексу.*/

    public static void main(String[] args) {
        IntArrayList list = new IntArrayList();

        list.add(1);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(9);
        System.out.println(list);
        list.set(2, 12);
        list.set(3, 45);
        System.out.println(Arrays.toString(list.toArray()));
        bubbleSort(list);
        System.out.println("bubbleSort " + list);
        list.remove(1);

        System.out.println("удалить 2 елемент" + list);
        list.addElement(22);
        System.out.println("добавить число 22" + list);
    }

    private static void bubbleSort(IntList array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.size() - 1; i++) {
                if (array.toArray()[i] > array.toArray()[i + 1]) {
                    isSorted = false;
                    swap(array, i, i + 1);
                }
            }
        }
    }

    private static void swap(IntList array, int first, int second) {
        int temp = array.get(first);
        array.set(first, array.get(second));
        array.set(second, temp);
    }
}





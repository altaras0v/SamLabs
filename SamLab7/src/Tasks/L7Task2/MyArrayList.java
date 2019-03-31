package Tasks.L7Task2;

import static java.util.Arrays.copyOf;

public class MyArrayList<T> implements Iterator<T> {
    private final int INIT_SIZE = 16;
    private T[] array = (T[])new Object[INIT_SIZE];
    private int pointer = 0;
    private int iterator = 0;

    /*
    Добавляет новый элемент в список. увеличение в два раза.
    */
    public void add(T item) {
        if(pointer == array.length-1)
            resize(array.length*2); // увеличу в 2 раза, если достигли границ
        array[pointer++] = item;
    }

    /*
    Возвращает элемент списка по индексу.
    */
    public T get(int index) {
        return (T) array[index];
    }

    public void remove(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;

    }
    //
    public int size() {
        return pointer;
    }

    //метод для масштабирования
    private void resize(int newLength) {
        T[] newArray =(T[]) new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    @Override
    public boolean hasNext() {
        return (iterator<pointer-1);
    }

    @Override
    public T next() {
        iterator++; //возвращает текущий элемент и переходит к следующему
        return array[iterator-1];
    }

    @Override
    public T remove() {
        T res = array[pointer-1];
        if (pointer>0){
            array = copyOf(array,pointer-1);
            pointer--;
        }
        return  res;
    }
    void iteratorToNull(){iterator=0;}
}


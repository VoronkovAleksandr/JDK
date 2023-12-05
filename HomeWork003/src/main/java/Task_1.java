/*
Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом, чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
 */

import java.util.Iterator;

public class Task_1<E> implements Iterable<E> {
    private E[] array;
    private Integer size;

    public Task_1() {
        this.array = (E[]) new Object[]{};
        this.size = 0;
    }

    public void addElement(E element) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[size] = element;
            array = (E[]) newArray;
        } else {
            array[size] = element;
        }
        size++;
    }

    public void removeElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[size - 1] = null;
        size--;
    }

    public void printList() {
        for (E e : array
        ) {
            System.out.print(e + " ");
        }
        System.out.println("size:" + size);
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyListIterator();
    }

    class MyListIterator implements Iterator<E>{


        int index;

        public MyListIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index<array.length;
        }
        @Override
        public E next() {
            return array[this.index++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
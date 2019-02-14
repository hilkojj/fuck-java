package week3.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MyStack<T> implements Iterable<T> {

    private ArrayList<T> list = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
       return new StackIterator();
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        return list.remove(list.size()-1);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    class StackIterator implements Iterator<T> {
        @Override
        public boolean hasNext() {
            return !isEmpty();
        }

        @Override
        public T next() {
            return pop();
        }
    }
}

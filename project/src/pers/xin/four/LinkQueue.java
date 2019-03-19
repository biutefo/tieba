package pers.xin.four;

import java.util.LinkedList;
import java.util.List;

public class LinkQueue<T> implements Queue {

    private List<T> elements;

    public LinkQueue() {
        this.elements = new LinkedList<T>();
    }

    @Override
    public void enqueue(Object e) {
        try {
            elements.add((T) e);
        } catch (Exception e1) {
            throw new RuntimeException("插入的元素类型错误！");
        }
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("队空！");
        }
        return elements.remove(0);
    }

    @Override
    public Object first() {
        if (isEmpty()) {
            throw new RuntimeException("队空！");
        }
        return elements.get(0);
    }

    @Override
    public boolean isEmpty() {
        return elements.size() == 0;
    }

    @Override
    public int size() {
        return elements.size();
    }
}

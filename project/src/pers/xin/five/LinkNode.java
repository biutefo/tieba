package pers.xin.five;

public class LinkNode<T> {
    private T element;
    private LinkNode<T> next;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public LinkNode<T> getNext() {
        return next;
    }

    public void setNext(LinkNode<T> next) {
        this.next = next;
    }
}

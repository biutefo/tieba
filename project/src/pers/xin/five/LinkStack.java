package pers.xin.five;

/**
 * 单向链表实现栈为了防止每一次出栈都要遍历找到最后一个元素，所以选择前插，这样就可以从头结点开始出栈
 * @param <T>
 */
public class LinkStack<T> {
    private LinkNode<T> top;

    public LinkStack() {
        this.top = null;
    }
    public void push(T t){
        if (top==null){
            top = new LinkNode<T>();
            top.setElement(t);
            return;
        }
        LinkNode<T> newNode = new LinkNode<T>();
        newNode.setElement(t);
        newNode.setNext(top);
        top=newNode;
    }
    public T pop(){
        if (isEmpty()){
            return null;
        }
        LinkNode<T> t=top;
        top = top.getNext();
        return t.getElement();
    }
    public  boolean isEmpty(){
        return top ==null;
    }

    @Override
    public String toString() {
        String s = "[";
        LinkNode<T> tempNode = top;
        while (tempNode!=null){
            s+=tempNode.getElement().toString()+"->";
            tempNode=tempNode.getNext();
        }
        s =s.substring(0,s.length()-2);
        s+="]";
        return s ;
    }
}

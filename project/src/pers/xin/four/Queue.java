package pers.xin.four;

public interface Queue<T> {
    /**
     * 入队
     *
     * @param e
     */
    public void enqueue(T e);

    /**
     * 出队
     *
     * @return
     */
    public T dequeue();//

    /**
     * 获取头元素
     *
     * @return
     */
    public T first();

    /**
     * 判断堆是否为空
     *
     * @return
     */
    public boolean isEmpty();

    /**
     * 队列中元素的个数
     *
     * @return
     */
    public int size();
}

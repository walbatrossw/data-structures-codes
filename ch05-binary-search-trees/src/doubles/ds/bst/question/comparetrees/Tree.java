package doubles.ds.bst.question.comparetrees;

public interface Tree<T> {

    public Node<T> getRoot();   // ��Ʈ��� ��ȯ
    public void insert(T data); // ����
    public T getMinValue();     // �ּҰ�
    public T getMaxValue();     // �ִ밪
    public void traversal();    // ��ȸ
    public void delete(T data); // ����

}

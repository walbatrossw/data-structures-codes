package doubles.ds.bst.question.comparetrees;

public class TreeCompareHelper<T extends Comparable<T>> {

    public boolean compareTrees(Node<T> node1, Node<T> node2) {

        // �� ��尡 leaf ������� üũ
        if (node1 == null || node2 == null) {
            return node1 == node2;
        }

        // ��尣�� ������ ��
        if (node1.getData().compareTo(node2.getData()) != 0) {
            return false;
        }

        // ���� ����Ʈ���� ���� ������ ����Ʈ���� ���� ��ġ�ϴ��� Ȯ���ϱ� ���� ���ȣ��
        return compareTrees(node1.getLeftChild(), node2.getLeftChild()) && compareTrees(node1.getRightChild(), node2.getRightChild());
    }
}

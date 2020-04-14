package linked;

public class Node {
    String item;
    Node next;

    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        first.item = "to";
        second.item = "be";
        third.item = "or";

        first.next = second;
        second.next = third;

        //头结点插入
        Node oldFirst = first;
        Node newFirst = new Node();

        newFirst.item = "not";
        newFirst.next = oldFirst;

        //删除头结点
        newFirst = newFirst.next;

        //尾节点插入
        Node oldLast = third;
        Node last = new Node();
        last.item = "last";
        oldLast.next = last;

        //链表的遍历
        for (Node node = newFirst; node != null; node = node.next) {
            System.out.print(node.item +" ");
        }
    }

}

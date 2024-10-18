package NodeList;

class Node {
    String data;
    Node next;

    public Node (String data) {
        this.data = data;
        this.next = null;
    }
}
 class NodeList {
    Node head;

    NodeList() {
        this.head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public boolean add (String data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        return true;
    }
    public boolean remove(int position){
        Node temp = head;
        int currentIndex = 0;

        if (isEmpty())
            return false;
        if (position == 0) {
            head = head.next;
            return true;
        }
        while (temp != null && currentIndex < position - 1) {
            temp = temp.next;
            currentIndex++;
        }
        temp.next = temp.next.next;
        return true;
    }
    public boolean peek () {
        if (!isEmpty()) {
            head = head.next;
            return true;
        }
        return false;
    }
    public void displayInfo () {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}


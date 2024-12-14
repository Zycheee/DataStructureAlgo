
class NodeList {
    Node head;

    NodeList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean add(String data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        return true;
    }

    public boolean remove(int position) {
        if (isEmpty()) { // Check if the list is empty
            return false;
        }

        if (position == 0) { // Remove the head node
            head = head.next;
            return true;
        }

        Node temp = head;
        int currentIndex = 0;

        // Traverse the list to find the node just before the target position
        while (temp != null && currentIndex < position - 1) {
            temp = temp.next;
            currentIndex++;
        }

        // Check if the position is valid
        if (temp == null || temp.next == null) {
            return false; // Position out of bounds
        }

        // Remove the node at the target position
        temp.next = temp.next.next;
        return true;
    }

    public Object peek() {
        if (!isEmpty()) {
            return head.data; // Return the data of the head node without modifying the list
        }
        return null;
    }

    public void displayInfo() {
        if (isEmpty()) {
            System.out.println("List is empty...");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
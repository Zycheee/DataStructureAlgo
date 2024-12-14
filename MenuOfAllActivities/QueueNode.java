
public class QueueNode {
    Node first;
    Node last;
    int count;

    public QueueNode() {
        first = null;
        last = null;
        count = 0;
    }

    public boolean isEmpty() {
        return first == null && last == null;
        //return count == 0;
    }

    public boolean enqueue(Object data) {
        Node newNode = new Node((String) data);
        if (isEmpty()) {
            //first = last = newNode;
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        count++;
        return true;
    }

    public boolean dequeue() {
        if (!isEmpty()) {
            if (first == last) {
                first = null;
                last = null;
            } else {
                first = first.next;
            }
            count--;
            return true;
        } else
            return false;
    }

    public Object getFirst() {
        if (!isEmpty())
            return first.data;
        else
            return null;
    }

    public Object getLast() {
        if (!isEmpty())
            return last.data;
        else
            return null;
    }

    //toString
    public String toString() {
        String result = "";
        if (!isEmpty()) {
            result += "first = [" + first.data + "]\n";
            result += "last  = [" + last.data + "]\n";

            Node temporary = first;
            while (temporary != null) {
                result += "[" + temporary.data + "]->";
                temporary = temporary.next;
            }
            result += "\n";
        }

        return result;
    }

    public void display() {
        if (!isEmpty()) {
            Node temporary = first;
            while (temporary != null) {
                System.out.print("[" + temporary.data + "]->");
                temporary = temporary.next;
            }
            System.out.println();
        } else
            System.out.println("Queue is empty...");
    }
}
